package com.bow.consumer;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.bow.api.main.model.SystemwareModel;
import com.bow.api.main.model.SystemwareModels;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;

//import jline.internal.InputStreamReader;

public class APIConsumer {
	
	@Autowired
	static
	Environment environment;
	
	//static String port = environment.getProperty("local.server.port");
	//static String ip   = environment.getProperty("local.server.address");
			
	
	public static void main(String[] args) throws IOException, RestClientException, URISyntaxException {
		
		InetAddress address = InetAddress.getLocalHost();
		//System.err.println(environment.getProperty("local.server.port"));
		//System.err.println(environment.getProperty("local.server.address"));
		RestTemplate restTemplate = new RestTemplate();
		String action = "search";
		String tplId = "GetStatements";
		String acctNum = "156124919";
		String primaryAccType = "DDA";
		String rmNum = "5845845";
		String uri = "http://localhost:8080/ci?action=" + action + "&tplid=" + tplId + "&acctnum=" + acctNum
				+ "&primaryaccttype=" + primaryAccType + "&rmnum=" + rmNum;
		System.err.println("URI to be hit is >>>" +uri);
		//SystemwareModels response = restTemplate.getForObject(uri, SystemwareModels.class);
		//String response = restTemplate.getForObject(uri, String.class);
		//ResponseEntity<String> response = restTemplate.getForEntity(new URI(uri), String.class);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		//URL url = new URL(uri);
		//HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		System.out.println("Response Headers ----->" +response.getHeaders());
		System.out.println("Response Body ----->" +response.getBody());
		System.out.println("Response String----->" +response.toString());
		
		/*List<SystemwareModel> modelList = response.getList();

		System.err.println("CUSTOMER INFORMATION *****");
		modelList.forEach(obj -> {
			System.out.println("Customer Name >>>" + obj.getCustomerName());
			System.out.println("Customer Account Number >>>" + obj.getAccountNumber());
			System.out.println("Customer Account Status >>>" + obj.getAccountStatus());
		});*/
		
		/**
		 * consuming secured https api
		 */
		DefaultClientConfig clientConfig = new DefaultClientConfig();
		try {
			SSLContext sslContext = SSLContext.getInstance("SSL");
			ServerTrustManager trustManager = new ServerTrustManager();
			sslContext.init(null, new TrustManager[] {trustManager}, null);
			clientConfig.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(null,sslContext));
			
			Client client = new Client();
			client.create(clientConfig);
			WebResource resource = client.resource(uri);
			ClientResponse clientResponse = resource.get(ClientResponse.class);
			String endResult = clientResponse.getEntity(String.class);
			
			System.out.println("Response ------>" +endResult);
			
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

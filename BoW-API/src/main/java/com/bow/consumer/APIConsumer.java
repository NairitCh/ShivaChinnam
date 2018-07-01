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

import com.bow.api.main.model.ResponseModel;
import com.bow.api.main.model.SystemwareModel;
import com.bow.api.main.model.SystemwareModels;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.client.urlconnection.HTTPSProperties;

//import jline.internal.InputStreamReader;

public class APIConsumer {
	
	public static void main(String[] args) throws IOException, RestClientException, URISyntaxException {
		
		InetAddress address = InetAddress.getLocalHost();
		XmlParser parser = new XmlParser();
		RestTemplate restTemplate = new RestTemplate();
		System.setProperty("javax.net.ssl.trustStore", "");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		System.setProperty("javax.net.ssl.keyStore", "");
		System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
		
		String logInUrl = "";
		
		/**
		 * login api call
		 */
		HttpHeaders loginHeaders = new HttpHeaders();
		loginHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		loginHeaders.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> loginEntity = new HttpEntity<>("parameters", loginHeaders);
		ResponseEntity<String> response = restTemplate.exchange(logInUrl, HttpMethod.GET, loginEntity, String.class);
		
		System.out.println("response Headers ----->" +response.getHeaders());
		System.out.println("response Body ----->" +response.getBody());
		System.out.println("response String----->" +response.toString());
		
		/**
		 * setting up headers for get statements
		 * api call
		 */
		
		List<ResponseModel> loginResponse = parser.parseXMLResponse(response.getBody().toString(), "login");
		String action = "search";
		String tplId = "GetStatements";
		String acctNum = "156124919";
		String primaryAccType = "DDA";
		String rmNum = "5845845";
		String uri = "http://localhost:8080/ci?action=" + action + "&tplid=" + tplId + "&acctnum=" + acctNum
				+ "&primaryaccttype=" + primaryAccType + "&rmnum=" + rmNum;
		System.err.println("URI to be hit is >>>" +uri);		
		
		HttpHeaders statementHeaders = new HttpHeaders();
		statementHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		statementHeaders.setContentType(MediaType.APPLICATION_XML);
		loginResponse.forEach(obj ->{
			//statementHeaders.set("sid", obj.getSessionId());
			statementHeaders.set("Cookie" ,"JSESSIONID="+obj.getjSessionId());
		});
		HttpEntity<String> statementEntity = new HttpEntity<>("parameters", statementHeaders);
		ResponseEntity<String> statementResponse = restTemplate.exchange(uri, HttpMethod.GET, statementEntity, String.class);
		
		System.out.println("statementResponse Headers ----->" +statementResponse.getHeaders());
		System.out.println("statementResponse Body ----->" +statementResponse.getBody());
		System.out.println("statementResponse String----->" +statementResponse.toString());
		
		/**
		 * pdf api call
		 */
		List<ResponseModel> statementList = parser.parseXMLResponse(statementResponse.getBody().toString(), "getStatement");
		
		String tId = statementList.get(2).gettId();
		
		String pdfUrl = "";
		
		HttpHeaders pdfHeaders = new HttpHeaders();
		pdfHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		pdfHeaders.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> pdfEntity = new HttpEntity<>("parameters", pdfHeaders);
		ResponseEntity<String> pdfResponse = restTemplate.exchange(pdfUrl, HttpMethod.GET, pdfEntity, String.class);
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		System.out.println("pdfResponse Headers ----->" +pdfResponse.getHeaders());
		System.out.println("pdfResponse Body ----->" +pdfResponse.getBody());
		System.out.println("pdfResponse String----->" +pdfResponse.toString());
		
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
		/*DefaultClientConfig clientConfig = new DefaultClientConfig();
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
		}*/
		
	}

}

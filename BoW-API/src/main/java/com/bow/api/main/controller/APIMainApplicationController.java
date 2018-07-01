package com.bow.api.main.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.bow.api.main.model.ResponseModel;
import com.bow.consumer.XmlParser;

@Controller
public class APIMainApplicationController {
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String defaultRender(Model model) {
		
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		String jsp;
		String jSessionId = null;
		System.out.println("inside log in method >>>");
		System.out.println("inside log in method >>>" +request.getParameter("username"));
		System.out.println("inside log in method >>>"+request.getParameter("password"));
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		XmlParser parser = new XmlParser();
		RestTemplate restTemplate = new RestTemplate();
		System.setProperty("javax.net.ssl.trustStore", "");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		System.setProperty("javax.net.ssl.keyStore", "");
		System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
		
		String logInUrl = "https://estdev.bankofwest.com/ci?action=login&username="+username+"password="+password;
		
		/**
		 * login api call
		 */
		HttpHeaders loginHeaders = new HttpHeaders();
		loginHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		loginHeaders.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> loginEntity = new HttpEntity<>("parameters", loginHeaders);
		ResponseEntity<String> loginResponse = restTemplate.exchange(logInUrl, HttpMethod.GET, loginEntity, String.class);
		
		System.out.println("response Headers ----->" +loginResponse.getHeaders());
		System.out.println("response Body ----->" +loginResponse.getBody());
		System.out.println("response String----->" +loginResponse.toString());
		
		List<ResponseModel> loginResponseList = parser.parseXMLResponse(loginResponse.getBody().toString(), "login");
		
		/*loginResponseList.forEach(obj ->{
			//statementHeaders.set("sid", obj.getSessionId());
			if(obj.getjSessionId()!=null && !obj.getjSessionId().isEmpty()) {
				jSessionId = obj.getjSessionId();
			}
			
			//statementHeaders.set("Cookie" ,"JSESSIONID="+obj.getjSessionId());
		});*/
		
		for(ResponseModel responseModel : loginResponseList) {
			jSessionId = responseModel.getjSessionId();
		}
		
		if(jSessionId!=null && !jSessionId.isEmpty()) {
			jsp = "home";
		} else {
			jsp = "error";
		}
		
		/**
		 * accessing the statement details as well
		 */
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
		loginResponseList.forEach(obj ->{
			//statementHeaders.set("sid", obj.getSessionId());
			statementHeaders.set("Cookie" ,"JSESSIONID="+obj.getjSessionId());
		});
		HttpEntity<String> statementEntity = new HttpEntity<>("parameters", statementHeaders);
		ResponseEntity<String> statementResponse = restTemplate.exchange(uri, HttpMethod.GET, statementEntity, String.class);
		
		System.out.println("statementResponse Headers ----->" +statementResponse.getHeaders());
		System.out.println("statementResponse Body ----->" +statementResponse.getBody());
		System.out.println("statementResponse String----->" +statementResponse.toString());
		
		model.addAttribute("response", statementResponse.getBody());
		
		return jsp;
	}
}

package com.bow.api.main.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLParser {
	
	static List<String> tidList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 	BufferedReader reader = new BufferedReader(new FileReader("D:\\Login_File.txt"));
			 	String xml = reader.readLine();
			 	System.out.println("ReadLine >>>" +xml);
			 	reader.close();
				File fXmlFile = new File("D:\\Systemware.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				InputSource is = new InputSource();
				is.setCharacterStream(new StringReader(xml));
				Document doc = dBuilder.parse(is);
						
				//optional, but recommended
				//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
				doc.getDocumentElement().normalize();

				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
						
				NodeList nList = doc.getElementsByTagName("session");
						
				System.out.println("----------------------------" +nList.getLength());

				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);
							
					System.out.println("\nCurrent Element :" + nNode.getNodeName());
							
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						
						//tidList.add(eElement.getAttribute("tid"));
						System.out.println("sid : " + eElement.getAttribute("sid"));
						System.out.println("jsessionid : " + eElement.getAttribute("jsessionid"));
						//System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
						//System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
						//System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
						//System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

					}
					
				}
				
				/*System.out.println("Size of tid List :" +tidList.size());
				
				tidList.forEach(obj -> {
					System.out.println("tid values :" +obj);
				});*/
				
			    } catch (Exception e) {
				e.printStackTrace();
			    }
	}

}

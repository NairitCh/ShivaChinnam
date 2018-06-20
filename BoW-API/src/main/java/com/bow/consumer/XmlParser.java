package com.bow.consumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.bow.api.main.model.ResponseModel;

public class XmlParser {

	public List<ResponseModel> parseXMLResponse(String xml, String category) {

		List<ResponseModel> modelList = new ArrayList<>();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xml));
			Document doc = dBuilder.parse(is);

			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			String tagName = "";
			switch (category) {
			case "login":
				tagName = "session";
				break;
			case "getStatement":
				tagName = "item";
				break;
			default:
				break;
			}
			
			NodeList nList = doc.getElementsByTagName(tagName);

			System.out.println("----------------------------" + nList.getLength());

			for (int temp = 0; temp < nList.getLength(); temp++) {
				
				ResponseModel model = new ResponseModel();
				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					
					switch (category) {
					case "login":
						model.setSessionId(eElement.getAttribute("sid"));
						model.setjSessionId(eElement.getAttribute("jsessionid"));
						break;
					case "getStatement":
						model.settId(eElement.getAttribute("tid"));
					default:
						break;
					}

					// tidList.add(eElement.getAttribute("tid"));
					//System.out.println("sid : " + eElement.getAttribute("sid"));
					//System.out.println("jsessionid : " + eElement.getAttribute("jsessionid"));
					// System.out.println("First Name : " +
					// eElement.getElementsByTagName("firstname").item(0).getTextContent());
					// System.out.println("Last Name : " +
					// eElement.getElementsByTagName("lastname").item(0).getTextContent());
					// System.out.println("Nick Name : " +
					// eElement.getElementsByTagName("nickname").item(0).getTextContent());
					// System.out.println("Salary : " +
					// eElement.getElementsByTagName("salary").item(0).getTextContent());
					modelList.add(model);
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return modelList;

	}

}

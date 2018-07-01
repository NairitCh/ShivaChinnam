package com.shiva.main;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.shiva.generated.AssignedIdentifier;
import com.shiva.generated.C20;
import com.shiva.generated.C255;
import com.shiva.generated.C50;
import com.shiva.generated.CodeListOwner;
import com.shiva.generated.CodeList_Type;
import com.shiva.generated.ComHanover_CommlPolicy_Type;
import com.shiva.generated.ComHanover_Form_Type;
import com.shiva.generated.DateTime;
import com.shiva.generated.FormsRequested;
import com.shiva.generated.IdentifierType;
import com.shiva.generated.ItemIdInfo_Type;
import com.shiva.generated.ObjectFactory;
import com.shiva.generated.OpenEnum;
import com.shiva.generated.OtherIdentifier_Type;
import com.shiva.generated.SpecialtyPolicyQuoteInqRq_Type;

public class XmlGenerator {

	public static void main(String[] args) {
		
		ObjectFactory factory = new ObjectFactory();
		
		SpecialtyPolicyQuoteInqRq_Type spl = factory.createSpecialtyPolicyQuoteInqRq_Type();
		spl.setRqUID("338DC94F-7ADB-8529-2F34-BB03062D9EE16298345010BBB4D6A58C180BF221A811");
		
		/**
		 * item id info tag of the sml
		 */
		ItemIdInfo_Type itemIdInfo = factory.createItemIdInfo_Type();
		itemIdInfo.setId("N1232");
		
		/**
		 * other identifier tag
		 */
		OtherIdentifier_Type otherIdentifier = factory.createOtherIdentifier_Type();
		otherIdentifier.setId("N1234");
		
		/**
		 * other id type code tag
		 */
		IdentifierType identifierType = factory.createIdentifierType();
		identifierType.setId("N1233");
		identifierType.setValue("RatingRqUID");
		otherIdentifier.getOtherIdTypeCd().add(identifierType);
		
		/**
		 * other id tag
		 */
		AssignedIdentifier assignedIdentifier = factory.createAssignedIdentifier();
		assignedIdentifier.setId("N1235");
		assignedIdentifier.setValue("c04e19c6-1937-4537-8925-7380d7655ecd");
		otherIdentifier.setOtherId(assignedIdentifier);
		
		itemIdInfo.getOtherIdentifier().add(otherIdentifier);
		spl.setItemIdInfo(itemIdInfo);
		
		/**
		 * transaction request dt tag
		 */
		DateTime dateTime = factory.createDateTime();
		dateTime.setId("N21");
		dateTime.setValue("2018-03-15");
		spl.setTransactionRequestDt(dateTime);
		
		/**
		 * curcd tag
		 */
		OpenEnum openEnum = factory.createOpenEnum();
		openEnum.setId("N22");
		openEnum.setValue("USD");
		spl.setCurCd(openEnum);
		
		/**
		 * 1st code list block starting at line 11
		 * of the sample xml
		 */
		CodeList_Type codeListType = factory.createCodeList_Type();
		codeListType.setId("N1417");
		C255 c255 = factory.createC255();
		c255.setId("N1418");
		c255.setValue("TRANSACTION-PROCESS-DATE");
		codeListType.setCodeListName(c255);
		CodeListOwner codeListOwner = factory.createCodeListOwner();
		codeListOwner.setId("N1419");
		codeListOwner.setValue("APEX");
		codeListType.setCodeListOwnerCd(codeListOwner);
		C255 c2551 = factory.createC255();
		c2551.setId("N1420");
		c2551.setValue("2018-03-15");
		codeListType.setDescription(c255);
		spl.getCodeList().add(codeListType);
		
		/**
		 * 2nd code list block at starting line 16
		 * of the sample xml
		 */
		CodeList_Type codeListType1 = factory.createCodeList_Type();
		codeListType1.setId("N1417");
		//C255 c2551 = factory.createC255();
		c2551.setId("N1423");
		c2551.setValue("SAR-CODE-6");
		codeListType1.setCodeListName(c255);
		CodeListOwner codeListOwner1 = factory.createCodeListOwner();
		codeListOwner1.setId("N1424");
		codeListOwner1.setValue("APEX");
		codeListType1.setCodeListOwnerCd(codeListOwner);
		//C255 c2551 = factory.createC255();
		c2551.setId("N1426");
		c2551.setValue("01");
		codeListType1.setDescription(c2551);
		C50 c50 = factory.createC50();
		c50.setId("N1425");
		c50.setValue("Cyber");
		codeListType1.setCodeListVersion(c50);
		spl.getCodeList().add(codeListType1);
		
		/**
		 * line 361 & 384 of the sample xml
		 */
		ComHanover_CommlPolicy_Type policyType = factory.createComHanover_CommlPolicy_Type();
		ComHanover_Form_Type formType = factory.createComHanover_Form_Type();
		formType.setId("N790");
		C20 c20 = factory.createC20();
		c20.setId("N791");
		c20.setValue("913-1001");
		formType.setFormNumber(c20);
		policyType.getForm().add(formType);
		//FormsRequested formsRequested = factory.createFormsRequested();
		//formsRequested.setId("N790");		
		//spl.getFileAttachmentInfo().add(e)
		spl.setCommlPolicy(policyType);
		
		try {
			JAXBContext context = JAXBContext.newInstance("com.shiva.generated");
			JAXBElement<SpecialtyPolicyQuoteInqRq_Type> element = factory.createSpecialtyPolicyQuoteInqRq(spl);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
			marshaller.marshal(element,System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

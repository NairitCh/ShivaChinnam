//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for com.hanover_EmailAttachmentInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_EmailAttachmentInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_EmailAttachmentID" minOccurs="0"/>
 *         &lt;element ref="{}AttachmentTypeCd" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ContentManagerID" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_AttachmentContentTxt" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_EmailAttachmentInfo_Type", propOrder = {
    "comHanover_EmailAttachmentID",
    "attachmentTypeCd",
    "comHanover_ContentManagerID",
    "comHanover_AttachmentContentTxt"
})
public class ComHanover_EmailAttachmentInfo_Type {

    @XmlElement(name = "com.hanover_EmailAttachmentID")
    protected C20 comHanover_EmailAttachmentID;
    @XmlElement(name = "AttachmentTypeCd")
    protected AttachmentType attachmentTypeCd;
    @XmlElement(name = "com.hanover_ContentManagerID")
    protected String comHanover_ContentManagerID;
    @XmlElement(name = "com.hanover_AttachmentContentTxt")
    protected String comHanover_AttachmentContentTxt;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the comHanover_EmailAttachmentID property.
     * 
     * @return
     *     possible object is
     *     {@link C20 }
     *     
     */
    public C20 getComHanover_EmailAttachmentID() {
        return comHanover_EmailAttachmentID;
    }

    /**
     * Sets the value of the comHanover_EmailAttachmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link C20 }
     *     
     */
    public void setComHanover_EmailAttachmentID(C20 value) {
        this.comHanover_EmailAttachmentID = value;
    }

    /**
     * Gets the value of the attachmentTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachmentTypeCd() {
        return attachmentTypeCd;
    }

    /**
     * Sets the value of the attachmentTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setAttachmentTypeCd(AttachmentType value) {
        this.attachmentTypeCd = value;
    }

    /**
     * Gets the value of the comHanover_ContentManagerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComHanover_ContentManagerID() {
        return comHanover_ContentManagerID;
    }

    /**
     * Sets the value of the comHanover_ContentManagerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComHanover_ContentManagerID(String value) {
        this.comHanover_ContentManagerID = value;
    }

    /**
     * Gets the value of the comHanover_AttachmentContentTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComHanover_AttachmentContentTxt() {
        return comHanover_AttachmentContentTxt;
    }

    /**
     * Sets the value of the comHanover_AttachmentContentTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComHanover_AttachmentContentTxt(String value) {
        this.comHanover_AttachmentContentTxt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
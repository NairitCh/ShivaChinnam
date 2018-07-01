//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for com.hanover_ProfLiabSupplementalInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_ProfLiabSupplementalInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_PageSectionCd"/>
 *         &lt;element ref="{}QuestionAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_ProfLiabSupplementalSubInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "com.hanover_ProfLiabSupplementalInfo_Type", propOrder = {
    "comHanover_PageSectionCd",
    "questionAnswer",
    "comHanover_ProfLiabSupplementalSubInfo"
})
public class ComHanover_ProfLiabSupplementalInfo_Type {

    @XmlElement(name = "com.hanover_PageSectionCd", required = true)
    protected OpenEnum comHanover_PageSectionCd;
    @XmlElement(name = "QuestionAnswer")
    protected List<ComHanover_QuestionAnswer_Type> questionAnswer;
    @XmlElement(name = "com.hanover_ProfLiabSupplementalSubInfo")
    protected List<ComHanover_ProfLiabSupplementalSubInfo_Type> comHanover_ProfLiabSupplementalSubInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the comHanover_PageSectionCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_PageSectionCd() {
        return comHanover_PageSectionCd;
    }

    /**
     * Sets the value of the comHanover_PageSectionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_PageSectionCd(OpenEnum value) {
        this.comHanover_PageSectionCd = value;
    }

    /**
     * Gets the value of the questionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the questionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_QuestionAnswer_Type }
     * 
     * 
     */
    public List<ComHanover_QuestionAnswer_Type> getQuestionAnswer() {
        if (questionAnswer == null) {
            questionAnswer = new ArrayList<ComHanover_QuestionAnswer_Type>();
        }
        return this.questionAnswer;
    }

    /**
     * Gets the value of the comHanoverProfLiabSupplementalSubInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comHanoverProfLiabSupplementalSubInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComHanover_ProfLiabSupplementalSubInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComHanover_ProfLiabSupplementalSubInfo_Type }
     * 
     * 
     */
    public List<ComHanover_ProfLiabSupplementalSubInfo_Type> getComHanover_ProfLiabSupplementalSubInfo() {
        if (comHanover_ProfLiabSupplementalSubInfo == null) {
            comHanover_ProfLiabSupplementalSubInfo = new ArrayList<ComHanover_ProfLiabSupplementalSubInfo_Type>();
        }
        return this.comHanover_ProfLiabSupplementalSubInfo;
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
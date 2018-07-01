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
 * <p>Java class for BusinessOperations_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessOperations_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DayCd" minOccurs="0"/>
 *         &lt;element ref="{}ManagerOnDutyInd" minOccurs="0"/>
 *         &lt;element ref="{}Operations24HourInd" minOccurs="0"/>
 *         &lt;element ref="{}BusinessHrs" minOccurs="0"/>
 *         &lt;element ref="{}AlcoholSalesHrs" minOccurs="0"/>
 *         &lt;element ref="{}FoodSalesHrs" minOccurs="0"/>
 *         &lt;element ref="{}EntertainmentDesc" minOccurs="0"/>
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
@XmlType(name = "BusinessOperations_Type", propOrder = {
    "dayCd",
    "managerOnDutyInd",
    "operations24HourInd",
    "businessHrs",
    "alcoholSalesHrs",
    "foodSalesHrs",
    "entertainmentDesc"
})
public class BusinessOperations_Type {

    @XmlElement(name = "DayCd")
    protected Days dayCd;
    @XmlElement(name = "ManagerOnDutyInd")
    protected Boolean managerOnDutyInd;
    @XmlElement(name = "Operations24HourInd")
    protected Boolean operations24HourInd;
    @XmlElement(name = "BusinessHrs")
    protected DURATION businessHrs;
    @XmlElement(name = "AlcoholSalesHrs")
    protected DURATION alcoholSalesHrs;
    @XmlElement(name = "FoodSalesHrs")
    protected DURATION foodSalesHrs;
    @XmlElement(name = "EntertainmentDesc")
    protected C255 entertainmentDesc;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the dayCd property.
     * 
     * @return
     *     possible object is
     *     {@link Days }
     *     
     */
    public Days getDayCd() {
        return dayCd;
    }

    /**
     * Sets the value of the dayCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Days }
     *     
     */
    public void setDayCd(Days value) {
        this.dayCd = value;
    }

    /**
     * Gets the value of the managerOnDutyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getManagerOnDutyInd() {
        return managerOnDutyInd;
    }

    /**
     * Sets the value of the managerOnDutyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagerOnDutyInd(Boolean value) {
        this.managerOnDutyInd = value;
    }

    /**
     * Gets the value of the operations24HourInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOperations24HourInd() {
        return operations24HourInd;
    }

    /**
     * Sets the value of the operations24HourInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOperations24HourInd(Boolean value) {
        this.operations24HourInd = value;
    }

    /**
     * Gets the value of the businessHrs property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getBusinessHrs() {
        return businessHrs;
    }

    /**
     * Sets the value of the businessHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setBusinessHrs(DURATION value) {
        this.businessHrs = value;
    }

    /**
     * Gets the value of the alcoholSalesHrs property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getAlcoholSalesHrs() {
        return alcoholSalesHrs;
    }

    /**
     * Sets the value of the alcoholSalesHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setAlcoholSalesHrs(DURATION value) {
        this.alcoholSalesHrs = value;
    }

    /**
     * Gets the value of the foodSalesHrs property.
     * 
     * @return
     *     possible object is
     *     {@link DURATION }
     *     
     */
    public DURATION getFoodSalesHrs() {
        return foodSalesHrs;
    }

    /**
     * Sets the value of the foodSalesHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DURATION }
     *     
     */
    public void setFoodSalesHrs(DURATION value) {
        this.foodSalesHrs = value;
    }

    /**
     * Gets the value of the entertainmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getEntertainmentDesc() {
        return entertainmentDesc;
    }

    /**
     * Sets the value of the entertainmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setEntertainmentDesc(C255 value) {
        this.entertainmentDesc = value;
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
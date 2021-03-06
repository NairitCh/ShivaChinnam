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
 * <p>Java class for com.hanover_ForeignTravel_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_ForeignTravel_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_NumAnnualTrips" minOccurs="0"/>
 *         &lt;element ref="{}CountryCd" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_AvgLengthOfStay" minOccurs="0"/>
 *         &lt;element ref="{}NumEmployeesTravel" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_NumIndContractorsTravel" minOccurs="0"/>
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
@XmlType(name = "com.hanover_ForeignTravel_Type", propOrder = {
    "comHanover_NumAnnualTrips",
    "countryCd",
    "comHanover_AvgLengthOfStay",
    "numEmployeesTravel",
    "comHanover_NumIndContractorsTravel"
})
public class ComHanover_ForeignTravel_Type {

    @XmlElement(name = "com.hanover_NumAnnualTrips")
    protected Long comHanover_NumAnnualTrips;
    @XmlElement(name = "CountryCd")
    protected OpenEnum countryCd;
    @XmlElement(name = "com.hanover_AvgLengthOfStay")
    protected Long comHanover_AvgLengthOfStay;
    @XmlElement(name = "NumEmployeesTravel")
    protected Long numEmployeesTravel;
    @XmlElement(name = "com.hanover_NumIndContractorsTravel")
    protected Long comHanover_NumIndContractorsTravel;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the comHanover_NumAnnualTrips property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumAnnualTrips() {
        return comHanover_NumAnnualTrips;
    }

    /**
     * Sets the value of the comHanover_NumAnnualTrips property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumAnnualTrips(Long value) {
        this.comHanover_NumAnnualTrips = value;
    }

    /**
     * Gets the value of the countryCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getCountryCd() {
        return countryCd;
    }

    /**
     * Sets the value of the countryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setCountryCd(OpenEnum value) {
        this.countryCd = value;
    }

    /**
     * Gets the value of the comHanover_AvgLengthOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_AvgLengthOfStay() {
        return comHanover_AvgLengthOfStay;
    }

    /**
     * Sets the value of the comHanover_AvgLengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_AvgLengthOfStay(Long value) {
        this.comHanover_AvgLengthOfStay = value;
    }

    /**
     * Gets the value of the numEmployeesTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployeesTravel() {
        return numEmployeesTravel;
    }

    /**
     * Sets the value of the numEmployeesTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployeesTravel(Long value) {
        this.numEmployeesTravel = value;
    }

    /**
     * Gets the value of the comHanover_NumIndContractorsTravel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComHanover_NumIndContractorsTravel() {
        return comHanover_NumIndContractorsTravel;
    }

    /**
     * Sets the value of the comHanover_NumIndContractorsTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComHanover_NumIndContractorsTravel(Long value) {
        this.comHanover_NumIndContractorsTravel = value;
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

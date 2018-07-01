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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * Add
 * Deductible
 * Limit
 * OtherIdentifer
 * 
 * <p>Java class for com.hanover_LiabilityInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_LiabilityInfo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}LiabilityInfo_Type">
 *       &lt;sequence>
 *         &lt;element ref="{}Deductible" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Limit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Option" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OtherIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LocationRef" type="{}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_LiabilityInfo_Type", propOrder = {
    "deductible",
    "limit",
    "option",
    "otherIdentifier"
})
public class ComHanover_LiabilityInfo_Type
    extends LiabilityInfo_Type
{

    @XmlElement(name = "Deductible")
    protected List<Deductible_Type> deductible;
    @XmlElement(name = "Limit")
    protected List<Limit_Type> limit;
    @XmlElement(name = "Option")
    protected List<Option_Type> option;
    @XmlElement(name = "OtherIdentifier")
    protected List<OtherIdentifier_Type> otherIdentifier;
    @XmlAttribute(name = "LocationRef")
    @XmlIDREF
    protected Object locationRef;

    /**
     * Gets the value of the deductible property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductible property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductible().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Deductible_Type }
     * 
     * 
     */
    public List<Deductible_Type> getDeductible() {
        if (deductible == null) {
            deductible = new ArrayList<Deductible_Type>();
        }
        return this.deductible;
    }

    /**
     * Gets the value of the limit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Limit_Type }
     * 
     * 
     */
    public List<Limit_Type> getLimit() {
        if (limit == null) {
            limit = new ArrayList<Limit_Type>();
        }
        return this.limit;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option_Type }
     * 
     * 
     */
    public List<Option_Type> getOption() {
        if (option == null) {
            option = new ArrayList<Option_Type>();
        }
        return this.option;
    }

    /**
     * Gets the value of the otherIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherIdentifier_Type }
     * 
     * 
     */
    public List<OtherIdentifier_Type> getOtherIdentifier() {
        if (otherIdentifier == null) {
            otherIdentifier = new ArrayList<OtherIdentifier_Type>();
        }
        return this.otherIdentifier;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLocationRef(Object value) {
        this.locationRef = value;
    }

}
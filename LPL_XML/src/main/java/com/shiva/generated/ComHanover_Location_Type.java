//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.01 at 09:59:34 AM IST 
//


package com.shiva.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for com.hanover_Location_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_Location_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}Location_Type">
 *       &lt;sequence>
 *         &lt;element ref="{}Limit" minOccurs="0"/>
 *         &lt;element ref="{}CommlPropertySchedule" minOccurs="0"/>
 *         &lt;element ref="{}Deductible" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_Location_Type", propOrder = {
    "limit",
    "commlPropertySchedule",
    "deductible"
})
public class ComHanover_Location_Type
    extends Location_Type
{

    @XmlElement(name = "Limit")
    protected Limit_Type limit;
    @XmlElement(name = "CommlPropertySchedule")
    protected CommlPropertySchedule_Type commlPropertySchedule;
    @XmlElement(name = "Deductible")
    protected Deductible_Type deductible;

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Limit_Type }
     *     
     */
    public Limit_Type getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Limit_Type }
     *     
     */
    public void setLimit(Limit_Type value) {
        this.limit = value;
    }

    /**
     * Gets the value of the commlPropertySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommlPropertySchedule_Type }
     *     
     */
    public CommlPropertySchedule_Type getCommlPropertySchedule() {
        return commlPropertySchedule;
    }

    /**
     * Sets the value of the commlPropertySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommlPropertySchedule_Type }
     *     
     */
    public void setCommlPropertySchedule(CommlPropertySchedule_Type value) {
        this.commlPropertySchedule = value;
    }

    /**
     * Gets the value of the deductible property.
     * 
     * @return
     *     possible object is
     *     {@link Deductible_Type }
     *     
     */
    public Deductible_Type getDeductible() {
        return deductible;
    }

    /**
     * Sets the value of the deductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deductible_Type }
     *     
     */
    public void setDeductible(Deductible_Type value) {
        this.deductible = value;
    }

}
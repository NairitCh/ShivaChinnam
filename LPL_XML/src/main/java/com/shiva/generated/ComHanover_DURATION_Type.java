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
 * <p>Java class for com.hanover_DURATION_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_DURATION_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}DURATION">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_PeriodCd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_DURATION_Type", propOrder = {
    "comHanover_PeriodCd"
})
public class ComHanover_DURATION_Type
    extends DURATION
{

    @XmlElement(name = "com.hanover_PeriodCd")
    protected OpenEnum comHanover_PeriodCd;

    /**
     * Gets the value of the comHanover_PeriodCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getComHanover_PeriodCd() {
        return comHanover_PeriodCd;
    }

    /**
     * Sets the value of the comHanover_PeriodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setComHanover_PeriodCd(OpenEnum value) {
        this.comHanover_PeriodCd = value;
    }

}

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
 * <p>Java class for Deductible_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Deductible_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}PCDEDUCTIBLE">
 *       &lt;sequence>
 *         &lt;element ref="{}IndexAdjustment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Deductible_Type", propOrder = {
    "indexAdjustment"
})
public class Deductible_Type
    extends PCDEDUCTIBLE
{

    @XmlElement(name = "IndexAdjustment")
    protected IndexAdjustment_Type indexAdjustment;

    /**
     * Gets the value of the indexAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link IndexAdjustment_Type }
     *     
     */
    public IndexAdjustment_Type getIndexAdjustment() {
        return indexAdjustment;
    }

    /**
     * Sets the value of the indexAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexAdjustment_Type }
     *     
     */
    public void setIndexAdjustment(IndexAdjustment_Type value) {
        this.indexAdjustment = value;
    }

}

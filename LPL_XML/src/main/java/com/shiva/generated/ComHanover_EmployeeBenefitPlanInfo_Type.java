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
 * <p>Java class for com.hanover_EmployeeBenefitPlanInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="com.hanover_EmployeeBenefitPlanInfo_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{}EmployeeBenefitPlanInfo_Type">
 *       &lt;sequence>
 *         &lt;element ref="{}com.hanover_ThirdPartyAdmin" minOccurs="0"/>
 *         &lt;element ref="{}com.hanover_OverUnderFundingInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "com.hanover_EmployeeBenefitPlanInfo_Type", propOrder = {
    "comHanover_ThirdPartyAdmin",
    "comHanover_OverUnderFundingInd"
})
public class ComHanover_EmployeeBenefitPlanInfo_Type
    extends EmployeeBenefitPlanInfo_Type
{

    @XmlElement(name = "com.hanover_ThirdPartyAdmin")
    protected C255 comHanover_ThirdPartyAdmin;
    @XmlElement(name = "com.hanover_OverUnderFundingInd")
    protected Boolean comHanover_OverUnderFundingInd;

    /**
     * Gets the value of the comHanover_ThirdPartyAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getComHanover_ThirdPartyAdmin() {
        return comHanover_ThirdPartyAdmin;
    }

    /**
     * Sets the value of the comHanover_ThirdPartyAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setComHanover_ThirdPartyAdmin(C255 value) {
        this.comHanover_ThirdPartyAdmin = value;
    }

    /**
     * Gets the value of the comHanover_OverUnderFundingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getComHanover_OverUnderFundingInd() {
        return comHanover_OverUnderFundingInd;
    }

    /**
     * Sets the value of the comHanover_OverUnderFundingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComHanover_OverUnderFundingInd(Boolean value) {
        this.comHanover_OverUnderFundingInd = value;
    }

}

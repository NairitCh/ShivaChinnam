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
 * <p>Java class for Rating_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rating_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}CreditOrSurcharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MinMaxCd" minOccurs="0"/>
 *         &lt;element ref="{}RateLevelNumber" minOccurs="0"/>
 *         &lt;element ref="{}RatingBottomRange" minOccurs="0"/>
 *         &lt;element ref="{}RatingTopRange" minOccurs="0"/>
 *         &lt;element ref="{}RatingScaleCd" minOccurs="0"/>
 *         &lt;element ref="{}RateBaseAmt" minOccurs="0"/>
 *         &lt;element ref="{}PremiumBillingInfo" minOccurs="0"/>
 *         &lt;element ref="{}Exposure" minOccurs="0"/>
 *         &lt;element ref="{}PremiumBasisCd" minOccurs="0"/>
 *         &lt;element ref="{}Rate" minOccurs="0"/>
 *         &lt;element ref="{}PremiumRateCd" minOccurs="0"/>
 *         &lt;element ref="{}RangeInfo" minOccurs="0"/>
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
@XmlType(name = "Rating_Type", propOrder = {
    "creditOrSurcharge",
    "minMaxCd",
    "rateLevelNumber",
    "ratingBottomRange",
    "ratingTopRange",
    "ratingScaleCd",
    "rateBaseAmt",
    "premiumBillingInfo",
    "exposure",
    "premiumBasisCd",
    "rate",
    "premiumRateCd",
    "rangeInfo"
})
public class Rating_Type {

    @XmlElement(name = "CreditOrSurcharge")
    protected List<PCCREDITSURCHARGE> creditOrSurcharge;
    @XmlElement(name = "MinMaxCd")
    protected MinMax minMaxCd;
    @XmlElement(name = "RateLevelNumber")
    protected Long rateLevelNumber;
    @XmlElement(name = "RatingBottomRange")
    protected Long ratingBottomRange;
    @XmlElement(name = "RatingTopRange")
    protected Long ratingTopRange;
    @XmlElement(name = "RatingScaleCd")
    protected PremiumBase ratingScaleCd;
    @XmlElement(name = "RateBaseAmt")
    protected CURRENCY rateBaseAmt;
    @XmlElement(name = "PremiumBillingInfo")
    protected PremiumBillingInfo_Type premiumBillingInfo;
    @XmlElement(name = "Exposure")
    protected Decimal exposure;
    @XmlElement(name = "PremiumBasisCd")
    protected PremiumBase premiumBasisCd;
    @XmlElement(name = "Rate")
    protected Decimal rate;
    @XmlElement(name = "PremiumRateCd")
    protected RateScaleType premiumRateCd;
    @XmlElement(name = "RangeInfo")
    protected RangeInfo_Type rangeInfo;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the creditOrSurcharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditOrSurcharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditOrSurcharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PCCREDITSURCHARGE }
     * 
     * 
     */
    public List<PCCREDITSURCHARGE> getCreditOrSurcharge() {
        if (creditOrSurcharge == null) {
            creditOrSurcharge = new ArrayList<PCCREDITSURCHARGE>();
        }
        return this.creditOrSurcharge;
    }

    /**
     * Gets the value of the minMaxCd property.
     * 
     * @return
     *     possible object is
     *     {@link MinMax }
     *     
     */
    public MinMax getMinMaxCd() {
        return minMaxCd;
    }

    /**
     * Sets the value of the minMaxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMax }
     *     
     */
    public void setMinMaxCd(MinMax value) {
        this.minMaxCd = value;
    }

    /**
     * Gets the value of the rateLevelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateLevelNumber() {
        return rateLevelNumber;
    }

    /**
     * Sets the value of the rateLevelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateLevelNumber(Long value) {
        this.rateLevelNumber = value;
    }

    /**
     * Gets the value of the ratingBottomRange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRatingBottomRange() {
        return ratingBottomRange;
    }

    /**
     * Sets the value of the ratingBottomRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRatingBottomRange(Long value) {
        this.ratingBottomRange = value;
    }

    /**
     * Gets the value of the ratingTopRange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRatingTopRange() {
        return ratingTopRange;
    }

    /**
     * Sets the value of the ratingTopRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRatingTopRange(Long value) {
        this.ratingTopRange = value;
    }

    /**
     * Gets the value of the ratingScaleCd property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumBase }
     *     
     */
    public PremiumBase getRatingScaleCd() {
        return ratingScaleCd;
    }

    /**
     * Sets the value of the ratingScaleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumBase }
     *     
     */
    public void setRatingScaleCd(PremiumBase value) {
        this.ratingScaleCd = value;
    }

    /**
     * Gets the value of the rateBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CURRENCY }
     *     
     */
    public CURRENCY getRateBaseAmt() {
        return rateBaseAmt;
    }

    /**
     * Sets the value of the rateBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CURRENCY }
     *     
     */
    public void setRateBaseAmt(CURRENCY value) {
        this.rateBaseAmt = value;
    }

    /**
     * Gets the value of the premiumBillingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumBillingInfo_Type }
     *     
     */
    public PremiumBillingInfo_Type getPremiumBillingInfo() {
        return premiumBillingInfo;
    }

    /**
     * Sets the value of the premiumBillingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumBillingInfo_Type }
     *     
     */
    public void setPremiumBillingInfo(PremiumBillingInfo_Type value) {
        this.premiumBillingInfo = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getExposure() {
        return exposure;
    }

    /**
     * Sets the value of the exposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setExposure(Decimal value) {
        this.exposure = value;
    }

    /**
     * Gets the value of the premiumBasisCd property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumBase }
     *     
     */
    public PremiumBase getPremiumBasisCd() {
        return premiumBasisCd;
    }

    /**
     * Sets the value of the premiumBasisCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumBase }
     *     
     */
    public void setPremiumBasisCd(PremiumBase value) {
        this.premiumBasisCd = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setRate(Decimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the premiumRateCd property.
     * 
     * @return
     *     possible object is
     *     {@link RateScaleType }
     *     
     */
    public RateScaleType getPremiumRateCd() {
        return premiumRateCd;
    }

    /**
     * Sets the value of the premiumRateCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateScaleType }
     *     
     */
    public void setPremiumRateCd(RateScaleType value) {
        this.premiumRateCd = value;
    }

    /**
     * Gets the value of the rangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RangeInfo_Type }
     *     
     */
    public RangeInfo_Type getRangeInfo() {
        return rangeInfo;
    }

    /**
     * Sets the value of the rangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeInfo_Type }
     *     
     */
    public void setRangeInfo(RangeInfo_Type value) {
        this.rangeInfo = value;
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

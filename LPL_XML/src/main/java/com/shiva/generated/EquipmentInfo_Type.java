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
 * <p>Java class for EquipmentInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}EquipmentSizeCd" minOccurs="0"/>
 *         &lt;element ref="{}OperationsDesc" minOccurs="0"/>
 *         &lt;element ref="{}StorageInfo" minOccurs="0"/>
 *         &lt;element ref="{}InstructProvidedInd" minOccurs="0"/>
 *         &lt;element ref="{}OperationsRadius" minOccurs="0"/>
 *         &lt;group ref="{}REGION_CHOICE" minOccurs="0"/>
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
@XmlType(name = "EquipmentInfo_Type", propOrder = {
    "equipmentSizeCd",
    "operationsDesc",
    "storageInfo",
    "instructProvidedInd",
    "operationsRadius",
    "region",
    "regionCd"
})
public class EquipmentInfo_Type {

    @XmlElement(name = "EquipmentSizeCd")
    protected EquipmentSize equipmentSizeCd;
    @XmlElement(name = "OperationsDesc")
    protected C255 operationsDesc;
    @XmlElement(name = "StorageInfo")
    protected StorageInfo_Type storageInfo;
    @XmlElement(name = "InstructProvidedInd")
    protected Boolean instructProvidedInd;
    @XmlElement(name = "OperationsRadius")
    protected MEASUREMENT operationsRadius;
    @XmlElement(name = "Region")
    protected C255 region;
    @XmlElement(name = "RegionCd")
    protected OpenEnum regionCd;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the equipmentSizeCd property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentSize }
     *     
     */
    public EquipmentSize getEquipmentSizeCd() {
        return equipmentSizeCd;
    }

    /**
     * Sets the value of the equipmentSizeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentSize }
     *     
     */
    public void setEquipmentSizeCd(EquipmentSize value) {
        this.equipmentSizeCd = value;
    }

    /**
     * Gets the value of the operationsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getOperationsDesc() {
        return operationsDesc;
    }

    /**
     * Sets the value of the operationsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setOperationsDesc(C255 value) {
        this.operationsDesc = value;
    }

    /**
     * Gets the value of the storageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StorageInfo_Type }
     *     
     */
    public StorageInfo_Type getStorageInfo() {
        return storageInfo;
    }

    /**
     * Sets the value of the storageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageInfo_Type }
     *     
     */
    public void setStorageInfo(StorageInfo_Type value) {
        this.storageInfo = value;
    }

    /**
     * Gets the value of the instructProvidedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInstructProvidedInd() {
        return instructProvidedInd;
    }

    /**
     * Sets the value of the instructProvidedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstructProvidedInd(Boolean value) {
        this.instructProvidedInd = value;
    }

    /**
     * Gets the value of the operationsRadius property.
     * 
     * @return
     *     possible object is
     *     {@link MEASUREMENT }
     *     
     */
    public MEASUREMENT getOperationsRadius() {
        return operationsRadius;
    }

    /**
     * Sets the value of the operationsRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEASUREMENT }
     *     
     */
    public void setOperationsRadius(MEASUREMENT value) {
        this.operationsRadius = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link C255 }
     *     
     */
    public C255 getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link C255 }
     *     
     */
    public void setRegion(C255 value) {
        this.region = value;
    }

    /**
     * Gets the value of the regionCd property.
     * 
     * @return
     *     possible object is
     *     {@link OpenEnum }
     *     
     */
    public OpenEnum getRegionCd() {
        return regionCd;
    }

    /**
     * Sets the value of the regionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenEnum }
     *     
     */
    public void setRegionCd(OpenEnum value) {
        this.regionCd = value;
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

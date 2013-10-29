
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ucdDispensingUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucdDispensingUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispensingUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="posologyUnits" type="{urn:Vidal}ArrayOfRatioPosologyUnit"/>
 *         &lt;element name="ucdItemQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItemQuantityUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="ucdItemVolume" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItemVolumeUnit" type="{urn:Vidal}posologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucdDispensingUnit", propOrder = {
    "dispensingUnit",
    "posologyUnits",
    "ucdItemQuantity",
    "ucdItemQuantityUnit",
    "ucdItemVolume",
    "ucdItemVolumeUnit"
})
public class UcdDispensingUnit {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit dispensingUnit;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRatioPosologyUnit posologyUnits;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ucdItemQuantity;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit ucdItemQuantityUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ucdItemVolume;
    @XmlElement(required = true, nillable = true)
    protected PosologyUnit ucdItemVolumeUnit;

    /**
     * Gets the value of the dispensingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getDispensingUnit() {
        return dispensingUnit;
    }

    /**
     * Sets the value of the dispensingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setDispensingUnit(PosologyUnit value) {
        this.dispensingUnit = value;
    }

    /**
     * Gets the value of the posologyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRatioPosologyUnit }
     *     
     */
    public ArrayOfRatioPosologyUnit getPosologyUnits() {
        return posologyUnits;
    }

    /**
     * Sets the value of the posologyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRatioPosologyUnit }
     *     
     */
    public void setPosologyUnits(ArrayOfRatioPosologyUnit value) {
        this.posologyUnits = value;
    }

    /**
     * Gets the value of the ucdItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUcdItemQuantity() {
        return ucdItemQuantity;
    }

    /**
     * Sets the value of the ucdItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUcdItemQuantity(Float value) {
        this.ucdItemQuantity = value;
    }

    /**
     * Gets the value of the ucdItemQuantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getUcdItemQuantityUnit() {
        return ucdItemQuantityUnit;
    }

    /**
     * Sets the value of the ucdItemQuantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setUcdItemQuantityUnit(PosologyUnit value) {
        this.ucdItemQuantityUnit = value;
    }

    /**
     * Gets the value of the ucdItemVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUcdItemVolume() {
        return ucdItemVolume;
    }

    /**
     * Sets the value of the ucdItemVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUcdItemVolume(Float value) {
        this.ucdItemVolume = value;
    }

    /**
     * Gets the value of the ucdItemVolumeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getUcdItemVolumeUnit() {
        return ucdItemVolumeUnit;
    }

    /**
     * Sets the value of the ucdItemVolumeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setUcdItemVolumeUnit(PosologyUnit value) {
        this.ucdItemVolumeUnit = value;
    }

}

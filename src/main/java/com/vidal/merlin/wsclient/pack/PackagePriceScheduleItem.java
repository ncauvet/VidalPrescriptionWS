
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for packagePriceScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packagePriceScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="manufacturerPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="publicPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="reference" type="{urn:Vidal}reference"/>
 *         &lt;element name="refundBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="vatRate" type="{urn:Vidal}VatRate"/>
 *         &lt;element name="vatRateValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packagePriceScheduleItem", propOrder = {
    "endDate",
    "manufacturerPrice",
    "publicPrice",
    "reference",
    "refundBase",
    "startDate",
    "vatRate",
    "vatRateValue"
})
public class PackagePriceScheduleItem {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float manufacturerPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float publicPrice;
    @XmlElement(required = true, nillable = true)
    protected Reference reference;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundBase;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, nillable = true)
    protected VatRate vatRate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float vatRateValue;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the manufacturerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getManufacturerPrice() {
        return manufacturerPrice;
    }

    /**
     * Sets the value of the manufacturerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setManufacturerPrice(Float value) {
        this.manufacturerPrice = value;
    }

    /**
     * Gets the value of the publicPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPublicPrice() {
        return publicPrice;
    }

    /**
     * Sets the value of the publicPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPublicPrice(Float value) {
        this.publicPrice = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the refundBase property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefundBase() {
        return refundBase;
    }

    /**
     * Sets the value of the refundBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefundBase(Float value) {
        this.refundBase = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link VatRate }
     *     
     */
    public VatRate getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRate }
     *     
     */
    public void setVatRate(VatRate value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the vatRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVatRateValue() {
        return vatRateValue;
    }

    /**
     * Sets the value of the vatRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVatRateValue(Float value) {
        this.vatRateValue = value;
    }

}

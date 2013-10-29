
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for lpprReimbursementScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lpprReimbursementScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{urn:Vidal}reference"/>
 *         &lt;element name="refundBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="salePriceLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transferPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprReimbursementScheduleItem", propOrder = {
    "reference",
    "refundBase",
    "salePriceLimit",
    "startDate",
    "transferPrice"
})
public class LpprReimbursementScheduleItem {

    @XmlElement(required = true, nillable = true)
    protected Reference reference;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundBase;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float salePriceLimit;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float transferPrice;

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
     * Gets the value of the salePriceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalePriceLimit() {
        return salePriceLimit;
    }

    /**
     * Sets the value of the salePriceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalePriceLimit(Float value) {
        this.salePriceLimit = value;
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
     * Gets the value of the transferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTransferPrice() {
        return transferPrice;
    }

    /**
     * Sets the value of the transferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTransferPrice(Float value) {
        this.transferPrice = value;
    }

}

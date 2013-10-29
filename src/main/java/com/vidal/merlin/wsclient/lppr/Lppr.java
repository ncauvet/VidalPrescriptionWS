
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for lppr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lppr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actCode" type="{urn:Vidal}ActCode"/>
 *         &lt;element name="actCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghsEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="refundRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salePriceLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="service" type="{urn:Vidal}LpprServiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lppr", propOrder = {
    "actCode",
    "actCodeValue",
    "code",
    "ghsEffectiveDate",
    "id",
    "name",
    "refundBase",
    "refundRate",
    "refundRateValue",
    "salePriceLimit",
    "service"
})
public class Lppr {

    @XmlElement(required = true, nillable = true)
    protected ActCode actCode;
    @XmlElement(required = true, nillable = true)
    protected String actCodeValue;
    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ghsEffectiveDate;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected double refundBase;
    @XmlElement(required = true, nillable = true)
    protected String refundRate;
    @XmlElement(required = true, nillable = true)
    protected String refundRateValue;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double salePriceLimit;
    @XmlElement(required = true, nillable = true)
    protected LpprServiceType service;

    /**
     * Gets the value of the actCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActCode }
     *     
     */
    public ActCode getActCode() {
        return actCode;
    }

    /**
     * Sets the value of the actCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActCode }
     *     
     */
    public void setActCode(ActCode value) {
        this.actCode = value;
    }

    /**
     * Gets the value of the actCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActCodeValue() {
        return actCodeValue;
    }

    /**
     * Sets the value of the actCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActCodeValue(String value) {
        this.actCodeValue = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the ghsEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGhsEffectiveDate() {
        return ghsEffectiveDate;
    }

    /**
     * Sets the value of the ghsEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGhsEffectiveDate(XMLGregorianCalendar value) {
        this.ghsEffectiveDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the refundBase property.
     * 
     */
    public double getRefundBase() {
        return refundBase;
    }

    /**
     * Sets the value of the refundBase property.
     * 
     */
    public void setRefundBase(double value) {
        this.refundBase = value;
    }

    /**
     * Gets the value of the refundRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRate() {
        return refundRate;
    }

    /**
     * Sets the value of the refundRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRate(String value) {
        this.refundRate = value;
    }

    /**
     * Gets the value of the refundRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundRateValue() {
        return refundRateValue;
    }

    /**
     * Sets the value of the refundRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundRateValue(String value) {
        this.refundRateValue = value;
    }

    /**
     * Gets the value of the salePriceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalePriceLimit() {
        return salePriceLimit;
    }

    /**
     * Sets the value of the salePriceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalePriceLimit(Double value) {
        this.salePriceLimit = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link LpprServiceType }
     *     
     */
    public LpprServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprServiceType }
     *     
     */
    public void setService(LpprServiceType value) {
        this.service = value;
    }

}

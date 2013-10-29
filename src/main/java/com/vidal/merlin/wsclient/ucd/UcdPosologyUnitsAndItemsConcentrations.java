
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ucdPosologyUnitsAndItemsConcentrations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucdPosologyUnitsAndItemsConcentrations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ghs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ghsEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ghsPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="retrocession" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="retrocessionEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="retrocessionPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="ucdItems" type="{urn:Vidal}ArrayOfUcdItem"/>
 *         &lt;element name="ucdPosologyUnits" type="{urn:Vidal}ArrayOfUcdPosologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucdPosologyUnitsAndItemsConcentrations", propOrder = {
    "code",
    "code13",
    "ghs",
    "ghsEffectiveDate",
    "ghsPrice",
    "id",
    "marketStatus",
    "name",
    "retrocession",
    "retrocessionEffectiveDate",
    "retrocessionPrice",
    "ucdItems",
    "ucdPosologyUnits"
})
public class UcdPosologyUnitsAndItemsConcentrations {

    @XmlElement(required = true, nillable = true)
    protected String code;
    @XmlElement(required = true, nillable = true)
    protected String code13;
    protected boolean ghs;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ghsEffectiveDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ghsPrice;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean retrocession;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar retrocessionEffectiveDate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float retrocessionPrice;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdItem ucdItems;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdPosologyUnit ucdPosologyUnits;

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
     * Gets the value of the code13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode13() {
        return code13;
    }

    /**
     * Sets the value of the code13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode13(String value) {
        this.code13 = value;
    }

    /**
     * Gets the value of the ghs property.
     * 
     */
    public boolean isGhs() {
        return ghs;
    }

    /**
     * Sets the value of the ghs property.
     * 
     */
    public void setGhs(boolean value) {
        this.ghs = value;
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
     * Gets the value of the ghsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGhsPrice() {
        return ghsPrice;
    }

    /**
     * Sets the value of the ghsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGhsPrice(Float value) {
        this.ghsPrice = value;
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
     * Gets the value of the marketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MarketStatus }
     *     
     */
    public MarketStatus getMarketStatus() {
        return marketStatus;
    }

    /**
     * Sets the value of the marketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketStatus }
     *     
     */
    public void setMarketStatus(MarketStatus value) {
        this.marketStatus = value;
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
     * Gets the value of the retrocession property.
     * 
     */
    public boolean isRetrocession() {
        return retrocession;
    }

    /**
     * Sets the value of the retrocession property.
     * 
     */
    public void setRetrocession(boolean value) {
        this.retrocession = value;
    }

    /**
     * Gets the value of the retrocessionEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetrocessionEffectiveDate() {
        return retrocessionEffectiveDate;
    }

    /**
     * Sets the value of the retrocessionEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetrocessionEffectiveDate(XMLGregorianCalendar value) {
        this.retrocessionEffectiveDate = value;
    }

    /**
     * Gets the value of the retrocessionPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetrocessionPrice() {
        return retrocessionPrice;
    }

    /**
     * Sets the value of the retrocessionPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetrocessionPrice(Float value) {
        this.retrocessionPrice = value;
    }

    /**
     * Gets the value of the ucdItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdItem }
     *     
     */
    public ArrayOfUcdItem getUcdItems() {
        return ucdItems;
    }

    /**
     * Sets the value of the ucdItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdItem }
     *     
     */
    public void setUcdItems(ArrayOfUcdItem value) {
        this.ucdItems = value;
    }

    /**
     * Gets the value of the ucdPosologyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcdPosologyUnit }
     *     
     */
    public ArrayOfUcdPosologyUnit getUcdPosologyUnits() {
        return ucdPosologyUnits;
    }

    /**
     * Sets the value of the ucdPosologyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcdPosologyUnit }
     *     
     */
    public void setUcdPosologyUnits(ArrayOfUcdPosologyUnit value) {
        this.ucdPosologyUnits = value;
    }

}

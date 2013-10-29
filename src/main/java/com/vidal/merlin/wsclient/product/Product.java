
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammType" type="{http://constant.merlin.vidal.com}AmmType"/>
 *         &lt;element name="ammTypeLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commonNameGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="drugInSport" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exceptional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flavor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genericType" type="{urn:Vidal}GenericType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="list" type="{urn:Vidal}ListType"/>
 *         &lt;element name="listValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="maxUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="midwife" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minUcdRangePrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="onMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="perVolume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="refundingRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundingRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="safetyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{urn:Vidal}ProductType"/>
 *         &lt;element name="vigilance" type="{urn:Vidal}Vigilance"/>
 *         &lt;element name="withoutPrescr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "ammType",
    "ammTypeLabel",
    "cis",
    "commonNameGroupId",
    "drugInSport",
    "exceptional",
    "flavor",
    "genericType",
    "id",
    "list",
    "listValue",
    "marketStatus",
    "maxUcdRangePrice",
    "midwife",
    "minUcdRangePrice",
    "name",
    "offMarketDate",
    "onMarketDate",
    "perVolume",
    "perVolumeUnit",
    "refundingRate",
    "refundingRateValue",
    "safetyAlert",
    "type",
    "vigilance",
    "withoutPrescr"
})
public class Product {

    @XmlElement(required = true, nillable = true)
    protected AmmType ammType;
    @XmlElement(required = true, nillable = true)
    protected String ammTypeLabel;
    @XmlElement(required = true, nillable = true)
    protected String cis;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer commonNameGroupId;
    protected boolean drugInSport;
    protected boolean exceptional;
    @XmlElement(required = true, nillable = true)
    protected String flavor;
    @XmlElement(required = true, nillable = true)
    protected GenericType genericType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected ListType list;
    @XmlElement(required = true, nillable = true)
    protected String listValue;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float maxUcdRangePrice;
    protected boolean midwife;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float minUcdRangePrice;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offMarketDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onMarketDate;
    @XmlElement(required = true, nillable = true)
    protected String perVolume;
    @XmlElement(required = true, nillable = true)
    protected String perVolumeUnit;
    @XmlElement(required = true, nillable = true)
    protected String refundingRate;
    @XmlElement(required = true, nillable = true)
    protected String refundingRateValue;
    protected boolean safetyAlert;
    @XmlElement(required = true, nillable = true)
    protected ProductType type;
    @XmlElement(required = true, nillable = true)
    protected Vigilance vigilance;
    protected boolean withoutPrescr;

    /**
     * Gets the value of the ammType property.
     * 
     * @return
     *     possible object is
     *     {@link AmmType }
     *     
     */
    public AmmType getAmmType() {
        return ammType;
    }

    /**
     * Sets the value of the ammType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmmType }
     *     
     */
    public void setAmmType(AmmType value) {
        this.ammType = value;
    }

    /**
     * Gets the value of the ammTypeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmmTypeLabel() {
        return ammTypeLabel;
    }

    /**
     * Sets the value of the ammTypeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmmTypeLabel(String value) {
        this.ammTypeLabel = value;
    }

    /**
     * Gets the value of the cis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCis() {
        return cis;
    }

    /**
     * Sets the value of the cis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCis(String value) {
        this.cis = value;
    }

    /**
     * Gets the value of the commonNameGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommonNameGroupId() {
        return commonNameGroupId;
    }

    /**
     * Sets the value of the commonNameGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommonNameGroupId(Integer value) {
        this.commonNameGroupId = value;
    }

    /**
     * Gets the value of the drugInSport property.
     * 
     */
    public boolean isDrugInSport() {
        return drugInSport;
    }

    /**
     * Sets the value of the drugInSport property.
     * 
     */
    public void setDrugInSport(boolean value) {
        this.drugInSport = value;
    }

    /**
     * Gets the value of the exceptional property.
     * 
     */
    public boolean isExceptional() {
        return exceptional;
    }

    /**
     * Sets the value of the exceptional property.
     * 
     */
    public void setExceptional(boolean value) {
        this.exceptional = value;
    }

    /**
     * Gets the value of the flavor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Sets the value of the flavor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlavor(String value) {
        this.flavor = value;
    }

    /**
     * Gets the value of the genericType property.
     * 
     * @return
     *     possible object is
     *     {@link GenericType }
     *     
     */
    public GenericType getGenericType() {
        return genericType;
    }

    /**
     * Sets the value of the genericType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericType }
     *     
     */
    public void setGenericType(GenericType value) {
        this.genericType = value;
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
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setList(ListType value) {
        this.list = value;
    }

    /**
     * Gets the value of the listValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListValue() {
        return listValue;
    }

    /**
     * Sets the value of the listValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListValue(String value) {
        this.listValue = value;
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
     * Gets the value of the maxUcdRangePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxUcdRangePrice() {
        return maxUcdRangePrice;
    }

    /**
     * Sets the value of the maxUcdRangePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxUcdRangePrice(Float value) {
        this.maxUcdRangePrice = value;
    }

    /**
     * Gets the value of the midwife property.
     * 
     */
    public boolean isMidwife() {
        return midwife;
    }

    /**
     * Sets the value of the midwife property.
     * 
     */
    public void setMidwife(boolean value) {
        this.midwife = value;
    }

    /**
     * Gets the value of the minUcdRangePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinUcdRangePrice() {
        return minUcdRangePrice;
    }

    /**
     * Sets the value of the minUcdRangePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinUcdRangePrice(Float value) {
        this.minUcdRangePrice = value;
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
     * Gets the value of the offMarketDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOffMarketDate() {
        return offMarketDate;
    }

    /**
     * Sets the value of the offMarketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOffMarketDate(XMLGregorianCalendar value) {
        this.offMarketDate = value;
    }

    /**
     * Gets the value of the onMarketDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnMarketDate() {
        return onMarketDate;
    }

    /**
     * Sets the value of the onMarketDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnMarketDate(XMLGregorianCalendar value) {
        this.onMarketDate = value;
    }

    /**
     * Gets the value of the perVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerVolume() {
        return perVolume;
    }

    /**
     * Sets the value of the perVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerVolume(String value) {
        this.perVolume = value;
    }

    /**
     * Gets the value of the perVolumeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerVolumeUnit() {
        return perVolumeUnit;
    }

    /**
     * Sets the value of the perVolumeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerVolumeUnit(String value) {
        this.perVolumeUnit = value;
    }

    /**
     * Gets the value of the refundingRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundingRate() {
        return refundingRate;
    }

    /**
     * Sets the value of the refundingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundingRate(String value) {
        this.refundingRate = value;
    }

    /**
     * Gets the value of the refundingRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundingRateValue() {
        return refundingRateValue;
    }

    /**
     * Sets the value of the refundingRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundingRateValue(String value) {
        this.refundingRateValue = value;
    }

    /**
     * Gets the value of the safetyAlert property.
     * 
     */
    public boolean isSafetyAlert() {
        return safetyAlert;
    }

    /**
     * Sets the value of the safetyAlert property.
     * 
     */
    public void setSafetyAlert(boolean value) {
        this.safetyAlert = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setType(ProductType value) {
        this.type = value;
    }

    /**
     * Gets the value of the vigilance property.
     * 
     * @return
     *     possible object is
     *     {@link Vigilance }
     *     
     */
    public Vigilance getVigilance() {
        return vigilance;
    }

    /**
     * Sets the value of the vigilance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vigilance }
     *     
     */
    public void setVigilance(Vigilance value) {
        this.vigilance = value;
    }

    /**
     * Gets the value of the withoutPrescr property.
     * 
     */
    public boolean isWithoutPrescr() {
        return withoutPrescr;
    }

    /**
     * Sets the value of the withoutPrescr property.
     * 
     */
    public void setWithoutPrescr(boolean value) {
        this.withoutPrescr = value;
    }

}

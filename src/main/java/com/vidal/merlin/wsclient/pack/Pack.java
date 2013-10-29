
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actCode" type="{urn:Vidal}ActCode"/>
 *         &lt;element name="actCodeValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cip13" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="communityAgrement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dispensationPlace" type="{urn:Vidal}DispensationPlace"/>
 *         &lt;element name="dose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doseUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genericType" type="{urn:Vidal}GenericType"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="list" type="{urn:Vidal}ListType"/>
 *         &lt;element name="listValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manufacturerPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="marketStatus" type="{urn:Vidal}MarketStatus"/>
 *         &lt;element name="maxPrescriptionDuration" type="{urn:Vidal}PrescriptionDuration"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="narcoticPrescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="offMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="onFreeAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="onMarketDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="otc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pharmacistPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="pricePerDose" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publicPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="refundingBase" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="refundingRate" type="{urn:Vidal}RefundRate"/>
 *         &lt;element name="refundingRateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="safetyAlert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tfr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{urn:Vidal}ProductType"/>
 *         &lt;element name="ucdPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="vatRate" type="{urn:Vidal}VatRate"/>
 *         &lt;element name="vatRateValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
@XmlType(name = "pack", propOrder = {
    "actCode",
    "actCodeValue",
    "cip",
    "cip13",
    "cis",
    "communityAgrement",
    "dispensationPlace",
    "dose",
    "doseUnit",
    "ean",
    "genericType",
    "id",
    "list",
    "listValue",
    "manufacturerPrice",
    "marketStatus",
    "maxPrescriptionDuration",
    "name",
    "narcoticPrescription",
    "offMarketDate",
    "onFreeAccess",
    "onMarketDate",
    "otc",
    "pharmacistPrice",
    "pricePerDose",
    "productId",
    "publicPrice",
    "refundingBase",
    "refundingRate",
    "refundingRateValue",
    "safetyAlert",
    "shortName",
    "tfr",
    "type",
    "ucdPrice",
    "vatRate",
    "vatRateValue",
    "withoutPrescr"
})
public class Pack {

    @XmlElement(required = true, nillable = true)
    protected ActCode actCode;
    @XmlElement(required = true, nillable = true)
    protected String actCodeValue;
    @XmlElement(required = true, nillable = true)
    protected String cip;
    @XmlElement(required = true, nillable = true)
    protected String cip13;
    @XmlElement(required = true, nillable = true)
    protected String cis;
    protected boolean communityAgrement;
    @XmlElement(required = true, nillable = true)
    protected DispensationPlace dispensationPlace;
    @XmlElement(required = true, nillable = true)
    protected String dose;
    @XmlElement(required = true, nillable = true)
    protected String doseUnit;
    @XmlElement(required = true, nillable = true)
    protected String ean;
    @XmlElement(required = true, nillable = true)
    protected GenericType genericType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected ListType list;
    @XmlElement(required = true, nillable = true)
    protected String listValue;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float manufacturerPrice;
    @XmlElement(required = true, nillable = true)
    protected MarketStatus marketStatus;
    @XmlElement(required = true, nillable = true)
    protected PrescriptionDuration maxPrescriptionDuration;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean narcoticPrescription;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offMarketDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean onFreeAccess;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar onMarketDate;
    protected boolean otc;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float pharmacistPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float pricePerDose;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer productId;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float publicPrice;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float refundingBase;
    @XmlElement(required = true, nillable = true)
    protected String refundingRate;
    @XmlElement(required = true, nillable = true)
    protected String refundingRateValue;
    protected boolean safetyAlert;
    @XmlElement(required = true, nillable = true)
    protected String shortName;
    protected boolean tfr;
    @XmlElement(required = true, nillable = true)
    protected ProductType type;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ucdPrice;
    @XmlElement(required = true, nillable = true)
    protected VatRate vatRate;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float vatRateValue;
    protected boolean withoutPrescr;

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
     * Gets the value of the cip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCip() {
        return cip;
    }

    /**
     * Sets the value of the cip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCip(String value) {
        this.cip = value;
    }

    /**
     * Gets the value of the cip13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCip13() {
        return cip13;
    }

    /**
     * Sets the value of the cip13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCip13(String value) {
        this.cip13 = value;
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
     * Gets the value of the communityAgrement property.
     * 
     */
    public boolean isCommunityAgrement() {
        return communityAgrement;
    }

    /**
     * Sets the value of the communityAgrement property.
     * 
     */
    public void setCommunityAgrement(boolean value) {
        this.communityAgrement = value;
    }

    /**
     * Gets the value of the dispensationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link DispensationPlace }
     *     
     */
    public DispensationPlace getDispensationPlace() {
        return dispensationPlace;
    }

    /**
     * Sets the value of the dispensationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispensationPlace }
     *     
     */
    public void setDispensationPlace(DispensationPlace value) {
        this.dispensationPlace = value;
    }

    /**
     * Gets the value of the dose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDose() {
        return dose;
    }

    /**
     * Sets the value of the dose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDose(String value) {
        this.dose = value;
    }

    /**
     * Gets the value of the doseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoseUnit() {
        return doseUnit;
    }

    /**
     * Sets the value of the doseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoseUnit(String value) {
        this.doseUnit = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEan() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEan(String value) {
        this.ean = value;
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
     * Gets the value of the maxPrescriptionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link PrescriptionDuration }
     *     
     */
    public PrescriptionDuration getMaxPrescriptionDuration() {
        return maxPrescriptionDuration;
    }

    /**
     * Sets the value of the maxPrescriptionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrescriptionDuration }
     *     
     */
    public void setMaxPrescriptionDuration(PrescriptionDuration value) {
        this.maxPrescriptionDuration = value;
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
     * Gets the value of the narcoticPrescription property.
     * 
     */
    public boolean isNarcoticPrescription() {
        return narcoticPrescription;
    }

    /**
     * Sets the value of the narcoticPrescription property.
     * 
     */
    public void setNarcoticPrescription(boolean value) {
        this.narcoticPrescription = value;
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
     * Gets the value of the onFreeAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getOnFreeAccess() {
        return onFreeAccess;
    }

    /**
     * Sets the value of the onFreeAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnFreeAccess(Boolean value) {
        this.onFreeAccess = value;
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
     * Gets the value of the otc property.
     * 
     */
    public boolean isOtc() {
        return otc;
    }

    /**
     * Sets the value of the otc property.
     * 
     */
    public void setOtc(boolean value) {
        this.otc = value;
    }

    /**
     * Gets the value of the pharmacistPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPharmacistPrice() {
        return pharmacistPrice;
    }

    /**
     * Sets the value of the pharmacistPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPharmacistPrice(Float value) {
        this.pharmacistPrice = value;
    }

    /**
     * Gets the value of the pricePerDose property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPricePerDose() {
        return pricePerDose;
    }

    /**
     * Sets the value of the pricePerDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPricePerDose(Float value) {
        this.pricePerDose = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
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
     * Gets the value of the refundingBase property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefundingBase() {
        return refundingBase;
    }

    /**
     * Sets the value of the refundingBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefundingBase(Float value) {
        this.refundingBase = value;
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
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the tfr property.
     * 
     */
    public boolean isTfr() {
        return tfr;
    }

    /**
     * Sets the value of the tfr property.
     * 
     */
    public void setTfr(boolean value) {
        this.tfr = value;
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
     * Gets the value of the ucdPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUcdPrice() {
        return ucdPrice;
    }

    /**
     * Sets the value of the ucdPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUcdPrice(Float value) {
        this.ucdPrice = value;
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


package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ucdFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucdFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atcs" type="{urn:Vidal}ArrayOfAtc"/>
 *         &lt;element name="companyAgg" type="{urn:Vidal}companyAgg"/>
 *         &lt;element name="drugs" type="{urn:Vidal}drugsAgg"/>
 *         &lt;element name="galenic" type="{urn:Vidal}galenicAgg"/>
 *         &lt;element name="indications" type="{urn:Vidal}ArrayOfIndication"/>
 *         &lt;element name="indicators" type="{urn:Vidal}ArrayOfIndicator"/>
 *         &lt;element name="ucd" type="{urn:Vidal}ucd"/>
 *         &lt;element name="ucdDispensingUnit" type="{urn:Vidal}ucdDispensingUnit"/>
 *         &lt;element name="ucdItems" type="{urn:Vidal}ArrayOfUcdItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucdFull", propOrder = {
    "atcs",
    "companyAgg",
    "drugs",
    "galenic",
    "indications",
    "indicators",
    "ucd",
    "ucdDispensingUnit",
    "ucdItems"
})
public class UcdFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAtc atcs;
    @XmlElement(required = true, nillable = true)
    protected CompanyAgg companyAgg;
    @XmlElement(required = true, nillable = true)
    protected DrugsAgg drugs;
    @XmlElement(required = true, nillable = true)
    protected GalenicAgg galenic;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndication indications;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicator indicators;
    @XmlElement(required = true, nillable = true)
    protected Ucd ucd;
    @XmlElement(required = true, nillable = true)
    protected UcdDispensingUnit ucdDispensingUnit;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfUcdItem ucdItems;

    /**
     * Gets the value of the atcs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAtc }
     *     
     */
    public ArrayOfAtc getAtcs() {
        return atcs;
    }

    /**
     * Sets the value of the atcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAtc }
     *     
     */
    public void setAtcs(ArrayOfAtc value) {
        this.atcs = value;
    }

    /**
     * Gets the value of the companyAgg property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAgg }
     *     
     */
    public CompanyAgg getCompanyAgg() {
        return companyAgg;
    }

    /**
     * Sets the value of the companyAgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAgg }
     *     
     */
    public void setCompanyAgg(CompanyAgg value) {
        this.companyAgg = value;
    }

    /**
     * Gets the value of the drugs property.
     * 
     * @return
     *     possible object is
     *     {@link DrugsAgg }
     *     
     */
    public DrugsAgg getDrugs() {
        return drugs;
    }

    /**
     * Sets the value of the drugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrugsAgg }
     *     
     */
    public void setDrugs(DrugsAgg value) {
        this.drugs = value;
    }

    /**
     * Gets the value of the galenic property.
     * 
     * @return
     *     possible object is
     *     {@link GalenicAgg }
     *     
     */
    public GalenicAgg getGalenic() {
        return galenic;
    }

    /**
     * Sets the value of the galenic property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalenicAgg }
     *     
     */
    public void setGalenic(GalenicAgg value) {
        this.galenic = value;
    }

    /**
     * Gets the value of the indications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndication }
     *     
     */
    public ArrayOfIndication getIndications() {
        return indications;
    }

    /**
     * Sets the value of the indications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndication }
     *     
     */
    public void setIndications(ArrayOfIndication value) {
        this.indications = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicator }
     *     
     */
    public ArrayOfIndicator getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicator }
     *     
     */
    public void setIndicators(ArrayOfIndicator value) {
        this.indicators = value;
    }

    /**
     * Gets the value of the ucd property.
     * 
     * @return
     *     possible object is
     *     {@link Ucd }
     *     
     */
    public Ucd getUcd() {
        return ucd;
    }

    /**
     * Sets the value of the ucd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ucd }
     *     
     */
    public void setUcd(Ucd value) {
        this.ucd = value;
    }

    /**
     * Gets the value of the ucdDispensingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UcdDispensingUnit }
     *     
     */
    public UcdDispensingUnit getUcdDispensingUnit() {
        return ucdDispensingUnit;
    }

    /**
     * Sets the value of the ucdDispensingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UcdDispensingUnit }
     *     
     */
    public void setUcdDispensingUnit(UcdDispensingUnit value) {
        this.ucdDispensingUnit = value;
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

}

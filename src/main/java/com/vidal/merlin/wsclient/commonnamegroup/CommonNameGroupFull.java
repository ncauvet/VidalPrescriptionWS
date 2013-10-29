
package com.vidal.merlin.wsclient.commonnamegroup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonNameGroupFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atcClasses" type="{urn:Vidal}ArrayOfAtc"/>
 *         &lt;element name="commonNameGroup" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="commonNameGroupCompositions" type="{urn:Vidal}ArrayOfCommonNameGroupComposition"/>
 *         &lt;element name="drugs" type="{urn:Vidal}drugsAgg"/>
 *         &lt;element name="galenic" type="{urn:Vidal}galenicAgg"/>
 *         &lt;element name="indications" type="{urn:Vidal}ArrayOfIndication"/>
 *         &lt;element name="indicators" type="{urn:Vidal}ArrayOfIndicator"/>
 *         &lt;element name="units" type="{urn:Vidal}units"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupFull", propOrder = {
    "atcClasses",
    "commonNameGroup",
    "commonNameGroupCompositions",
    "drugs",
    "galenic",
    "indications",
    "indicators",
    "units"
})
public class CommonNameGroupFull {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfAtc atcClasses;
    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroup;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupComposition commonNameGroupCompositions;
    @XmlElement(required = true, nillable = true)
    protected DrugsAgg drugs;
    @XmlElement(required = true, nillable = true)
    protected GalenicAgg galenic;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndication indications;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicator indicators;
    @XmlElement(required = true, nillable = true)
    protected Units units;

    /**
     * Gets the value of the atcClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAtc }
     *     
     */
    public ArrayOfAtc getAtcClasses() {
        return atcClasses;
    }

    /**
     * Sets the value of the atcClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAtc }
     *     
     */
    public void setAtcClasses(ArrayOfAtc value) {
        this.atcClasses = value;
    }

    /**
     * Gets the value of the commonNameGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroup() {
        return commonNameGroup;
    }

    /**
     * Sets the value of the commonNameGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroup(CommonNameGroup value) {
        this.commonNameGroup = value;
    }

    /**
     * Gets the value of the commonNameGroupCompositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public ArrayOfCommonNameGroupComposition getCommonNameGroupCompositions() {
        return commonNameGroupCompositions;
    }

    /**
     * Sets the value of the commonNameGroupCompositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public void setCommonNameGroupCompositions(ArrayOfCommonNameGroupComposition value) {
        this.commonNameGroupCompositions = value;
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
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setUnits(Units value) {
        this.units = value;
    }

}

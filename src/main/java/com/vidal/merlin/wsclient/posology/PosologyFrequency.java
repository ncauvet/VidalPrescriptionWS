
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for posologyFrequency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="posologyFrequency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="secondDuration" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="thirdDuration" type="{urn:Vidal}PosologyDuration"/>
 *         &lt;element name="type" type="{urn:Vidal}PosologyFrequencyType"/>
 *         &lt;element name="typeDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "posologyFrequency", propOrder = {
    "asNeeded",
    "secondDuration",
    "thirdDuration",
    "type",
    "typeDetail",
    "value"
})
public class PosologyFrequency {

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean asNeeded;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration secondDuration;
    @XmlElement(required = true, nillable = true)
    protected PosologyDuration thirdDuration;
    @XmlElement(required = true, nillable = true)
    protected PosologyFrequencyType type;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer typeDetail;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer value;

    /**
     * Gets the value of the asNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAsNeeded() {
        return asNeeded;
    }

    /**
     * Sets the value of the asNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsNeeded(Boolean value) {
        this.asNeeded = value;
    }

    /**
     * Gets the value of the secondDuration property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getSecondDuration() {
        return secondDuration;
    }

    /**
     * Sets the value of the secondDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setSecondDuration(PosologyDuration value) {
        this.secondDuration = value;
    }

    /**
     * Gets the value of the thirdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyDuration }
     *     
     */
    public PosologyDuration getThirdDuration() {
        return thirdDuration;
    }

    /**
     * Sets the value of the thirdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyDuration }
     *     
     */
    public void setThirdDuration(PosologyDuration value) {
        this.thirdDuration = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public PosologyFrequencyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyFrequencyType }
     *     
     */
    public void setType(PosologyFrequencyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeDetail() {
        return typeDetail;
    }

    /**
     * Sets the value of the typeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeDetail(Integer value) {
        this.typeDetail = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}

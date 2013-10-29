
package com.vidal.merlin.wsclient.ald;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aldAtc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aldAtc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ald" type="{urn:Vidal}ald"/>
 *         &lt;element name="atc" type="{urn:Vidal}atc"/>
 *         &lt;element name="hasOpinion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aldAtc", propOrder = {
    "ald",
    "atc",
    "hasOpinion"
})
public class AldAtc {

    @XmlElement(required = true, nillable = true)
    protected Ald ald;
    @XmlElement(required = true, nillable = true)
    protected Atc atc;
    @XmlElement(required = true, nillable = true)
    protected String hasOpinion;

    /**
     * Gets the value of the ald property.
     * 
     * @return
     *     possible object is
     *     {@link Ald }
     *     
     */
    public Ald getAld() {
        return ald;
    }

    /**
     * Sets the value of the ald property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ald }
     *     
     */
    public void setAld(Ald value) {
        this.ald = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link Atc }
     *     
     */
    public Atc getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atc }
     *     
     */
    public void setAtc(Atc value) {
        this.atc = value;
    }

    /**
     * Gets the value of the hasOpinion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasOpinion() {
        return hasOpinion;
    }

    /**
     * Sets the value of the hasOpinion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasOpinion(String value) {
        this.hasOpinion = value;
    }

}


package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageLpprListCoupleSimplified complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageLpprListCoupleSimplified">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lppCompositionsList" type="{urn:Vidal}ArrayOfLpprCompositions"/>
 *         &lt;element name="pack" type="{urn:Vidal}pack"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageLpprListCoupleSimplified", namespace = "http://lppr.api.vidal.com", propOrder = {
    "lppCompositionsList",
    "pack"
})
public class PackageLpprListCoupleSimplified {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLpprCompositions lppCompositionsList;
    @XmlElement(required = true, nillable = true)
    protected Pack pack;

    /**
     * Gets the value of the lppCompositionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLpprCompositions }
     *     
     */
    public ArrayOfLpprCompositions getLppCompositionsList() {
        return lppCompositionsList;
    }

    /**
     * Sets the value of the lppCompositionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLpprCompositions }
     *     
     */
    public void setLppCompositionsList(ArrayOfLpprCompositions value) {
        this.lppCompositionsList = value;
    }

    /**
     * Gets the value of the pack property.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Sets the value of the pack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
    }

}

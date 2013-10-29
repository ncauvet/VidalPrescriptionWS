
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activePrincipleDoseRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activePrincipleDoseRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max" type="{urn:Vidal}activePrincipleDose"/>
 *         &lt;element name="min" type="{urn:Vidal}activePrincipleDose"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activePrincipleDoseRange", propOrder = {
    "max",
    "min"
})
public class ActivePrincipleDoseRange {

    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDose max;
    @XmlElement(required = true, nillable = true)
    protected ActivePrincipleDose min;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public ActivePrincipleDose getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public void setMax(ActivePrincipleDose value) {
        this.max = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public ActivePrincipleDose getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePrincipleDose }
     *     
     */
    public void setMin(ActivePrincipleDose value) {
        this.min = value;
    }

}

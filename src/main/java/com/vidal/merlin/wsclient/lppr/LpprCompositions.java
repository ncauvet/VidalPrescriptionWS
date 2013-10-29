
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lpprCompositions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lpprCompositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lppr" type="{urn:Vidal}lppr"/>
 *         &lt;element name="nbLppr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprCompositions", propOrder = {
    "lppr",
    "nbLppr"
})
public class LpprCompositions {

    @XmlElement(required = true, nillable = true)
    protected Lppr lppr;
    protected int nbLppr;

    /**
     * Gets the value of the lppr property.
     * 
     * @return
     *     possible object is
     *     {@link Lppr }
     *     
     */
    public Lppr getLppr() {
        return lppr;
    }

    /**
     * Sets the value of the lppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lppr }
     *     
     */
    public void setLppr(Lppr value) {
        this.lppr = value;
    }

    /**
     * Gets the value of the nbLppr property.
     * 
     */
    public int getNbLppr() {
        return nbLppr;
    }

    /**
     * Sets the value of the nbLppr property.
     * 
     */
    public void setNbLppr(int value) {
        this.nbLppr = value;
    }

}

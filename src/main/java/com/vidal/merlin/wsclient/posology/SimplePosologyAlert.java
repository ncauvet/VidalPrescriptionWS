
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simplePosologyAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simplePosologyAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indication" type="{urn:Vidal}indication"/>
 *         &lt;element name="posologyAlert" type="{http://utils.api.vidal.com}Message"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simplePosologyAlert", propOrder = {
    "indication",
    "posologyAlert"
})
public class SimplePosologyAlert {

    @XmlElement(required = true, nillable = true)
    protected Indication indication;
    @XmlElement(required = true, nillable = true)
    protected Message posologyAlert;

    /**
     * Gets the value of the indication property.
     * 
     * @return
     *     possible object is
     *     {@link Indication }
     *     
     */
    public Indication getIndication() {
        return indication;
    }

    /**
     * Sets the value of the indication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Indication }
     *     
     */
    public void setIndication(Indication value) {
        this.indication = value;
    }

    /**
     * Gets the value of the posologyAlert property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getPosologyAlert() {
        return posologyAlert;
    }

    /**
     * Sets the value of the posologyAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setPosologyAlert(Message value) {
        this.posologyAlert = value;
    }

}

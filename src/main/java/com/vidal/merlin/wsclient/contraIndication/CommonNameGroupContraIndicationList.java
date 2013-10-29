
package com.vidal.merlin.wsclient.contraIndication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupContraIndicationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupContraIndicationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndicationTypeCouple"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupContraIndicationList", propOrder = {
    "contraIndications",
    "homogeneous"
})
public class CommonNameGroupContraIndicationList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationTypeCouple contraIndications;
    protected boolean homogeneous;

    /**
     * Gets the value of the contraIndications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationTypeCouple }
     *     
     */
    public ArrayOfContraIndicationTypeCouple getContraIndications() {
        return contraIndications;
    }

    /**
     * Sets the value of the contraIndications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationTypeCouple }
     *     
     */
    public void setContraIndications(ArrayOfContraIndicationTypeCouple value) {
        this.contraIndications = value;
    }

    /**
     * Gets the value of the homogeneous property.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Sets the value of the homogeneous property.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

}

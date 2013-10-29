
package com.vidal.merlin.wsclient.contraIndication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupContraIndicationCim10List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupContraIndicationCim10List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndications" type="{urn:Vidal}ArrayOfContraIndicationTypeCim10Tuple"/>
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
@XmlType(name = "CommonNameGroupContraIndicationCim10List", propOrder = {
    "contraIndications",
    "homogeneous"
})
public class CommonNameGroupContraIndicationCim10List {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfContraIndicationTypeCim10Tuple contraIndications;
    protected boolean homogeneous;

    /**
     * Gets the value of the contraIndications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContraIndicationTypeCim10Tuple }
     *     
     */
    public ArrayOfContraIndicationTypeCim10Tuple getContraIndications() {
        return contraIndications;
    }

    /**
     * Sets the value of the contraIndications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContraIndicationTypeCim10Tuple }
     *     
     */
    public void setContraIndications(ArrayOfContraIndicationTypeCim10Tuple value) {
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

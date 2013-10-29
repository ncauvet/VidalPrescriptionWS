
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ammPosology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ammPosology"
})
@XmlRootElement(name = "getAmmPosologyByProductIdResponse")
public class GetAmmPosologyByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected String ammPosology;

    /**
     * Gets the value of the ammPosology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmmPosology() {
        return ammPosology;
    }

    /**
     * Sets the value of the ammPosology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmmPosology(String value) {
        this.ammPosology = value;
    }

}

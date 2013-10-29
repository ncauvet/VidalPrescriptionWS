
package com.vidal.merlin.wsclient.lppr;

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
 *         &lt;element name="lpprName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "lpprName"
})
@XmlRootElement(name = "searchByName")
public class SearchByName {

    @XmlElement(required = true, nillable = true)
    protected String lpprName;

    /**
     * Gets the value of the lpprName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpprName() {
        return lpprName;
    }

    /**
     * Sets the value of the lpprName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpprName(String value) {
        this.lpprName = value;
    }

}

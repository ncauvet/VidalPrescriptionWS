
package com.vidal.merlin.wsclient.utilities;

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
 *         &lt;element name="compositeIdMap" type="{urn:Vidal}string2CompositeIdMap"/>
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
    "compositeIdMap"
})
@XmlRootElement(name = "getCompositeIdFromHMKResponse")
public class GetCompositeIdFromHMKResponse {

    @XmlElement(required = true, nillable = true)
    protected String2CompositeIdMap compositeIdMap;

    /**
     * Gets the value of the compositeIdMap property.
     * 
     * @return
     *     possible object is
     *     {@link String2CompositeIdMap }
     *     
     */
    public String2CompositeIdMap getCompositeIdMap() {
        return compositeIdMap;
    }

    /**
     * Sets the value of the compositeIdMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String2CompositeIdMap }
     *     
     */
    public void setCompositeIdMap(String2CompositeIdMap value) {
        this.compositeIdMap = value;
    }

}

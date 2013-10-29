
package com.vidal.merlin.wsclient.pack;

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
 *         &lt;element name="packIndicatorsList" type="{urn:Vidal}ArrayOfPackIndicators"/>
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
    "packIndicatorsList"
})
@XmlRootElement(name = "searchPackIndicatorsByPackIdsResponse")
public class SearchPackIndicatorsByPackIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackIndicators packIndicatorsList;

    /**
     * Gets the value of the packIndicatorsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackIndicators }
     *     
     */
    public ArrayOfPackIndicators getPackIndicatorsList() {
        return packIndicatorsList;
    }

    /**
     * Sets the value of the packIndicatorsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackIndicators }
     *     
     */
    public void setPackIndicatorsList(ArrayOfPackIndicators value) {
        this.packIndicatorsList = value;
    }

}

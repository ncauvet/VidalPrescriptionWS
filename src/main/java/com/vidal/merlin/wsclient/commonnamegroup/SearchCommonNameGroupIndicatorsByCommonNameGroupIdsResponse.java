
package com.vidal.merlin.wsclient.commonnamegroup;

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
 *         &lt;element name="commonNameGroupIndicatorsList" type="{urn:Vidal}ArrayOfCommonNameGroupIndicators"/>
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
    "commonNameGroupIndicatorsList"
})
@XmlRootElement(name = "searchCommonNameGroupIndicatorsByCommonNameGroupIdsResponse")
public class SearchCommonNameGroupIndicatorsByCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupIndicators commonNameGroupIndicatorsList;

    /**
     * Gets the value of the commonNameGroupIndicatorsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupIndicators }
     *     
     */
    public ArrayOfCommonNameGroupIndicators getCommonNameGroupIndicatorsList() {
        return commonNameGroupIndicatorsList;
    }

    /**
     * Sets the value of the commonNameGroupIndicatorsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupIndicators }
     *     
     */
    public void setCommonNameGroupIndicatorsList(ArrayOfCommonNameGroupIndicators value) {
        this.commonNameGroupIndicatorsList = value;
    }

}

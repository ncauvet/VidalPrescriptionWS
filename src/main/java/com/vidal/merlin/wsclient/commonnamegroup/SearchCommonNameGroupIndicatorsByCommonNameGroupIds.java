
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
 *         &lt;element name="commonNameGroupIds" type="{urn:Vidal}ArrayOfInt"/>
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
    "commonNameGroupIds"
})
@XmlRootElement(name = "searchCommonNameGroupIndicatorsByCommonNameGroupIds")
public class SearchCommonNameGroupIndicatorsByCommonNameGroupIds {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt commonNameGroupIds;

    /**
     * Gets the value of the commonNameGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCommonNameGroupIds() {
        return commonNameGroupIds;
    }

    /**
     * Sets the value of the commonNameGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCommonNameGroupIds(ArrayOfInt value) {
        this.commonNameGroupIds = value;
    }

}

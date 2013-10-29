
package com.vidal.merlin.wsclient.composition;

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
 *         &lt;element name="commonNameGroupCompositionList" type="{urn:Vidal}ArrayOfCommonNameGroupComposition"/>
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
    "commonNameGroupCompositionList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdsResponse")
public class SearchByCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupComposition commonNameGroupCompositionList;

    /**
     * Gets the value of the commonNameGroupCompositionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public ArrayOfCommonNameGroupComposition getCommonNameGroupCompositionList() {
        return commonNameGroupCompositionList;
    }

    /**
     * Sets the value of the commonNameGroupCompositionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupComposition }
     *     
     */
    public void setCommonNameGroupCompositionList(ArrayOfCommonNameGroupComposition value) {
        this.commonNameGroupCompositionList = value;
    }

}


package com.vidal.merlin.wsclient.redundantInteraction;

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
 *         &lt;element name="redundantInteractionCommonNameGroupCoupleList" type="{urn:Vidal}ArrayOfRedundantInteractionCommonNameGroupCouple"/>
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
    "redundantInteractionCommonNameGroupCoupleList"
})
@XmlRootElement(name = "searchRedundantInteractionByCommonNameGroupIdsResponse")
public class SearchRedundantInteractionByCommonNameGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRedundantInteractionCommonNameGroupCouple redundantInteractionCommonNameGroupCoupleList;

    /**
     * Gets the value of the redundantInteractionCommonNameGroupCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRedundantInteractionCommonNameGroupCouple }
     *     
     */
    public ArrayOfRedundantInteractionCommonNameGroupCouple getRedundantInteractionCommonNameGroupCoupleList() {
        return redundantInteractionCommonNameGroupCoupleList;
    }

    /**
     * Sets the value of the redundantInteractionCommonNameGroupCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRedundantInteractionCommonNameGroupCouple }
     *     
     */
    public void setRedundantInteractionCommonNameGroupCoupleList(ArrayOfRedundantInteractionCommonNameGroupCouple value) {
        this.redundantInteractionCommonNameGroupCoupleList = value;
    }

}

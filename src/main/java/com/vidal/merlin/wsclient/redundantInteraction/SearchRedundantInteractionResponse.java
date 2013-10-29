
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
 *         &lt;element name="redundantInteractionCoupleList" type="{urn:Vidal}ArrayOfRedundantInteractionCouple"/>
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
    "redundantInteractionCoupleList"
})
@XmlRootElement(name = "searchRedundantInteractionResponse")
public class SearchRedundantInteractionResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRedundantInteractionCouple redundantInteractionCoupleList;

    /**
     * Gets the value of the redundantInteractionCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRedundantInteractionCouple }
     *     
     */
    public ArrayOfRedundantInteractionCouple getRedundantInteractionCoupleList() {
        return redundantInteractionCoupleList;
    }

    /**
     * Sets the value of the redundantInteractionCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRedundantInteractionCouple }
     *     
     */
    public void setRedundantInteractionCoupleList(ArrayOfRedundantInteractionCouple value) {
        this.redundantInteractionCoupleList = value;
    }

}

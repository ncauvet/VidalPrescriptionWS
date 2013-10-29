
package com.vidal.merlin.wsclient.sideEffect;

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
 *         &lt;element name="sideEffectList" type="{urn:Vidal}ArrayOfProductSideEffect"/>
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
    "sideEffectList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductSideEffect sideEffectList;

    /**
     * Gets the value of the sideEffectList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductSideEffect }
     *     
     */
    public ArrayOfProductSideEffect getSideEffectList() {
        return sideEffectList;
    }

    /**
     * Sets the value of the sideEffectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductSideEffect }
     *     
     */
    public void setSideEffectList(ArrayOfProductSideEffect value) {
        this.sideEffectList = value;
    }

}

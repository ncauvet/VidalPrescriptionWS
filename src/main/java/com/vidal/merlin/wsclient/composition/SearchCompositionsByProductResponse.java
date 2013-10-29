
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
 *         &lt;element name="itemCompositionsCoupleList" type="{urn:Vidal}ArrayOfItemCompositionsCouple"/>
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
    "itemCompositionsCoupleList"
})
@XmlRootElement(name = "searchCompositionsByProductResponse")
public class SearchCompositionsByProductResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfItemCompositionsCouple itemCompositionsCoupleList;

    /**
     * Gets the value of the itemCompositionsCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemCompositionsCouple }
     *     
     */
    public ArrayOfItemCompositionsCouple getItemCompositionsCoupleList() {
        return itemCompositionsCoupleList;
    }

    /**
     * Sets the value of the itemCompositionsCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemCompositionsCouple }
     *     
     */
    public void setItemCompositionsCoupleList(ArrayOfItemCompositionsCouple value) {
        this.itemCompositionsCoupleList = value;
    }

}
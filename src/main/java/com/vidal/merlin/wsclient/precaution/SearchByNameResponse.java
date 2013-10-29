
package com.vidal.merlin.wsclient.precaution;

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
 *         &lt;element name="precautionList" type="{urn:Vidal}ArrayOfPrecaution"/>
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
    "precautionList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecaution precautionList;

    /**
     * Gets the value of the precautionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecaution }
     *     
     */
    public ArrayOfPrecaution getPrecautionList() {
        return precautionList;
    }

    /**
     * Sets the value of the precautionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecaution }
     *     
     */
    public void setPrecautionList(ArrayOfPrecaution value) {
        this.precautionList = value;
    }

}

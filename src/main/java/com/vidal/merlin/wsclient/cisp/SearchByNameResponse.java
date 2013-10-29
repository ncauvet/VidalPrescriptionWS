
package com.vidal.merlin.wsclient.cisp;

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
 *         &lt;element name="cispList" type="{urn:Vidal}ArrayOfCisp"/>
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
    "cispList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCisp cispList;

    /**
     * Gets the value of the cispList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCisp }
     *     
     */
    public ArrayOfCisp getCispList() {
        return cispList;
    }

    /**
     * Sets the value of the cispList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCisp }
     *     
     */
    public void setCispList(ArrayOfCisp value) {
        this.cispList = value;
    }

}

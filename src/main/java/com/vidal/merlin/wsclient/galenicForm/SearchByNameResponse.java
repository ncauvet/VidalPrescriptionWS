
package com.vidal.merlin.wsclient.galenicForm;

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
 *         &lt;element name="galenicFormList" type="{urn:Vidal}ArrayOfGalenicForm"/>
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
    "galenicFormList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGalenicForm galenicFormList;

    /**
     * Gets the value of the galenicFormList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public ArrayOfGalenicForm getGalenicFormList() {
        return galenicFormList;
    }

    /**
     * Sets the value of the galenicFormList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public void setGalenicFormList(ArrayOfGalenicForm value) {
        this.galenicFormList = value;
    }

}

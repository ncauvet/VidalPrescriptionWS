
package com.vidal.merlin.wsclient.posology;

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
 *         &lt;element name="activePrincipleDosesList" type="{http://posology.api.vidal.com}ArrayOfActivePrincipleDoses"/>
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
    "activePrincipleDosesList"
})
@XmlRootElement(name = "searchActivePrincipleDosesByProductIdResponse")
public class SearchActivePrincipleDosesByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfActivePrincipleDoses activePrincipleDosesList;

    /**
     * Gets the value of the activePrincipleDosesList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActivePrincipleDoses }
     *     
     */
    public ArrayOfActivePrincipleDoses getActivePrincipleDosesList() {
        return activePrincipleDosesList;
    }

    /**
     * Sets the value of the activePrincipleDosesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActivePrincipleDoses }
     *     
     */
    public void setActivePrincipleDosesList(ArrayOfActivePrincipleDoses value) {
        this.activePrincipleDosesList = value;
    }

}

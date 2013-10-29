
package com.vidal.merlin.wsclient.genericGroup;

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
 *         &lt;element name="genericGroupList" type="{urn:Vidal}ArrayOfGenericGroup"/>
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
    "genericGroupList"
})
@XmlRootElement(name = "searchByNameResponse")
public class SearchByNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGenericGroup genericGroupList;

    /**
     * Gets the value of the genericGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenericGroup }
     *     
     */
    public ArrayOfGenericGroup getGenericGroupList() {
        return genericGroupList;
    }

    /**
     * Sets the value of the genericGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenericGroup }
     *     
     */
    public void setGenericGroupList(ArrayOfGenericGroup value) {
        this.genericGroupList = value;
    }

}

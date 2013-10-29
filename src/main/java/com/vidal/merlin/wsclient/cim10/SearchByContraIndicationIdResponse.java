
package com.vidal.merlin.wsclient.cim10;

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
 *         &lt;element name="cim10List" type="{urn:Vidal}ArrayOfCim10"/>
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
    "cim10List"
})
@XmlRootElement(name = "searchByContraIndicationIdResponse")
public class SearchByContraIndicationIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCim10 cim10List;

    /**
     * Gets the value of the cim10List property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public ArrayOfCim10 getCim10List() {
        return cim10List;
    }

    /**
     * Sets the value of the cim10List property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCim10 }
     *     
     */
    public void setCim10List(ArrayOfCim10 value) {
        this.cim10List = value;
    }

}

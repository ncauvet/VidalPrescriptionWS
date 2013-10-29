
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
 *         &lt;element name="apparatusList" type="{urn:Vidal}ArrayOfApparatus"/>
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
    "apparatusList"
})
@XmlRootElement(name = "searchApparatusBySideEffectNameResponse")
public class SearchApparatusBySideEffectNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfApparatus apparatusList;

    /**
     * Gets the value of the apparatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApparatus }
     *     
     */
    public ArrayOfApparatus getApparatusList() {
        return apparatusList;
    }

    /**
     * Sets the value of the apparatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApparatus }
     *     
     */
    public void setApparatusList(ArrayOfApparatus value) {
        this.apparatusList = value;
    }

}

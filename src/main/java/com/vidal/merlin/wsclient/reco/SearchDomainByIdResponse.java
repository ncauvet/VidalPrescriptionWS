
package com.vidal.merlin.wsclient.reco;

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
 *         &lt;element name="recoDomain" type="{urn:Vidal}recoDomain"/>
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
    "recoDomain"
})
@XmlRootElement(name = "searchDomainByIdResponse")
public class SearchDomainByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected RecoDomain recoDomain;

    /**
     * Gets the value of the recoDomain property.
     * 
     * @return
     *     possible object is
     *     {@link RecoDomain }
     *     
     */
    public RecoDomain getRecoDomain() {
        return recoDomain;
    }

    /**
     * Sets the value of the recoDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecoDomain }
     *     
     */
    public void setRecoDomain(RecoDomain value) {
        this.recoDomain = value;
    }

}

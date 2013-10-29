
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
 *         &lt;element name="recoDomainList" type="{urn:Vidal}ArrayOfRecoDomain"/>
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
    "recoDomainList"
})
@XmlRootElement(name = "searchAllDomainsResponse")
public class SearchAllDomainsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfRecoDomain recoDomainList;

    /**
     * Gets the value of the recoDomainList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecoDomain }
     *     
     */
    public ArrayOfRecoDomain getRecoDomainList() {
        return recoDomainList;
    }

    /**
     * Sets the value of the recoDomainList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecoDomain }
     *     
     */
    public void setRecoDomainList(ArrayOfRecoDomain value) {
        this.recoDomainList = value;
    }

}

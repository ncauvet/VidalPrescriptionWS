
package com.vidal.merlin.wsclient.company;

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
 *         &lt;element name="pagedResultCompany" type="{urn:Vidal}pagedResultCompany"/>
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
    "pagedResultCompany"
})
@XmlRootElement(name = "getAllCompaniesResponse")
public class GetAllCompaniesResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCompany pagedResultCompany;

    /**
     * Gets the value of the pagedResultCompany property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCompany }
     *     
     */
    public PagedResultCompany getPagedResultCompany() {
        return pagedResultCompany;
    }

    /**
     * Sets the value of the pagedResultCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCompany }
     *     
     */
    public void setPagedResultCompany(PagedResultCompany value) {
        this.pagedResultCompany = value;
    }

}


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
 *         &lt;element name="pagedResultGalenicForm" type="{urn:Vidal}pagedResultGalenicForm"/>
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
    "pagedResultGalenicForm"
})
@XmlRootElement(name = "getAllGalenicFormsResponse")
public class GetAllGalenicFormsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultGalenicForm pagedResultGalenicForm;

    /**
     * Gets the value of the pagedResultGalenicForm property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultGalenicForm }
     *     
     */
    public PagedResultGalenicForm getPagedResultGalenicForm() {
        return pagedResultGalenicForm;
    }

    /**
     * Sets the value of the pagedResultGalenicForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultGalenicForm }
     *     
     */
    public void setPagedResultGalenicForm(PagedResultGalenicForm value) {
        this.pagedResultGalenicForm = value;
    }

}

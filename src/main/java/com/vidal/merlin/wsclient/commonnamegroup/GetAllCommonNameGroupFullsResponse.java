
package com.vidal.merlin.wsclient.commonnamegroup;

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
 *         &lt;element name="pagedResultCommonNameGroupFull" type="{urn:Vidal}pagedResultCommonNameGroupFull"/>
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
    "pagedResultCommonNameGroupFull"
})
@XmlRootElement(name = "getAllCommonNameGroupFullsResponse")
public class GetAllCommonNameGroupFullsResponse {

    @XmlElement(required = true, nillable = true)
    protected PagedResultCommonNameGroupFull pagedResultCommonNameGroupFull;

    /**
     * Gets the value of the pagedResultCommonNameGroupFull property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResultCommonNameGroupFull }
     *     
     */
    public PagedResultCommonNameGroupFull getPagedResultCommonNameGroupFull() {
        return pagedResultCommonNameGroupFull;
    }

    /**
     * Sets the value of the pagedResultCommonNameGroupFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResultCommonNameGroupFull }
     *     
     */
    public void setPagedResultCommonNameGroupFull(PagedResultCommonNameGroupFull value) {
        this.pagedResultCommonNameGroupFull = value;
    }

}

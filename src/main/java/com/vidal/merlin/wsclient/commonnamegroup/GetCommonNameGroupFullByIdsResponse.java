
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
 *         &lt;element name="commonNameGroupFullList" type="{urn:Vidal}ArrayOfCommonNameGroupFull"/>
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
    "commonNameGroupFullList"
})
@XmlRootElement(name = "getCommonNameGroupFullByIdsResponse")
public class GetCommonNameGroupFullByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupFull commonNameGroupFullList;

    /**
     * Gets the value of the commonNameGroupFullList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupFull }
     *     
     */
    public ArrayOfCommonNameGroupFull getCommonNameGroupFullList() {
        return commonNameGroupFullList;
    }

    /**
     * Sets the value of the commonNameGroupFullList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupFull }
     *     
     */
    public void setCommonNameGroupFullList(ArrayOfCommonNameGroupFull value) {
        this.commonNameGroupFullList = value;
    }

}

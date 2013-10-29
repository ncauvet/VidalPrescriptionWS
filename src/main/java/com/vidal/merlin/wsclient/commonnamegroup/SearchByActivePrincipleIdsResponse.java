
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
 *         &lt;element name="commonNameGroupList" type="{urn:Vidal}ArrayOfCommonNameGroup"/>
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
    "commonNameGroupList"
})
@XmlRootElement(name = "searchByActivePrincipleIdsResponse")
public class SearchByActivePrincipleIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroup commonNameGroupList;

    /**
     * Gets the value of the commonNameGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public ArrayOfCommonNameGroup getCommonNameGroupList() {
        return commonNameGroupList;
    }

    /**
     * Sets the value of the commonNameGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroup }
     *     
     */
    public void setCommonNameGroupList(ArrayOfCommonNameGroup value) {
        this.commonNameGroupList = value;
    }

}

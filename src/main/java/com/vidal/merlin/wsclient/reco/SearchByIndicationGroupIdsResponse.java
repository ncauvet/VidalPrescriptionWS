
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
 *         &lt;element name="recoList" type="{urn:Vidal}ArrayOfReco"/>
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
    "recoList"
})
@XmlRootElement(name = "searchByIndicationGroupIdsResponse")
public class SearchByIndicationGroupIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfReco recoList;

    /**
     * Gets the value of the recoList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReco }
     *     
     */
    public ArrayOfReco getRecoList() {
        return recoList;
    }

    /**
     * Sets the value of the recoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReco }
     *     
     */
    public void setRecoList(ArrayOfReco value) {
        this.recoList = value;
    }

}

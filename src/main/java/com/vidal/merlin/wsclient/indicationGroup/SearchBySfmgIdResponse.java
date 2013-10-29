
package com.vidal.merlin.wsclient.indicationGroup;

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
 *         &lt;element name="indicationGroupList" type="{urn:Vidal}ArrayOfIndicationGroup"/>
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
    "indicationGroupList"
})
@XmlRootElement(name = "searchBySfmgIdResponse")
public class SearchBySfmgIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationGroup indicationGroupList;

    /**
     * Gets the value of the indicationGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationGroup }
     *     
     */
    public ArrayOfIndicationGroup getIndicationGroupList() {
        return indicationGroupList;
    }

    /**
     * Sets the value of the indicationGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationGroup }
     *     
     */
    public void setIndicationGroupList(ArrayOfIndicationGroup value) {
        this.indicationGroupList = value;
    }

}

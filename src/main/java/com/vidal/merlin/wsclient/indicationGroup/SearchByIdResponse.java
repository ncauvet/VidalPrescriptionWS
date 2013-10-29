
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
 *         &lt;element name="indicationGroup" type="{urn:Vidal}indicationGroup"/>
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
    "indicationGroup"
})
@XmlRootElement(name = "searchByIdResponse")
public class SearchByIdResponse {

    @XmlElement(required = true, nillable = true)
    protected IndicationGroup indicationGroup;

    /**
     * Gets the value of the indicationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link IndicationGroup }
     *     
     */
    public IndicationGroup getIndicationGroup() {
        return indicationGroup;
    }

    /**
     * Sets the value of the indicationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationGroup }
     *     
     */
    public void setIndicationGroup(IndicationGroup value) {
        this.indicationGroup = value;
    }

}

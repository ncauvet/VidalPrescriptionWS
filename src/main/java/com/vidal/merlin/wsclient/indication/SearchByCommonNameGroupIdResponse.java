
package com.vidal.merlin.wsclient.indication;

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
 *         &lt;element name="indicationList" type="{urn:Vidal}CommonNameGroupIndicationList"/>
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
    "indicationList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupIndicationList indicationList;

    /**
     * Gets the value of the indicationList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupIndicationList }
     *     
     */
    public CommonNameGroupIndicationList getIndicationList() {
        return indicationList;
    }

    /**
     * Sets the value of the indicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupIndicationList }
     *     
     */
    public void setIndicationList(CommonNameGroupIndicationList value) {
        this.indicationList = value;
    }

}


package com.vidal.merlin.wsclient.contraIndication;

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
 *         &lt;element name="contraIndicationCim10List" type="{urn:Vidal}CommonNameGroupContraIndicationCim10List"/>
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
    "contraIndicationCim10List"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndCim10IdsWithChildrenResponse")
public class SearchByCommonNameGroupIdAndCim10IdsWithChildrenResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationCim10List contraIndicationCim10List;

    /**
     * Gets the value of the contraIndicationCim10List property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationCim10List }
     *     
     */
    public CommonNameGroupContraIndicationCim10List getContraIndicationCim10List() {
        return contraIndicationCim10List;
    }

    /**
     * Sets the value of the contraIndicationCim10List property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationCim10List }
     *     
     */
    public void setContraIndicationCim10List(CommonNameGroupContraIndicationCim10List value) {
        this.contraIndicationCim10List = value;
    }

}

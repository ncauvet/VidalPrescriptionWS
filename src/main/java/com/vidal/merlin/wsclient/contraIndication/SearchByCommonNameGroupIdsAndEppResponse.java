
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
 *         &lt;element name="commonNameGroupContraIndicationEppList" type="{urn:Vidal}CommonNameGroupContraIndicationEppList"/>
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
    "commonNameGroupContraIndicationEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdsAndEppResponse")
public class SearchByCommonNameGroupIdsAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationEppList commonNameGroupContraIndicationEppList;

    /**
     * Gets the value of the commonNameGroupContraIndicationEppList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public CommonNameGroupContraIndicationEppList getCommonNameGroupContraIndicationEppList() {
        return commonNameGroupContraIndicationEppList;
    }

    /**
     * Sets the value of the commonNameGroupContraIndicationEppList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public void setCommonNameGroupContraIndicationEppList(CommonNameGroupContraIndicationEppList value) {
        this.commonNameGroupContraIndicationEppList = value;
    }

}

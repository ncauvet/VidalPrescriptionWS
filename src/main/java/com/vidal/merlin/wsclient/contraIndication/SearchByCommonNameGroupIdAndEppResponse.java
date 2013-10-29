
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
 *         &lt;element name="contraIndicationEppList" type="{urn:Vidal}CommonNameGroupContraIndicationEppList"/>
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
    "contraIndicationEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndEppResponse")
public class SearchByCommonNameGroupIdAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupContraIndicationEppList contraIndicationEppList;

    /**
     * Gets the value of the contraIndicationEppList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public CommonNameGroupContraIndicationEppList getContraIndicationEppList() {
        return contraIndicationEppList;
    }

    /**
     * Sets the value of the contraIndicationEppList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupContraIndicationEppList }
     *     
     */
    public void setContraIndicationEppList(CommonNameGroupContraIndicationEppList value) {
        this.contraIndicationEppList = value;
    }

}

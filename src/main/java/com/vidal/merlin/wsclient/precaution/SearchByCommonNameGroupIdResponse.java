
package com.vidal.merlin.wsclient.precaution;

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
 *         &lt;element name="precautionList" type="{urn:Vidal}CommonNameGroupPrecautionList"/>
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
    "precautionList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPrecautionList precautionList;

    /**
     * Gets the value of the precautionList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPrecautionList }
     *     
     */
    public CommonNameGroupPrecautionList getPrecautionList() {
        return precautionList;
    }

    /**
     * Sets the value of the precautionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPrecautionList }
     *     
     */
    public void setPrecautionList(CommonNameGroupPrecautionList value) {
        this.precautionList = value;
    }

}

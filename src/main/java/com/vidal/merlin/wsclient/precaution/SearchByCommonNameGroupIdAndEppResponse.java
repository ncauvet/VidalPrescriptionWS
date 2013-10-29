
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
 *         &lt;element name="precautionEppList" type="{urn:Vidal}CommonNameGroupPrecautionEppList"/>
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
    "precautionEppList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdAndEppResponse")
public class SearchByCommonNameGroupIdAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPrecautionEppList precautionEppList;

    /**
     * Gets the value of the precautionEppList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPrecautionEppList }
     *     
     */
    public CommonNameGroupPrecautionEppList getPrecautionEppList() {
        return precautionEppList;
    }

    /**
     * Sets the value of the precautionEppList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPrecautionEppList }
     *     
     */
    public void setPrecautionEppList(CommonNameGroupPrecautionEppList value) {
        this.precautionEppList = value;
    }

}

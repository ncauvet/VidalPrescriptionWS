
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
 *         &lt;element name="precautionEppCoupleList" type="{urn:Vidal}ArrayOfPrecautionEPPCouple"/>
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
    "precautionEppCoupleList"
})
@XmlRootElement(name = "searchPrecautionEPPCoupleByIdsResponse")
public class SearchPrecautionEPPCoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionEPPCouple precautionEppCoupleList;

    /**
     * Gets the value of the precautionEppCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionEPPCouple }
     *     
     */
    public ArrayOfPrecautionEPPCouple getPrecautionEppCoupleList() {
        return precautionEppCoupleList;
    }

    /**
     * Sets the value of the precautionEppCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionEPPCouple }
     *     
     */
    public void setPrecautionEppCoupleList(ArrayOfPrecautionEPPCouple value) {
        this.precautionEppCoupleList = value;
    }

}


package com.vidal.merlin.wsclient.lppr;

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
 *         &lt;element name="lpprReimbursementCoupleList" type="{urn:Vidal}ArrayOfLpprReimbursementCouple"/>
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
    "lpprReimbursementCoupleList"
})
@XmlRootElement(name = "getReimbursementScheduleResponse")
public class GetReimbursementScheduleResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLpprReimbursementCouple lpprReimbursementCoupleList;

    /**
     * Gets the value of the lpprReimbursementCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLpprReimbursementCouple }
     *     
     */
    public ArrayOfLpprReimbursementCouple getLpprReimbursementCoupleList() {
        return lpprReimbursementCoupleList;
    }

    /**
     * Sets the value of the lpprReimbursementCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLpprReimbursementCouple }
     *     
     */
    public void setLpprReimbursementCoupleList(ArrayOfLpprReimbursementCouple value) {
        this.lpprReimbursementCoupleList = value;
    }

}

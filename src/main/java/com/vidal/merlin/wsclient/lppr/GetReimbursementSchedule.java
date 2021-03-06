
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
 *         &lt;element name="lpprIds" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="reimbursementScheduleFilter" type="{urn:Vidal}ReimbursementScheduleFilter"/>
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
    "lpprIds",
    "reimbursementScheduleFilter"
})
@XmlRootElement(name = "getReimbursementSchedule")
public class GetReimbursementSchedule {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt lpprIds;
    @XmlElement(required = true, nillable = true)
    protected ReimbursementScheduleFilter reimbursementScheduleFilter;

    /**
     * Gets the value of the lpprIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getLpprIds() {
        return lpprIds;
    }

    /**
     * Sets the value of the lpprIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setLpprIds(ArrayOfInt value) {
        this.lpprIds = value;
    }

    /**
     * Gets the value of the reimbursementScheduleFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursementScheduleFilter }
     *     
     */
    public ReimbursementScheduleFilter getReimbursementScheduleFilter() {
        return reimbursementScheduleFilter;
    }

    /**
     * Sets the value of the reimbursementScheduleFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursementScheduleFilter }
     *     
     */
    public void setReimbursementScheduleFilter(ReimbursementScheduleFilter value) {
        this.reimbursementScheduleFilter = value;
    }

}

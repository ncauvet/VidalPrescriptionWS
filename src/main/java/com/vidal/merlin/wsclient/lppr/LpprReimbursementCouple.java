
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lpprReimbursementCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lpprReimbursementCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lppr" type="{urn:Vidal}lppr"/>
 *         &lt;element name="lpprRegistration" type="{urn:Vidal}lpprRegistration"/>
 *         &lt;element name="lpprReimbursementScheduleItemList" type="{urn:Vidal}ArrayOfLpprReimbursementScheduleItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lpprReimbursementCouple", propOrder = {
    "lppr",
    "lpprRegistration",
    "lpprReimbursementScheduleItemList"
})
public class LpprReimbursementCouple {

    @XmlElement(required = true, nillable = true)
    protected Lppr lppr;
    @XmlElement(required = true, nillable = true)
    protected LpprRegistration lpprRegistration;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLpprReimbursementScheduleItem lpprReimbursementScheduleItemList;

    /**
     * Gets the value of the lppr property.
     * 
     * @return
     *     possible object is
     *     {@link Lppr }
     *     
     */
    public Lppr getLppr() {
        return lppr;
    }

    /**
     * Sets the value of the lppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lppr }
     *     
     */
    public void setLppr(Lppr value) {
        this.lppr = value;
    }

    /**
     * Gets the value of the lpprRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link LpprRegistration }
     *     
     */
    public LpprRegistration getLpprRegistration() {
        return lpprRegistration;
    }

    /**
     * Sets the value of the lpprRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpprRegistration }
     *     
     */
    public void setLpprRegistration(LpprRegistration value) {
        this.lpprRegistration = value;
    }

    /**
     * Gets the value of the lpprReimbursementScheduleItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLpprReimbursementScheduleItem }
     *     
     */
    public ArrayOfLpprReimbursementScheduleItem getLpprReimbursementScheduleItemList() {
        return lpprReimbursementScheduleItemList;
    }

    /**
     * Sets the value of the lpprReimbursementScheduleItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLpprReimbursementScheduleItem }
     *     
     */
    public void setLpprReimbursementScheduleItemList(ArrayOfLpprReimbursementScheduleItem value) {
        this.lpprReimbursementScheduleItemList = value;
    }

}

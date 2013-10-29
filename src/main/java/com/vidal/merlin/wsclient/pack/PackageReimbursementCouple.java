
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageReimbursementCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packageReimbursementCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pack" type="{urn:Vidal}pack"/>
 *         &lt;element name="priceScheduleItemList" type="{urn:Vidal}ArrayOfPackagePriceScheduleItem"/>
 *         &lt;element name="reimbursementScheduleItemList" type="{urn:Vidal}ArrayOfPackageReimbursementScheduleItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageReimbursementCouple", propOrder = {
    "pack",
    "priceScheduleItemList",
    "reimbursementScheduleItemList"
})
public class PackageReimbursementCouple {

    @XmlElement(required = true, nillable = true)
    protected Pack pack;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackagePriceScheduleItem priceScheduleItemList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackageReimbursementScheduleItem reimbursementScheduleItemList;

    /**
     * Gets the value of the pack property.
     * 
     * @return
     *     possible object is
     *     {@link Pack }
     *     
     */
    public Pack getPack() {
        return pack;
    }

    /**
     * Sets the value of the pack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pack }
     *     
     */
    public void setPack(Pack value) {
        this.pack = value;
    }

    /**
     * Gets the value of the priceScheduleItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackagePriceScheduleItem }
     *     
     */
    public ArrayOfPackagePriceScheduleItem getPriceScheduleItemList() {
        return priceScheduleItemList;
    }

    /**
     * Sets the value of the priceScheduleItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackagePriceScheduleItem }
     *     
     */
    public void setPriceScheduleItemList(ArrayOfPackagePriceScheduleItem value) {
        this.priceScheduleItemList = value;
    }

    /**
     * Gets the value of the reimbursementScheduleItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageReimbursementScheduleItem }
     *     
     */
    public ArrayOfPackageReimbursementScheduleItem getReimbursementScheduleItemList() {
        return reimbursementScheduleItemList;
    }

    /**
     * Sets the value of the reimbursementScheduleItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageReimbursementScheduleItem }
     *     
     */
    public void setReimbursementScheduleItemList(ArrayOfPackageReimbursementScheduleItem value) {
        this.reimbursementScheduleItemList = value;
    }

}

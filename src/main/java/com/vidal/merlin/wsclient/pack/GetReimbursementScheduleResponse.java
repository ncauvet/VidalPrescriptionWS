
package com.vidal.merlin.wsclient.pack;

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
 *         &lt;element name="packageReimbursementCoupleList" type="{urn:Vidal}ArrayOfPackageReimbursementCouple"/>
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
    "packageReimbursementCoupleList"
})
@XmlRootElement(name = "getReimbursementScheduleResponse")
public class GetReimbursementScheduleResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackageReimbursementCouple packageReimbursementCoupleList;

    /**
     * Gets the value of the packageReimbursementCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageReimbursementCouple }
     *     
     */
    public ArrayOfPackageReimbursementCouple getPackageReimbursementCoupleList() {
        return packageReimbursementCoupleList;
    }

    /**
     * Sets the value of the packageReimbursementCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageReimbursementCouple }
     *     
     */
    public void setPackageReimbursementCoupleList(ArrayOfPackageReimbursementCouple value) {
        this.packageReimbursementCoupleList = value;
    }

}

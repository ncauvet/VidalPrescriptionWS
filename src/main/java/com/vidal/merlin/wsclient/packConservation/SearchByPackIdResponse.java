
package com.vidal.merlin.wsclient.packConservation;

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
 *         &lt;element name="packConservationList" type="{urn:Vidal}ArrayOfPackageConservation"/>
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
    "packConservationList"
})
@XmlRootElement(name = "searchByPackIdResponse")
public class SearchByPackIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPackageConservation packConservationList;

    /**
     * Gets the value of the packConservationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageConservation }
     *     
     */
    public ArrayOfPackageConservation getPackConservationList() {
        return packConservationList;
    }

    /**
     * Sets the value of the packConservationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageConservation }
     *     
     */
    public void setPackConservationList(ArrayOfPackageConservation value) {
        this.packConservationList = value;
    }

}

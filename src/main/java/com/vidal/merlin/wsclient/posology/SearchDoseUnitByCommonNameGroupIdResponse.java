
package com.vidal.merlin.wsclient.posology;

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
 *         &lt;element name="doseUnitList" type="{urn:Vidal}ArrayOfDoseUnit"/>
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
    "doseUnitList"
})
@XmlRootElement(name = "searchDoseUnitByCommonNameGroupIdResponse")
public class SearchDoseUnitByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDoseUnit doseUnitList;

    /**
     * Gets the value of the doseUnitList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDoseUnit }
     *     
     */
    public ArrayOfDoseUnit getDoseUnitList() {
        return doseUnitList;
    }

    /**
     * Sets the value of the doseUnitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDoseUnit }
     *     
     */
    public void setDoseUnitList(ArrayOfDoseUnit value) {
        this.doseUnitList = value;
    }

}


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
 *         &lt;element name="precautionCim10CoupleList" type="{urn:Vidal}ArrayOfPrecautionCim10Couple"/>
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
    "precautionCim10CoupleList"
})
@XmlRootElement(name = "searchPrecautionCim10CoupleByIdsResponse")
public class SearchPrecautionCim10CoupleByIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionCim10Couple precautionCim10CoupleList;

    /**
     * Gets the value of the precautionCim10CoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecautionCim10Couple }
     *     
     */
    public ArrayOfPrecautionCim10Couple getPrecautionCim10CoupleList() {
        return precautionCim10CoupleList;
    }

    /**
     * Sets the value of the precautionCim10CoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionCim10Couple }
     *     
     */
    public void setPrecautionCim10CoupleList(ArrayOfPrecautionCim10Couple value) {
        this.precautionCim10CoupleList = value;
    }

}

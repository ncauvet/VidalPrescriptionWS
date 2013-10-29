
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
 *         &lt;element name="posologyUnitList" type="{urn:Vidal}CommonNameGroupPosologyUnitList"/>
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
    "posologyUnitList"
})
@XmlRootElement(name = "searchPosologyUnitByCommonNameGroupIdResponse")
public class SearchPosologyUnitByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPosologyUnitList posologyUnitList;

    /**
     * Gets the value of the posologyUnitList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPosologyUnitList }
     *     
     */
    public CommonNameGroupPosologyUnitList getPosologyUnitList() {
        return posologyUnitList;
    }

    /**
     * Sets the value of the posologyUnitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPosologyUnitList }
     *     
     */
    public void setPosologyUnitList(CommonNameGroupPosologyUnitList value) {
        this.posologyUnitList = value;
    }

}

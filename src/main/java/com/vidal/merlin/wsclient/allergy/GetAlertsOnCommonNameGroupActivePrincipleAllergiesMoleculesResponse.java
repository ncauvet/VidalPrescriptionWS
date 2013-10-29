
package com.vidal.merlin.wsclient.allergy;

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
 *         &lt;element name="commonNameGroupMoleculeCoupleList" type="{urn:Vidal}ArrayOfCommonNameGroupMoleculeCouple"/>
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
    "commonNameGroupMoleculeCoupleList"
})
@XmlRootElement(name = "getAlertsOnCommonNameGroupActivePrincipleAllergiesMoleculesResponse")
public class GetAlertsOnCommonNameGroupActivePrincipleAllergiesMoleculesResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCommonNameGroupMoleculeCouple commonNameGroupMoleculeCoupleList;

    /**
     * Gets the value of the commonNameGroupMoleculeCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public ArrayOfCommonNameGroupMoleculeCouple getCommonNameGroupMoleculeCoupleList() {
        return commonNameGroupMoleculeCoupleList;
    }

    /**
     * Sets the value of the commonNameGroupMoleculeCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommonNameGroupMoleculeCouple }
     *     
     */
    public void setCommonNameGroupMoleculeCoupleList(ArrayOfCommonNameGroupMoleculeCouple value) {
        this.commonNameGroupMoleculeCoupleList = value;
    }

}

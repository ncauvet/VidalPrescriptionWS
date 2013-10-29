
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
 *         &lt;element name="productMoleculeCoupleList" type="{urn:Vidal}ArrayOfProductMoleculeCouple"/>
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
    "productMoleculeCoupleList"
})
@XmlRootElement(name = "getAlertsOnAllergiesMoleculesResponse")
public class GetAlertsOnAllergiesMoleculesResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductMoleculeCouple productMoleculeCoupleList;

    /**
     * Gets the value of the productMoleculeCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductMoleculeCouple }
     *     
     */
    public ArrayOfProductMoleculeCouple getProductMoleculeCoupleList() {
        return productMoleculeCoupleList;
    }

    /**
     * Sets the value of the productMoleculeCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductMoleculeCouple }
     *     
     */
    public void setProductMoleculeCoupleList(ArrayOfProductMoleculeCouple value) {
        this.productMoleculeCoupleList = value;
    }

}

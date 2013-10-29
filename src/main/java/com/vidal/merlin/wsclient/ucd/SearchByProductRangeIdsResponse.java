
package com.vidal.merlin.wsclient.ucd;

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
 *         &lt;element name="ProductRangeUcdCoupleList" type="{urn:Vidal}ArrayOfProductRangeUcdCouple"/>
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
    "productRangeUcdCoupleList"
})
@XmlRootElement(name = "searchByProductRangeIdsResponse")
public class SearchByProductRangeIdsResponse {

    @XmlElement(name = "ProductRangeUcdCoupleList", required = true, nillable = true)
    protected ArrayOfProductRangeUcdCouple productRangeUcdCoupleList;

    /**
     * Gets the value of the productRangeUcdCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRangeUcdCouple }
     *     
     */
    public ArrayOfProductRangeUcdCouple getProductRangeUcdCoupleList() {
        return productRangeUcdCoupleList;
    }

    /**
     * Sets the value of the productRangeUcdCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRangeUcdCouple }
     *     
     */
    public void setProductRangeUcdCoupleList(ArrayOfProductRangeUcdCouple value) {
        this.productRangeUcdCoupleList = value;
    }

}

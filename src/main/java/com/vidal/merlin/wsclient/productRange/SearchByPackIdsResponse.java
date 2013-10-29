
package com.vidal.merlin.wsclient.productRange;

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
 *         &lt;element name="productRangePackCoupleList" type="{urn:Vidal}ArrayOfProductRangePackCouple"/>
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
    "productRangePackCoupleList"
})
@XmlRootElement(name = "searchByPackIdsResponse")
public class SearchByPackIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductRangePackCouple productRangePackCoupleList;

    /**
     * Gets the value of the productRangePackCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRangePackCouple }
     *     
     */
    public ArrayOfProductRangePackCouple getProductRangePackCoupleList() {
        return productRangePackCoupleList;
    }

    /**
     * Sets the value of the productRangePackCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRangePackCouple }
     *     
     */
    public void setProductRangePackCoupleList(ArrayOfProductRangePackCouple value) {
        this.productRangePackCoupleList = value;
    }

}

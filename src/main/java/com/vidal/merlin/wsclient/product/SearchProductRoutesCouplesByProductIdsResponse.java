
package com.vidal.merlin.wsclient.product;

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
 *         &lt;element name="ProductRouteListCoupleList" type="{urn:Vidal}ArrayOfProductRouteListCouple"/>
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
    "productRouteListCoupleList"
})
@XmlRootElement(name = "searchProductRoutesCouplesByProductIdsResponse")
public class SearchProductRoutesCouplesByProductIdsResponse {

    @XmlElement(name = "ProductRouteListCoupleList", required = true, nillable = true)
    protected ArrayOfProductRouteListCouple productRouteListCoupleList;

    /**
     * Gets the value of the productRouteListCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductRouteListCouple }
     *     
     */
    public ArrayOfProductRouteListCouple getProductRouteListCoupleList() {
        return productRouteListCoupleList;
    }

    /**
     * Sets the value of the productRouteListCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductRouteListCouple }
     *     
     */
    public void setProductRouteListCoupleList(ArrayOfProductRouteListCouple value) {
        this.productRouteListCoupleList = value;
    }

}

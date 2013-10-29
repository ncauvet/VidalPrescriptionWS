
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
 *         &lt;element name="productIndicatorsList" type="{urn:Vidal}ArrayOfProductIndicators"/>
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
    "productIndicatorsList"
})
@XmlRootElement(name = "searchProductIndicatorsByProductIdsResponse")
public class SearchProductIndicatorsByProductIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductIndicators productIndicatorsList;

    /**
     * Gets the value of the productIndicatorsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductIndicators }
     *     
     */
    public ArrayOfProductIndicators getProductIndicatorsList() {
        return productIndicatorsList;
    }

    /**
     * Sets the value of the productIndicatorsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductIndicators }
     *     
     */
    public void setProductIndicatorsList(ArrayOfProductIndicators value) {
        this.productIndicatorsList = value;
    }

}

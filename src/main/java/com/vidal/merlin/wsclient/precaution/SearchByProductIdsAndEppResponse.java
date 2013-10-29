
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
 *         &lt;element name="productPrecautionEppList" type="{http://contraindication.api.vidal.com}ProductPrecautionEppList"/>
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
    "productPrecautionEppList"
})
@XmlRootElement(name = "searchByProductIdsAndEppResponse")
public class SearchByProductIdsAndEppResponse {

    @XmlElement(required = true, nillable = true)
    protected ProductPrecautionEppList productPrecautionEppList;

    /**
     * Gets the value of the productPrecautionEppList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPrecautionEppList }
     *     
     */
    public ProductPrecautionEppList getProductPrecautionEppList() {
        return productPrecautionEppList;
    }

    /**
     * Sets the value of the productPrecautionEppList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPrecautionEppList }
     *     
     */
    public void setProductPrecautionEppList(ProductPrecautionEppList value) {
        this.productPrecautionEppList = value;
    }

}

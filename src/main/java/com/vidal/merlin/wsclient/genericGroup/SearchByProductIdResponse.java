
package com.vidal.merlin.wsclient.genericGroup;

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
 *         &lt;element name="productGenericGroupList" type="{urn:Vidal}ArrayOfProductGenericGroup"/>
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
    "productGenericGroupList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductGenericGroup productGenericGroupList;

    /**
     * Gets the value of the productGenericGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductGenericGroup }
     *     
     */
    public ArrayOfProductGenericGroup getProductGenericGroupList() {
        return productGenericGroupList;
    }

    /**
     * Sets the value of the productGenericGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductGenericGroup }
     *     
     */
    public void setProductGenericGroupList(ArrayOfProductGenericGroup value) {
        this.productGenericGroupList = value;
    }

}


package com.vidal.merlin.wsclient.ucd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductRangeUcdCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductRangeUcdCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productRangeUcdCouple" type="{urn:Vidal}productRangeUcdCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductRangeUcdCouple", propOrder = {
    "productRangeUcdCouple"
})
public class ArrayOfProductRangeUcdCouple {

    @XmlElement(nillable = true)
    protected List<ProductRangeUcdCouple> productRangeUcdCouple;

    /**
     * Gets the value of the productRangeUcdCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRangeUcdCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRangeUcdCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRangeUcdCouple }
     * 
     * 
     */
    public List<ProductRangeUcdCouple> getProductRangeUcdCouple() {
        if (productRangeUcdCouple == null) {
            productRangeUcdCouple = new ArrayList<ProductRangeUcdCouple>();
        }
        return this.productRangeUcdCouple;
    }

}

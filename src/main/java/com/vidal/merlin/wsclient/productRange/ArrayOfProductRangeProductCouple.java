
package com.vidal.merlin.wsclient.productRange;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductRangeProductCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductRangeProductCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productRangeProductCouple" type="{urn:Vidal}productRangeProductCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductRangeProductCouple", propOrder = {
    "productRangeProductCouple"
})
public class ArrayOfProductRangeProductCouple {

    @XmlElement(nillable = true)
    protected List<ProductRangeProductCouple> productRangeProductCouple;

    /**
     * Gets the value of the productRangeProductCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRangeProductCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRangeProductCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRangeProductCouple }
     * 
     * 
     */
    public List<ProductRangeProductCouple> getProductRangeProductCouple() {
        if (productRangeProductCouple == null) {
            productRangeProductCouple = new ArrayList<ProductRangeProductCouple>();
        }
        return this.productRangeProductCouple;
    }

}

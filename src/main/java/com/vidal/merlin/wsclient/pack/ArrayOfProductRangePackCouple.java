
package com.vidal.merlin.wsclient.pack;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductRangePackCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductRangePackCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productRangePackCouple" type="{urn:Vidal}productRangePackCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductRangePackCouple", propOrder = {
    "productRangePackCouple"
})
public class ArrayOfProductRangePackCouple {

    @XmlElement(nillable = true)
    protected List<ProductRangePackCouple> productRangePackCouple;

    /**
     * Gets the value of the productRangePackCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productRangePackCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductRangePackCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductRangePackCouple }
     * 
     * 
     */
    public List<ProductRangePackCouple> getProductRangePackCouple() {
        if (productRangePackCouple == null) {
            productRangePackCouple = new ArrayList<ProductRangePackCouple>();
        }
        return this.productRangePackCouple;
    }

}

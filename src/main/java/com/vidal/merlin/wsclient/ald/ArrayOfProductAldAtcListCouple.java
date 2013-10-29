
package com.vidal.merlin.wsclient.ald;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductAldAtcListCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductAldAtcListCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productAldAtcListCouple" type="{urn:Vidal}productAldAtcListCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductAldAtcListCouple", propOrder = {
    "productAldAtcListCouple"
})
public class ArrayOfProductAldAtcListCouple {

    @XmlElement(nillable = true)
    protected List<ProductAldAtcListCouple> productAldAtcListCouple;

    /**
     * Gets the value of the productAldAtcListCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAldAtcListCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAldAtcListCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAldAtcListCouple }
     * 
     * 
     */
    public List<ProductAldAtcListCouple> getProductAldAtcListCouple() {
        if (productAldAtcListCouple == null) {
            productAldAtcListCouple = new ArrayList<ProductAldAtcListCouple>();
        }
        return this.productAldAtcListCouple;
    }

}

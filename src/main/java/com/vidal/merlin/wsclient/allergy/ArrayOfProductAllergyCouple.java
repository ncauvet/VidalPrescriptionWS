
package com.vidal.merlin.wsclient.allergy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductAllergyCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductAllergyCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productAllergyCouple" type="{urn:Vidal}productAllergyCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductAllergyCouple", propOrder = {
    "productAllergyCouple"
})
public class ArrayOfProductAllergyCouple {

    @XmlElement(nillable = true)
    protected List<ProductAllergyCouple> productAllergyCouple;

    /**
     * Gets the value of the productAllergyCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAllergyCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAllergyCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAllergyCouple }
     * 
     * 
     */
    public List<ProductAllergyCouple> getProductAllergyCouple() {
        if (productAllergyCouple == null) {
            productAllergyCouple = new ArrayList<ProductAllergyCouple>();
        }
        return this.productAllergyCouple;
    }

}

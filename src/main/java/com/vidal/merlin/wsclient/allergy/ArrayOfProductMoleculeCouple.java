
package com.vidal.merlin.wsclient.allergy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductMoleculeCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductMoleculeCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productMoleculeCouple" type="{urn:Vidal}productMoleculeCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductMoleculeCouple", propOrder = {
    "productMoleculeCouple"
})
public class ArrayOfProductMoleculeCouple {

    @XmlElement(nillable = true)
    protected List<ProductMoleculeCouple> productMoleculeCouple;

    /**
     * Gets the value of the productMoleculeCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMoleculeCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMoleculeCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMoleculeCouple }
     * 
     * 
     */
    public List<ProductMoleculeCouple> getProductMoleculeCouple() {
        if (productMoleculeCouple == null) {
            productMoleculeCouple = new ArrayList<ProductMoleculeCouple>();
        }
        return this.productMoleculeCouple;
    }

}

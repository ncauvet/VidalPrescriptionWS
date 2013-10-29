
package com.vidal.merlin.wsclient.sideEffect;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductSideEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductSideEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productSideEffect" type="{urn:Vidal}productSideEffect" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductSideEffect", propOrder = {
    "productSideEffect"
})
public class ArrayOfProductSideEffect {

    @XmlElement(nillable = true)
    protected List<ProductSideEffect> productSideEffect;

    /**
     * Gets the value of the productSideEffect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSideEffect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSideEffect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSideEffect }
     * 
     * 
     */
    public List<ProductSideEffect> getProductSideEffect() {
        if (productSideEffect == null) {
            productSideEffect = new ArrayList<ProductSideEffect>();
        }
        return this.productSideEffect;
    }

}


package com.vidal.merlin.wsclient.composition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCommonNameGroupComposition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommonNameGroupComposition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupComposition" type="{urn:Vidal}commonNameGroupComposition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommonNameGroupComposition", propOrder = {
    "commonNameGroupComposition"
})
public class ArrayOfCommonNameGroupComposition {

    @XmlElement(nillable = true)
    protected List<CommonNameGroupComposition> commonNameGroupComposition;

    /**
     * Gets the value of the commonNameGroupComposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonNameGroupComposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonNameGroupComposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonNameGroupComposition }
     * 
     * 
     */
    public List<CommonNameGroupComposition> getCommonNameGroupComposition() {
        if (commonNameGroupComposition == null) {
            commonNameGroupComposition = new ArrayList<CommonNameGroupComposition>();
        }
        return this.commonNameGroupComposition;
    }

}

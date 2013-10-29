
package com.vidal.merlin.wsclient.sideEffect;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSideEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSideEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sideEffect" type="{urn:Vidal}sideEffect" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSideEffect", propOrder = {
    "sideEffect"
})
public class ArrayOfSideEffect {

    @XmlElement(nillable = true)
    protected List<SideEffect> sideEffect;

    /**
     * Gets the value of the sideEffect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideEffect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideEffect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SideEffect }
     * 
     * 
     */
    public List<SideEffect> getSideEffect() {
        if (sideEffect == null) {
            sideEffect = new ArrayList<SideEffect>();
        }
        return this.sideEffect;
    }

}

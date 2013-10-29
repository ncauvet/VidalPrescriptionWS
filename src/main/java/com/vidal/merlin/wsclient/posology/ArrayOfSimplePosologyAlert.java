
package com.vidal.merlin.wsclient.posology;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSimplePosologyAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSimplePosologyAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simplePosologyAlert" type="{urn:Vidal}simplePosologyAlert" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSimplePosologyAlert", propOrder = {
    "simplePosologyAlert"
})
public class ArrayOfSimplePosologyAlert {

    @XmlElement(nillable = true)
    protected List<SimplePosologyAlert> simplePosologyAlert;

    /**
     * Gets the value of the simplePosologyAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simplePosologyAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimplePosologyAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePosologyAlert }
     * 
     * 
     */
    public List<SimplePosologyAlert> getSimplePosologyAlert() {
        if (simplePosologyAlert == null) {
            simplePosologyAlert = new ArrayList<SimplePosologyAlert>();
        }
        return this.simplePosologyAlert;
    }

}

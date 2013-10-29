
package com.vidal.merlin.wsclient.ucd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRatioPosologyUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRatioPosologyUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratioPosologyUnit" type="{urn:Vidal}ratioPosologyUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRatioPosologyUnit", propOrder = {
    "ratioPosologyUnit"
})
public class ArrayOfRatioPosologyUnit {

    @XmlElement(nillable = true)
    protected List<RatioPosologyUnit> ratioPosologyUnit;

    /**
     * Gets the value of the ratioPosologyUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratioPosologyUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatioPosologyUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatioPosologyUnit }
     * 
     * 
     */
    public List<RatioPosologyUnit> getRatioPosologyUnit() {
        if (ratioPosologyUnit == null) {
            ratioPosologyUnit = new ArrayList<RatioPosologyUnit>();
        }
        return this.ratioPosologyUnit;
    }

}

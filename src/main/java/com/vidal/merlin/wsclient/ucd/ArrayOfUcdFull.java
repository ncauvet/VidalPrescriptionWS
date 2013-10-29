
package com.vidal.merlin.wsclient.ucd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUcdFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUcdFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ucdFull" type="{urn:Vidal}ucdFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUcdFull", propOrder = {
    "ucdFull"
})
public class ArrayOfUcdFull {

    @XmlElement(nillable = true)
    protected List<UcdFull> ucdFull;

    /**
     * Gets the value of the ucdFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucdFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcdFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcdFull }
     * 
     * 
     */
    public List<UcdFull> getUcdFull() {
        if (ucdFull == null) {
            ucdFull = new ArrayList<UcdFull>();
        }
        return this.ucdFull;
    }

}

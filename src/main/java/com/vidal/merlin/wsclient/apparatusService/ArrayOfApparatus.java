
package com.vidal.merlin.wsclient.apparatusService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfApparatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfApparatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apparatus" type="{urn:Vidal}apparatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApparatus", propOrder = {
    "apparatus"
})
public class ArrayOfApparatus {

    @XmlElement(nillable = true)
    protected List<Apparatus> apparatus;

    /**
     * Gets the value of the apparatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apparatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApparatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Apparatus }
     * 
     * 
     */
    public List<Apparatus> getApparatus() {
        if (apparatus == null) {
            apparatus = new ArrayList<Apparatus>();
        }
        return this.apparatus;
    }

}

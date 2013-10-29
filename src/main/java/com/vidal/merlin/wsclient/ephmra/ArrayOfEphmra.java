
package com.vidal.merlin.wsclient.ephmra;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEphmra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEphmra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ephmra" type="{urn:Vidal}ephmra" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEphmra", propOrder = {
    "ephmra"
})
public class ArrayOfEphmra {

    @XmlElement(nillable = true)
    protected List<Ephmra> ephmra;

    /**
     * Gets the value of the ephmra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ephmra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEphmra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ephmra }
     * 
     * 
     */
    public List<Ephmra> getEphmra() {
        if (ephmra == null) {
            ephmra = new ArrayList<Ephmra>();
        }
        return this.ephmra;
    }

}

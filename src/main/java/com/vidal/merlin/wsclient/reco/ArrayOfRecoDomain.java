
package com.vidal.merlin.wsclient.reco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecoDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecoDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recoDomain" type="{urn:Vidal}recoDomain" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecoDomain", propOrder = {
    "recoDomain"
})
public class ArrayOfRecoDomain {

    @XmlElement(nillable = true)
    protected List<RecoDomain> recoDomain;

    /**
     * Gets the value of the recoDomain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoDomain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecoDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecoDomain }
     * 
     * 
     */
    public List<RecoDomain> getRecoDomain() {
        if (recoDomain == null) {
            recoDomain = new ArrayList<RecoDomain>();
        }
        return this.recoDomain;
    }

}

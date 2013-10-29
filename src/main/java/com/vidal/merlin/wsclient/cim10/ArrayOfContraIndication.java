
package com.vidal.merlin.wsclient.cim10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContraIndication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContraIndication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contraIndication" type="{urn:Vidal}contraIndication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContraIndication", propOrder = {
    "contraIndication"
})
public class ArrayOfContraIndication {

    @XmlElement(nillable = true)
    protected List<ContraIndication> contraIndication;

    /**
     * Gets the value of the contraIndication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contraIndication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContraIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContraIndication }
     * 
     * 
     */
    public List<ContraIndication> getContraIndication() {
        if (contraIndication == null) {
            contraIndication = new ArrayList<ContraIndication>();
        }
        return this.contraIndication;
    }

}

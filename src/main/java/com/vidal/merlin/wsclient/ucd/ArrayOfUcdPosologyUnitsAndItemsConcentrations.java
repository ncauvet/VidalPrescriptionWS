
package com.vidal.merlin.wsclient.ucd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUcdPosologyUnitsAndItemsConcentrations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUcdPosologyUnitsAndItemsConcentrations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ucdPosologyUnitsAndItemsConcentrations" type="{urn:Vidal}ucdPosologyUnitsAndItemsConcentrations" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUcdPosologyUnitsAndItemsConcentrations", propOrder = {
    "ucdPosologyUnitsAndItemsConcentrations"
})
public class ArrayOfUcdPosologyUnitsAndItemsConcentrations {

    @XmlElement(nillable = true)
    protected List<UcdPosologyUnitsAndItemsConcentrations> ucdPosologyUnitsAndItemsConcentrations;

    /**
     * Gets the value of the ucdPosologyUnitsAndItemsConcentrations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucdPosologyUnitsAndItemsConcentrations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcdPosologyUnitsAndItemsConcentrations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcdPosologyUnitsAndItemsConcentrations }
     * 
     * 
     */
    public List<UcdPosologyUnitsAndItemsConcentrations> getUcdPosologyUnitsAndItemsConcentrations() {
        if (ucdPosologyUnitsAndItemsConcentrations == null) {
            ucdPosologyUnitsAndItemsConcentrations = new ArrayList<UcdPosologyUnitsAndItemsConcentrations>();
        }
        return this.ucdPosologyUnitsAndItemsConcentrations;
    }

}

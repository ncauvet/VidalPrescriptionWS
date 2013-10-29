
package com.vidal.merlin.wsclient.ucd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUcdPosologyUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUcdPosologyUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ucdPosologyUnit" type="{urn:Vidal}ucdPosologyUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUcdPosologyUnit", propOrder = {
    "ucdPosologyUnit"
})
public class ArrayOfUcdPosologyUnit {

    @XmlElement(nillable = true)
    protected List<UcdPosologyUnit> ucdPosologyUnit;

    /**
     * Gets the value of the ucdPosologyUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucdPosologyUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcdPosologyUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UcdPosologyUnit }
     * 
     * 
     */
    public List<UcdPosologyUnit> getUcdPosologyUnit() {
        if (ucdPosologyUnit == null) {
            ucdPosologyUnit = new ArrayList<UcdPosologyUnit>();
        }
        return this.ucdPosologyUnit;
    }

}


package com.vidal.merlin.wsclient.posology;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfActivePrincipleDoses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActivePrincipleDoses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivePrincipleDoses" type="{http://posology.api.vidal.com}ActivePrincipleDoses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActivePrincipleDoses", namespace = "http://posology.api.vidal.com", propOrder = {
    "activePrincipleDoses"
})
public class ArrayOfActivePrincipleDoses {

    @XmlElement(name = "ActivePrincipleDoses", nillable = true)
    protected List<ActivePrincipleDoses> activePrincipleDoses;

    /**
     * Gets the value of the activePrincipleDoses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activePrincipleDoses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivePrincipleDoses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivePrincipleDoses }
     * 
     * 
     */
    public List<ActivePrincipleDoses> getActivePrincipleDoses() {
        if (activePrincipleDoses == null) {
            activePrincipleDoses = new ArrayList<ActivePrincipleDoses>();
        }
        return this.activePrincipleDoses;
    }

}

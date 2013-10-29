
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAlertOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAlertOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertOutput" type="{urn:Vidal}AlertOutput" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAlertOutput", propOrder = {
    "alertOutput"
})
public class ArrayOfAlertOutput {

    @XmlElement(name = "AlertOutput", nillable = true)
    protected List<AlertOutput> alertOutput;

    /**
     * Gets the value of the alertOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertOutput }
     * 
     * 
     */
    public List<AlertOutput> getAlertOutput() {
        if (alertOutput == null) {
            alertOutput = new ArrayList<AlertOutput>();
        }
        return this.alertOutput;
    }

}

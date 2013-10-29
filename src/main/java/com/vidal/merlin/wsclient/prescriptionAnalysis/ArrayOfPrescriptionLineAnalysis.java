
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrescriptionLineAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrescriptionLineAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prescriptionLineAnalysis" type="{urn:Vidal}prescriptionLineAnalysis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrescriptionLineAnalysis", propOrder = {
    "prescriptionLineAnalysis"
})
public class ArrayOfPrescriptionLineAnalysis {

    @XmlElement(nillable = true)
    protected List<PrescriptionLineAnalysis> prescriptionLineAnalysis;

    /**
     * Gets the value of the prescriptionLineAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prescriptionLineAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrescriptionLineAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrescriptionLineAnalysis }
     * 
     * 
     */
    public List<PrescriptionLineAnalysis> getPrescriptionLineAnalysis() {
        if (prescriptionLineAnalysis == null) {
            prescriptionLineAnalysis = new ArrayList<PrescriptionLineAnalysis>();
        }
        return this.prescriptionLineAnalysis;
    }

}

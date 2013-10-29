
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCodedReco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCodedReco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codedReco" type="{urn:Vidal}codedReco" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCodedReco", propOrder = {
    "codedReco"
})
public class ArrayOfCodedReco {

    @XmlElement(nillable = true)
    protected List<CodedReco> codedReco;

    /**
     * Gets the value of the codedReco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codedReco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodedReco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedReco }
     * 
     * 
     */
    public List<CodedReco> getCodedReco() {
        if (codedReco == null) {
            codedReco = new ArrayList<CodedReco>();
        }
        return this.codedReco;
    }

}

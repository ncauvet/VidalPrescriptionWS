
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRelatedRecoSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRelatedRecoSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedRecoSource" type="{urn:Vidal}relatedRecoSource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRelatedRecoSource", propOrder = {
    "relatedRecoSource"
})
public class ArrayOfRelatedRecoSource {

    @XmlElement(nillable = true)
    protected List<RelatedRecoSource> relatedRecoSource;

    /**
     * Gets the value of the relatedRecoSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedRecoSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedRecoSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedRecoSource }
     * 
     * 
     */
    public List<RelatedRecoSource> getRelatedRecoSource() {
        if (relatedRecoSource == null) {
            relatedRecoSource = new ArrayList<RelatedRecoSource>();
        }
        return this.relatedRecoSource;
    }

}

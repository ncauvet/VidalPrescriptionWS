
package com.vidal.merlin.wsclient.indicationGroup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIndicationGroupScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIndicationGroupScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicationGroupScore" type="{urn:Vidal}indicationGroupScore" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIndicationGroupScore", propOrder = {
    "indicationGroupScore"
})
public class ArrayOfIndicationGroupScore {

    @XmlElement(nillable = true)
    protected List<IndicationGroupScore> indicationGroupScore;

    /**
     * Gets the value of the indicationGroupScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicationGroupScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicationGroupScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationGroupScore }
     * 
     * 
     */
    public List<IndicationGroupScore> getIndicationGroupScore() {
        if (indicationGroupScore == null) {
            indicationGroupScore = new ArrayList<IndicationGroupScore>();
        }
        return this.indicationGroupScore;
    }

}

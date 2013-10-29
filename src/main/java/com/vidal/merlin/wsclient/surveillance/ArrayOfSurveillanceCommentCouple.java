
package com.vidal.merlin.wsclient.surveillance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSurveillanceCommentCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSurveillanceCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveillanceCommentCouple" type="{urn:Vidal}surveillanceCommentCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSurveillanceCommentCouple", propOrder = {
    "surveillanceCommentCouple"
})
public class ArrayOfSurveillanceCommentCouple {

    @XmlElement(nillable = true)
    protected List<SurveillanceCommentCouple> surveillanceCommentCouple;

    /**
     * Gets the value of the surveillanceCommentCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveillanceCommentCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveillanceCommentCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveillanceCommentCouple }
     * 
     * 
     */
    public List<SurveillanceCommentCouple> getSurveillanceCommentCouple() {
        if (surveillanceCommentCouple == null) {
            surveillanceCommentCouple = new ArrayList<SurveillanceCommentCouple>();
        }
        return this.surveillanceCommentCouple;
    }

}

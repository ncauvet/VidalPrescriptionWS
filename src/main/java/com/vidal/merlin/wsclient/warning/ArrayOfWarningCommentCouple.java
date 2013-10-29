
package com.vidal.merlin.wsclient.warning;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWarningCommentCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWarningCommentCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warningCommentCouple" type="{urn:Vidal}warningCommentCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWarningCommentCouple", propOrder = {
    "warningCommentCouple"
})
public class ArrayOfWarningCommentCouple {

    @XmlElement(nillable = true)
    protected List<WarningCommentCouple> warningCommentCouple;

    /**
     * Gets the value of the warningCommentCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningCommentCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningCommentCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningCommentCouple }
     * 
     * 
     */
    public List<WarningCommentCouple> getWarningCommentCouple() {
        if (warningCommentCouple == null) {
            warningCommentCouple = new ArrayList<WarningCommentCouple>();
        }
        return this.warningCommentCouple;
    }

}

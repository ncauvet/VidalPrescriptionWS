
package com.vidal.merlin.wsclient.warning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warningCommentCoupleList" type="{urn:Vidal}ArrayOfWarningCommentCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "warningCommentCoupleList"
})
@XmlRootElement(name = "searchByProductIdResponse")
public class SearchByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfWarningCommentCouple warningCommentCoupleList;

    /**
     * Gets the value of the warningCommentCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public ArrayOfWarningCommentCouple getWarningCommentCoupleList() {
        return warningCommentCoupleList;
    }

    /**
     * Sets the value of the warningCommentCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public void setWarningCommentCoupleList(ArrayOfWarningCommentCouple value) {
        this.warningCommentCoupleList = value;
    }

}

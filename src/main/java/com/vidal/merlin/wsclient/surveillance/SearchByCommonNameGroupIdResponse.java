
package com.vidal.merlin.wsclient.surveillance;

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
 *         &lt;element name="surveillanceCommentCoupleList" type="{urn:Vidal}ArrayOfSurveillanceCommentCouple"/>
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
    "surveillanceCommentCoupleList"
})
@XmlRootElement(name = "searchByCommonNameGroupIdResponse")
public class SearchByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSurveillanceCommentCouple surveillanceCommentCoupleList;

    /**
     * Gets the value of the surveillanceCommentCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSurveillanceCommentCouple }
     *     
     */
    public ArrayOfSurveillanceCommentCouple getSurveillanceCommentCoupleList() {
        return surveillanceCommentCoupleList;
    }

    /**
     * Sets the value of the surveillanceCommentCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSurveillanceCommentCouple }
     *     
     */
    public void setSurveillanceCommentCoupleList(ArrayOfSurveillanceCommentCouple value) {
        this.surveillanceCommentCoupleList = value;
    }

}

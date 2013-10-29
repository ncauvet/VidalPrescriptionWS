
package com.vidal.merlin.wsclient.warning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupWarningList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupWarningList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="warningCommentCouples" type="{urn:Vidal}ArrayOfWarningCommentCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupWarningList", propOrder = {
    "homogeneous",
    "warningCommentCouples"
})
public class CommonNameGroupWarningList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfWarningCommentCouple warningCommentCouples;

    /**
     * Gets the value of the homogeneous property.
     * 
     */
    public boolean isHomogeneous() {
        return homogeneous;
    }

    /**
     * Sets the value of the homogeneous property.
     * 
     */
    public void setHomogeneous(boolean value) {
        this.homogeneous = value;
    }

    /**
     * Gets the value of the warningCommentCouples property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public ArrayOfWarningCommentCouple getWarningCommentCouples() {
        return warningCommentCouples;
    }

    /**
     * Sets the value of the warningCommentCouples property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarningCommentCouple }
     *     
     */
    public void setWarningCommentCouples(ArrayOfWarningCommentCouple value) {
        this.warningCommentCouples = value;
    }

}

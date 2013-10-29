
package com.vidal.merlin.wsclient.precaution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupPrecautionList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPrecautionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfPrecaution"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPrecautionList", propOrder = {
    "homogeneous",
    "precautions"
})
public class CommonNameGroupPrecautionList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecaution precautions;

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
     * Gets the value of the precautions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrecaution }
     *     
     */
    public ArrayOfPrecaution getPrecautions() {
        return precautions;
    }

    /**
     * Sets the value of the precautions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecaution }
     *     
     */
    public void setPrecautions(ArrayOfPrecaution value) {
        this.precautions = value;
    }

}

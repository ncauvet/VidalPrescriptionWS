
package com.vidal.merlin.wsclient.precaution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupPrecautionCim10List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPrecautionCim10List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="precautions" type="{urn:Vidal}ArrayOfPrecautionCim10Pair"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPrecautionCim10List", propOrder = {
    "homogeneous",
    "precautions"
})
public class CommonNameGroupPrecautionCim10List {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPrecautionCim10Pair precautions;

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
     *     {@link ArrayOfPrecautionCim10Pair }
     *     
     */
    public ArrayOfPrecautionCim10Pair getPrecautions() {
        return precautions;
    }

    /**
     * Sets the value of the precautions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrecautionCim10Pair }
     *     
     */
    public void setPrecautions(ArrayOfPrecautionCim10Pair value) {
        this.precautions = value;
    }

}

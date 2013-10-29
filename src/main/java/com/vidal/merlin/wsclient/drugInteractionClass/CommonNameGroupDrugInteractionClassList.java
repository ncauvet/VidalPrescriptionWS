
package com.vidal.merlin.wsclient.drugInteractionClass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupDrugInteractionClassList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupDrugInteractionClassList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugInteractionClassList" type="{urn:Vidal}ArrayOfDrugInteractionClass"/>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupDrugInteractionClassList", propOrder = {
    "drugInteractionClassList",
    "homogeneous"
})
public class CommonNameGroupDrugInteractionClassList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDrugInteractionClass drugInteractionClassList;
    protected boolean homogeneous;

    /**
     * Gets the value of the drugInteractionClassList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDrugInteractionClass }
     *     
     */
    public ArrayOfDrugInteractionClass getDrugInteractionClassList() {
        return drugInteractionClassList;
    }

    /**
     * Sets the value of the drugInteractionClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDrugInteractionClass }
     *     
     */
    public void setDrugInteractionClassList(ArrayOfDrugInteractionClass value) {
        this.drugInteractionClassList = value;
    }

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

}

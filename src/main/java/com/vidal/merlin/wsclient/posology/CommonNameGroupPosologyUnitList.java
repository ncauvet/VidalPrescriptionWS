
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommonNameGroupPosologyUnitList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonNameGroupPosologyUnitList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="homogeneous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="posologyUnits" type="{urn:Vidal}ArrayOfPosologyUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonNameGroupPosologyUnitList", propOrder = {
    "homogeneous",
    "posologyUnits"
})
public class CommonNameGroupPosologyUnitList {

    protected boolean homogeneous;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfPosologyUnit posologyUnits;

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
     * Gets the value of the posologyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public ArrayOfPosologyUnit getPosologyUnits() {
        return posologyUnits;
    }

    /**
     * Sets the value of the posologyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPosologyUnit }
     *     
     */
    public void setPosologyUnits(ArrayOfPosologyUnit value) {
        this.posologyUnits = value;
    }

}

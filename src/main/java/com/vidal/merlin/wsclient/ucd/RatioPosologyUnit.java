
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ratioPosologyUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratioPosologyUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posologyUnit" type="{urn:Vidal}posologyUnit"/>
 *         &lt;element name="ratioOfPosologyUnitOverDispensingUnit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratioPosologyUnit", propOrder = {
    "posologyUnit",
    "ratioOfPosologyUnitOverDispensingUnit"
})
public class RatioPosologyUnit {

    @XmlElement(required = true, nillable = true)
    protected PosologyUnit posologyUnit;
    @XmlElement(required = true, type = Float.class, nillable = true)
    protected Float ratioOfPosologyUnitOverDispensingUnit;

    /**
     * Gets the value of the posologyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PosologyUnit }
     *     
     */
    public PosologyUnit getPosologyUnit() {
        return posologyUnit;
    }

    /**
     * Sets the value of the posologyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosologyUnit }
     *     
     */
    public void setPosologyUnit(PosologyUnit value) {
        this.posologyUnit = value;
    }

    /**
     * Gets the value of the ratioOfPosologyUnitOverDispensingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatioOfPosologyUnitOverDispensingUnit() {
        return ratioOfPosologyUnitOverDispensingUnit;
    }

    /**
     * Sets the value of the ratioOfPosologyUnitOverDispensingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatioOfPosologyUnitOverDispensingUnit(Float value) {
        this.ratioOfPosologyUnitOverDispensingUnit = value;
    }

}

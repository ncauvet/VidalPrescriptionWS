
package com.vidal.merlin.wsclient.sideEffect;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commonNameGroupSideEffect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commonNameGroupSideEffect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroup" type="{urn:Vidal}commonNameGroup"/>
 *         &lt;element name="frequency" type="{urn:Vidal}Frequency"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sideEffect" type="{urn:Vidal}sideEffect"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonNameGroupSideEffect", propOrder = {
    "commonNameGroup",
    "frequency",
    "id",
    "sideEffect"
})
public class CommonNameGroupSideEffect {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroup commonNameGroup;
    @XmlElement(required = true, nillable = true)
    protected Frequency frequency;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected SideEffect sideEffect;

    /**
     * Gets the value of the commonNameGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroup }
     *     
     */
    public CommonNameGroup getCommonNameGroup() {
        return commonNameGroup;
    }

    /**
     * Sets the value of the commonNameGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroup }
     *     
     */
    public void setCommonNameGroup(CommonNameGroup value) {
        this.commonNameGroup = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setFrequency(Frequency value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the sideEffect property.
     * 
     * @return
     *     possible object is
     *     {@link SideEffect }
     *     
     */
    public SideEffect getSideEffect() {
        return sideEffect;
    }

    /**
     * Sets the value of the sideEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link SideEffect }
     *     
     */
    public void setSideEffect(SideEffect value) {
        this.sideEffect = value;
    }

}

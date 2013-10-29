
package com.vidal.merlin.wsclient.commonnamegroup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for galenicAgg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="galenicAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="galenicForms" type="{urn:Vidal}ArrayOfGalenicForm"/>
 *         &lt;element name="routes" type="{urn:Vidal}ArrayOfRoute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "galenicAgg", propOrder = {
    "galenicForms",
    "routes"
})
public class GalenicAgg {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfGalenicForm galenicForms;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRoute routes;

    /**
     * Gets the value of the galenicForms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public ArrayOfGalenicForm getGalenicForms() {
        return galenicForms;
    }

    /**
     * Sets the value of the galenicForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGalenicForm }
     *     
     */
    public void setGalenicForms(ArrayOfGalenicForm value) {
        this.galenicForms = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoute }
     *     
     */
    public ArrayOfRoute getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoute }
     *     
     */
    public void setRoutes(ArrayOfRoute value) {
        this.routes = value;
    }

}

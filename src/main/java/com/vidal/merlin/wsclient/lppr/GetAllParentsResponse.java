
package com.vidal.merlin.wsclient.lppr;

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
 *         &lt;element name="lpprList" type="{urn:Vidal}ArrayOfLppr"/>
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
    "lpprList"
})
@XmlRootElement(name = "getAllParentsResponse")
public class GetAllParentsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfLppr lpprList;

    /**
     * Gets the value of the lpprList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLppr }
     *     
     */
    public ArrayOfLppr getLpprList() {
        return lpprList;
    }

    /**
     * Sets the value of the lpprList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLppr }
     *     
     */
    public void setLpprList(ArrayOfLppr value) {
        this.lpprList = value;
    }

}

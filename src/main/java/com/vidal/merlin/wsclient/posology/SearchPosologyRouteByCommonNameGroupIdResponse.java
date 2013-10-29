
package com.vidal.merlin.wsclient.posology;

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
 *         &lt;element name="posologyRouteList" type="{urn:Vidal}CommonNameGroupPosologyRouteList"/>
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
    "posologyRouteList"
})
@XmlRootElement(name = "searchPosologyRouteByCommonNameGroupIdResponse")
public class SearchPosologyRouteByCommonNameGroupIdResponse {

    @XmlElement(required = true, nillable = true)
    protected CommonNameGroupPosologyRouteList posologyRouteList;

    /**
     * Gets the value of the posologyRouteList property.
     * 
     * @return
     *     possible object is
     *     {@link CommonNameGroupPosologyRouteList }
     *     
     */
    public CommonNameGroupPosologyRouteList getPosologyRouteList() {
        return posologyRouteList;
    }

    /**
     * Sets the value of the posologyRouteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonNameGroupPosologyRouteList }
     *     
     */
    public void setPosologyRouteList(CommonNameGroupPosologyRouteList value) {
        this.posologyRouteList = value;
    }

}

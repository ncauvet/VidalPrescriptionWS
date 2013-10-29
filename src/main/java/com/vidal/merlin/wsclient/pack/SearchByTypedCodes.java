
package com.vidal.merlin.wsclient.pack;

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
 *         &lt;element name="searchPackCode" type="{urn:Vidal}SearchPackCode"/>
 *         &lt;element name="codes" type="{urn:Vidal}ArrayOfString"/>
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
    "searchPackCode",
    "codes"
})
@XmlRootElement(name = "searchByTypedCodes")
public class SearchByTypedCodes {

    @XmlElement(required = true, nillable = true)
    protected SearchPackCode searchPackCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString codes;

    /**
     * Gets the value of the searchPackCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPackCode }
     *     
     */
    public SearchPackCode getSearchPackCode() {
        return searchPackCode;
    }

    /**
     * Sets the value of the searchPackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPackCode }
     *     
     */
    public void setSearchPackCode(SearchPackCode value) {
        this.searchPackCode = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCodes(ArrayOfString value) {
        this.codes = value;
    }

}

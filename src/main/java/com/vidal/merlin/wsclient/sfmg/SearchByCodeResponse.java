
package com.vidal.merlin.wsclient.sfmg;

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
 *         &lt;element name="sfmgList" type="{urn:Vidal}ArrayOfSfmg"/>
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
    "sfmgList"
})
@XmlRootElement(name = "searchByCodeResponse")
public class SearchByCodeResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfSfmg sfmgList;

    /**
     * Gets the value of the sfmgList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSfmg }
     *     
     */
    public ArrayOfSfmg getSfmgList() {
        return sfmgList;
    }

    /**
     * Sets the value of the sfmgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSfmg }
     *     
     */
    public void setSfmgList(ArrayOfSfmg value) {
        this.sfmgList = value;
    }

}

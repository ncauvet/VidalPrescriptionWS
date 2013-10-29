
package com.vidal.merlin.wsclient.indicationGroup;

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
 *         &lt;element name="indicationGroupScoreList" type="{urn:Vidal}ArrayOfIndicationGroupScore"/>
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
    "indicationGroupScoreList"
})
@XmlRootElement(name = "postIndexingHealthTerminologyByProductIdsResponse")
public class PostIndexingHealthTerminologyByProductIdsResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfIndicationGroupScore indicationGroupScoreList;

    /**
     * Gets the value of the indicationGroupScoreList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicationGroupScore }
     *     
     */
    public ArrayOfIndicationGroupScore getIndicationGroupScoreList() {
        return indicationGroupScoreList;
    }

    /**
     * Sets the value of the indicationGroupScoreList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicationGroupScore }
     *     
     */
    public void setIndicationGroupScoreList(ArrayOfIndicationGroupScore value) {
        this.indicationGroupScoreList = value;
    }

}

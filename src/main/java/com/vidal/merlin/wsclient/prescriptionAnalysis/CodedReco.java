
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codedReco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="codedReco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recommendation" type="{urn:Vidal}reco"/>
 *         &lt;element name="sources" type="{urn:Vidal}ArrayOfRelatedRecoSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codedReco", propOrder = {
    "recommendation",
    "sources"
})
public class CodedReco {

    @XmlElement(required = true, nillable = true)
    protected Reco recommendation;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRelatedRecoSource sources;

    /**
     * Gets the value of the recommendation property.
     * 
     * @return
     *     possible object is
     *     {@link Reco }
     *     
     */
    public Reco getRecommendation() {
        return recommendation;
    }

    /**
     * Sets the value of the recommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reco }
     *     
     */
    public void setRecommendation(Reco value) {
        this.recommendation = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelatedRecoSource }
     *     
     */
    public ArrayOfRelatedRecoSource getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelatedRecoSource }
     *     
     */
    public void setSources(ArrayOfRelatedRecoSource value) {
        this.sources = value;
    }

}

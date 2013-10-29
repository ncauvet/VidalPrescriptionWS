
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referenceList" type="{urn:Vidal}ArrayOfReference"/>
 *         &lt;element name="relatedElementList" type="{urn:Vidal}ArrayOfRelatedElement"/>
 *         &lt;element name="severity" type="{urn:Vidal}SeverityLevel"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alert", propOrder = {
    "comment",
    "referenceList",
    "relatedElementList",
    "severity",
    "title",
    "type"
})
public class Alert {

    @XmlElement(required = true, nillable = true)
    protected String comment;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfReference referenceList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfRelatedElement relatedElementList;
    @XmlElement(required = true, nillable = true)
    protected SeverityLevel severity;
    @XmlElement(required = true, nillable = true)
    protected String title;
    @XmlElement(required = true, nillable = true)
    protected String type;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the referenceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReference }
     *     
     */
    public ArrayOfReference getReferenceList() {
        return referenceList;
    }

    /**
     * Sets the value of the referenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReference }
     *     
     */
    public void setReferenceList(ArrayOfReference value) {
        this.referenceList = value;
    }

    /**
     * Gets the value of the relatedElementList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRelatedElement }
     *     
     */
    public ArrayOfRelatedElement getRelatedElementList() {
        return relatedElementList;
    }

    /**
     * Sets the value of the relatedElementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRelatedElement }
     *     
     */
    public void setRelatedElementList(ArrayOfRelatedElement value) {
        this.relatedElementList = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityLevel }
     *     
     */
    public SeverityLevel getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityLevel }
     *     
     */
    public void setSeverity(SeverityLevel value) {
        this.severity = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}

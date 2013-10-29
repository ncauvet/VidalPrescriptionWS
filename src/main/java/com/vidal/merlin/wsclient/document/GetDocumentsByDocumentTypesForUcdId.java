
package com.vidal.merlin.wsclient.document;

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
 *         &lt;element name="documentTypeList" type="{urn:Vidal}ArrayOfDocumentType"/>
 *         &lt;element name="UcdId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "documentTypeList",
    "ucdId"
})
@XmlRootElement(name = "getDocumentsByDocumentTypesForUcdId")
public class GetDocumentsByDocumentTypesForUcdId {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDocumentType documentTypeList;
    @XmlElement(name = "UcdId", required = true, type = Integer.class, nillable = true)
    protected Integer ucdId;

    /**
     * Gets the value of the documentTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public ArrayOfDocumentType getDocumentTypeList() {
        return documentTypeList;
    }

    /**
     * Sets the value of the documentTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDocumentType }
     *     
     */
    public void setDocumentTypeList(ArrayOfDocumentType value) {
        this.documentTypeList = value;
    }

    /**
     * Gets the value of the ucdId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUcdId() {
        return ucdId;
    }

    /**
     * Sets the value of the ucdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUcdId(Integer value) {
        this.ucdId = value;
    }

}

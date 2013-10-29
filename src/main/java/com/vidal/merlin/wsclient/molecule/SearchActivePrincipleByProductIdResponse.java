
package com.vidal.merlin.wsclient.molecule;

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
 *         &lt;element name="moleculeList" type="{urn:Vidal}ArrayOfMolecule"/>
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
    "moleculeList"
})
@XmlRootElement(name = "searchActivePrincipleByProductIdResponse")
public class SearchActivePrincipleByProductIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMolecule moleculeList;

    /**
     * Gets the value of the moleculeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMolecule }
     *     
     */
    public ArrayOfMolecule getMoleculeList() {
        return moleculeList;
    }

    /**
     * Sets the value of the moleculeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMolecule }
     *     
     */
    public void setMoleculeList(ArrayOfMolecule value) {
        this.moleculeList = value;
    }

}

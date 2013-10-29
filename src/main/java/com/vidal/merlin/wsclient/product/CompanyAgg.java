
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyAgg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyAgg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyTypes" type="{urn:Vidal}ArrayOfCompanyCompanyTypeCouple"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyAgg", propOrder = {
    "companyTypes"
})
public class CompanyAgg {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCompanyCompanyTypeCouple companyTypes;

    /**
     * Gets the value of the companyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public ArrayOfCompanyCompanyTypeCouple getCompanyTypes() {
        return companyTypes;
    }

    /**
     * Sets the value of the companyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public void setCompanyTypes(ArrayOfCompanyCompanyTypeCouple value) {
        this.companyTypes = value;
    }

}

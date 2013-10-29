
package com.vidal.merlin.wsclient.company;

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
 *         &lt;element name="companyCompanyTypeCoupleList" type="{urn:Vidal}ArrayOfCompanyCompanyTypeCouple"/>
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
    "companyCompanyTypeCoupleList"
})
@XmlRootElement(name = "searchByPackIdResponse")
public class SearchByPackIdResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfCompanyCompanyTypeCouple companyCompanyTypeCoupleList;

    /**
     * Gets the value of the companyCompanyTypeCoupleList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public ArrayOfCompanyCompanyTypeCouple getCompanyCompanyTypeCoupleList() {
        return companyCompanyTypeCoupleList;
    }

    /**
     * Sets the value of the companyCompanyTypeCoupleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyCompanyTypeCouple }
     *     
     */
    public void setCompanyCompanyTypeCoupleList(ArrayOfCompanyCompanyTypeCouple value) {
        this.companyCompanyTypeCoupleList = value;
    }

}

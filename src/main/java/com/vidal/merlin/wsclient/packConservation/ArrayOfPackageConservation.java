
package com.vidal.merlin.wsclient.packConservation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPackageConservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPackageConservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageConservation" type="{urn:Vidal}packageConservation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPackageConservation", propOrder = {
    "packageConservation"
})
public class ArrayOfPackageConservation {

    @XmlElement(nillable = true)
    protected List<PackageConservation> packageConservation;

    /**
     * Gets the value of the packageConservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageConservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageConservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageConservation }
     * 
     * 
     */
    public List<PackageConservation> getPackageConservation() {
        if (packageConservation == null) {
            packageConservation = new ArrayList<PackageConservation>();
        }
        return this.packageConservation;
    }

}


package com.vidal.merlin.wsclient.lppr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPackageLpprListCoupleSimplified complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPackageLpprListCoupleSimplified">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageLpprListCoupleSimplified" type="{http://lppr.api.vidal.com}PackageLpprListCoupleSimplified" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPackageLpprListCoupleSimplified", namespace = "http://lppr.api.vidal.com", propOrder = {
    "packageLpprListCoupleSimplified"
})
public class ArrayOfPackageLpprListCoupleSimplified {

    @XmlElement(name = "PackageLpprListCoupleSimplified", nillable = true)
    protected List<PackageLpprListCoupleSimplified> packageLpprListCoupleSimplified;

    /**
     * Gets the value of the packageLpprListCoupleSimplified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageLpprListCoupleSimplified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageLpprListCoupleSimplified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageLpprListCoupleSimplified }
     * 
     * 
     */
    public List<PackageLpprListCoupleSimplified> getPackageLpprListCoupleSimplified() {
        if (packageLpprListCoupleSimplified == null) {
            packageLpprListCoupleSimplified = new ArrayList<PackageLpprListCoupleSimplified>();
        }
        return this.packageLpprListCoupleSimplified;
    }

}

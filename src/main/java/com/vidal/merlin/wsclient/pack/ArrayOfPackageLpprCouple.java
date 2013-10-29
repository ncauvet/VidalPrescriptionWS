
package com.vidal.merlin.wsclient.pack;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPackageLpprCouple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPackageLpprCouple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageLpprCouple" type="{http://lppr.api.vidal.com}PackageLpprCouple" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPackageLpprCouple", namespace = "http://lppr.api.vidal.com", propOrder = {
    "packageLpprCouple"
})
public class ArrayOfPackageLpprCouple {

    @XmlElement(name = "PackageLpprCouple", nillable = true)
    protected List<PackageLpprCouple> packageLpprCouple;

    /**
     * Gets the value of the packageLpprCouple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageLpprCouple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageLpprCouple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageLpprCouple }
     * 
     * 
     */
    public List<PackageLpprCouple> getPackageLpprCouple() {
        if (packageLpprCouple == null) {
            packageLpprCouple = new ArrayList<PackageLpprCouple>();
        }
        return this.packageLpprCouple;
    }

}

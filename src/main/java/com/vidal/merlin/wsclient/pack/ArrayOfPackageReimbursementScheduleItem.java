
package com.vidal.merlin.wsclient.pack;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPackageReimbursementScheduleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPackageReimbursementScheduleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageReimbursementScheduleItem" type="{urn:Vidal}packageReimbursementScheduleItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPackageReimbursementScheduleItem", propOrder = {
    "packageReimbursementScheduleItem"
})
public class ArrayOfPackageReimbursementScheduleItem {

    @XmlElement(nillable = true)
    protected List<PackageReimbursementScheduleItem> packageReimbursementScheduleItem;

    /**
     * Gets the value of the packageReimbursementScheduleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageReimbursementScheduleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageReimbursementScheduleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageReimbursementScheduleItem }
     * 
     * 
     */
    public List<PackageReimbursementScheduleItem> getPackageReimbursementScheduleItem() {
        if (packageReimbursementScheduleItem == null) {
            packageReimbursementScheduleItem = new ArrayList<PackageReimbursementScheduleItem>();
        }
        return this.packageReimbursementScheduleItem;
    }

}

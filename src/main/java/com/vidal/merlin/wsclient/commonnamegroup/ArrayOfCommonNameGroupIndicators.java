
package com.vidal.merlin.wsclient.commonnamegroup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCommonNameGroupIndicators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCommonNameGroupIndicators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonNameGroupIndicators" type="{urn:Vidal}commonNameGroupIndicators" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCommonNameGroupIndicators", propOrder = {
    "commonNameGroupIndicators"
})
public class ArrayOfCommonNameGroupIndicators {

    @XmlElement(nillable = true)
    protected List<CommonNameGroupIndicators> commonNameGroupIndicators;

    /**
     * Gets the value of the commonNameGroupIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonNameGroupIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonNameGroupIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonNameGroupIndicators }
     * 
     * 
     */
    public List<CommonNameGroupIndicators> getCommonNameGroupIndicators() {
        if (commonNameGroupIndicators == null) {
            commonNameGroupIndicators = new ArrayList<CommonNameGroupIndicators>();
        }
        return this.commonNameGroupIndicators;
    }

}


package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pagedResultAllergy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagedResultAllergy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="result" type="{urn:Vidal}ArrayOfAllergy"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagedResultAllergy", propOrder = {
    "pageNumber",
    "pageSize",
    "result",
    "rowCount"
})
public class PagedResultAllergy {

    protected int pageNumber;
    protected int pageSize;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAllergy result;
    protected int rowCount;

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public ArrayOfAllergy getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAllergy }
     *     
     */
    public void setResult(ArrayOfAllergy value) {
        this.result = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     */
    public void setRowCount(int value) {
        this.rowCount = value;
    }

}

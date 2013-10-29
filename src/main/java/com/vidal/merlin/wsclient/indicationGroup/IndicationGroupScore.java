
package com.vidal.merlin.wsclient.indicationGroup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indicationGroupScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indicationGroupScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupingProducts" type="{urn:Vidal}ArrayOfProduct"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="indicationGroup" type="{urn:Vidal}indicationGroup"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indicationGroupScore", propOrder = {
    "groupingProducts",
    "id",
    "indicationGroup",
    "score"
})
public class IndicationGroupScore {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfProduct groupingProducts;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer id;
    @XmlElement(required = true, nillable = true)
    protected IndicationGroup indicationGroup;
    protected int score;

    /**
     * Gets the value of the groupingProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getGroupingProducts() {
        return groupingProducts;
    }

    /**
     * Sets the value of the groupingProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setGroupingProducts(ArrayOfProduct value) {
        this.groupingProducts = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the indicationGroup property.
     * 
     * @return
     *     possible object is
     *     {@link IndicationGroup }
     *     
     */
    public IndicationGroup getIndicationGroup() {
        return indicationGroup;
    }

    /**
     * Sets the value of the indicationGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationGroup }
     *     
     */
    public void setIndicationGroup(IndicationGroup value) {
        this.indicationGroup = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

}


package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gender" type="{urn:Vidal}Gender"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weeksOfAmenorrhea" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="breastFeeding" type="{urn:Vidal}Breastfeeding"/>
 *         &lt;element name="creatin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hepaticInsufficiency" type="{urn:Vidal}HepaticInsufficiency"/>
 *         &lt;element name="allergyIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="moleculeIdList" type="{urn:Vidal}ArrayOfInt"/>
 *         &lt;element name="pathologyCim10IdList" type="{urn:Vidal}ArrayOfInt"/>
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
    "dateOfBirth",
    "gender",
    "weight",
    "height",
    "weeksOfAmenorrhea",
    "breastFeeding",
    "creatin",
    "hepaticInsufficiency",
    "allergyIdList",
    "moleculeIdList",
    "pathologyCim10IdList"
})
@XmlRootElement(name = "patientFromObjToJson")
public class PatientFromObjToJson {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected Gender gender;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weight;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer height;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer weeksOfAmenorrhea;
    @XmlElement(required = true, nillable = true)
    protected Breastfeeding breastFeeding;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer creatin;
    @XmlElement(required = true, nillable = true)
    protected HepaticInsufficiency hepaticInsufficiency;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt allergyIdList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt moleculeIdList;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfInt pathologyCim10IdList;

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the weeksOfAmenorrhea property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeeksOfAmenorrhea() {
        return weeksOfAmenorrhea;
    }

    /**
     * Sets the value of the weeksOfAmenorrhea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeeksOfAmenorrhea(Integer value) {
        this.weeksOfAmenorrhea = value;
    }

    /**
     * Gets the value of the breastFeeding property.
     * 
     * @return
     *     possible object is
     *     {@link Breastfeeding }
     *     
     */
    public Breastfeeding getBreastFeeding() {
        return breastFeeding;
    }

    /**
     * Sets the value of the breastFeeding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breastfeeding }
     *     
     */
    public void setBreastFeeding(Breastfeeding value) {
        this.breastFeeding = value;
    }

    /**
     * Gets the value of the creatin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreatin() {
        return creatin;
    }

    /**
     * Sets the value of the creatin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreatin(Integer value) {
        this.creatin = value;
    }

    /**
     * Gets the value of the hepaticInsufficiency property.
     * 
     * @return
     *     possible object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public HepaticInsufficiency getHepaticInsufficiency() {
        return hepaticInsufficiency;
    }

    /**
     * Sets the value of the hepaticInsufficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link HepaticInsufficiency }
     *     
     */
    public void setHepaticInsufficiency(HepaticInsufficiency value) {
        this.hepaticInsufficiency = value;
    }

    /**
     * Gets the value of the allergyIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAllergyIdList() {
        return allergyIdList;
    }

    /**
     * Sets the value of the allergyIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAllergyIdList(ArrayOfInt value) {
        this.allergyIdList = value;
    }

    /**
     * Gets the value of the moleculeIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMoleculeIdList() {
        return moleculeIdList;
    }

    /**
     * Sets the value of the moleculeIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMoleculeIdList(ArrayOfInt value) {
        this.moleculeIdList = value;
    }

    /**
     * Gets the value of the pathologyCim10IdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getPathologyCim10IdList() {
        return pathologyCim10IdList;
    }

    /**
     * Sets the value of the pathologyCim10IdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setPathologyCim10IdList(ArrayOfInt value) {
        this.pathologyCim10IdList = value;
    }

}

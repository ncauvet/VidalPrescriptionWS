
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrugCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrugCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODUCT_ID"/>
 *     &lt;enumeration value="PACKAGE_ID"/>
 *     &lt;enumeration value="COMMON_NAME_GROUP_ID"/>
 *     &lt;enumeration value="UCD_ID"/>
 *     &lt;enumeration value="UCD13"/>
 *     &lt;enumeration value="UCD7"/>
 *     &lt;enumeration value="CIP13"/>
 *     &lt;enumeration value="CIP7"/>
 *     &lt;enumeration value="EAN13"/>
 *     &lt;enumeration value="CIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrugCodeType")
@XmlEnum
public enum DrugCodeType {

    PRODUCT_ID("PRODUCT_ID"),
    PACKAGE_ID("PACKAGE_ID"),
    COMMON_NAME_GROUP_ID("COMMON_NAME_GROUP_ID"),
    UCD_ID("UCD_ID"),
    @XmlEnumValue("UCD13")
    UCD_13("UCD13"),
    @XmlEnumValue("UCD7")
    UCD_7("UCD7"),
    @XmlEnumValue("CIP13")
    CIP_13("CIP13"),
    @XmlEnumValue("CIP7")
    CIP_7("CIP7"),
    @XmlEnumValue("EAN13")
    EAN_13("EAN13"),
    CIS("CIS");
    private final String value;

    DrugCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrugCodeType fromValue(String v) {
        for (DrugCodeType c: DrugCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

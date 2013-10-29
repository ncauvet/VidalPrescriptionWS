
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DrugType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DrugType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMMON_NAME_GROUP"/>
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="PACK"/>
 *     &lt;enumeration value="UCD"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="ACCESSORY_RANGE"/>
 *     &lt;enumeration value="BRANDED_PRESCRIBABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrugType")
@XmlEnum
public enum DrugType {

    COMMON_NAME_GROUP,
    PRODUCT,
    PACK,
    UCD,
    UNKNOWN,
    ACCESSORY_RANGE,
    BRANDED_PRESCRIBABLE;

    public String value() {
        return name();
    }

    public static DrugType fromValue(String v) {
        return valueOf(v);
    }

}

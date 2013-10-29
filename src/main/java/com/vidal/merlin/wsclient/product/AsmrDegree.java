
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsmrDegree.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AsmrDegree">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASMR_I"/>
 *     &lt;enumeration value="ASMR_II"/>
 *     &lt;enumeration value="ASMR_III"/>
 *     &lt;enumeration value="ASMR_IV"/>
 *     &lt;enumeration value="ASMR_V"/>
 *     &lt;enumeration value="UNSPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AsmrDegree")
@XmlEnum
public enum AsmrDegree {

    ASMR_I,
    ASMR_II,
    ASMR_III,
    ASMR_IV,
    ASMR_V,
    UNSPECIFIED;

    public String value() {
        return name();
    }

    public static AsmrDegree fromValue(String v) {
        return valueOf(v);
    }

}


package com.vidal.merlin.wsclient.sideEffect;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXECPTIONAL"/>
 *     &lt;enumeration value="FREQUENT"/>
 *     &lt;enumeration value="NOT_VERY_FREQUENT"/>
 *     &lt;enumeration value="RARE"/>
 *     &lt;enumeration value="VERY_RARE"/>
 *     &lt;enumeration value="OCCASIONAL"/>
 *     &lt;enumeration value="VERY_FREQUENT"/>
 *     &lt;enumeration value="ISOLATED_CASES"/>
 *     &lt;enumeration value="UNCERTAIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Frequency")
@XmlEnum
public enum Frequency {

    EXECPTIONAL,
    FREQUENT,
    NOT_VERY_FREQUENT,
    RARE,
    VERY_RARE,
    OCCASIONAL,
    VERY_FREQUENT,
    ISOLATED_CASES,
    UNCERTAIN;

    public String value() {
        return name();
    }

    public static Frequency fromValue(String v) {
        return valueOf(v);
    }

}

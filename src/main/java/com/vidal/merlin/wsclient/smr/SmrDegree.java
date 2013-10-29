
package com.vidal.merlin.wsclient.smr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmrDegree.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SmrDegree">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="INSUFFICIENT"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MODERATE"/>
 *     &lt;enumeration value="IMPORTANT"/>
 *     &lt;enumeration value="MAJOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmrDegree")
@XmlEnum
public enum SmrDegree {

    UNDEFINED,
    INSUFFICIENT,
    LOW,
    MODERATE,
    IMPORTANT,
    MAJOR;

    public String value() {
        return name();
    }

    public static SmrDegree fromValue(String v) {
        return valueOf(v);
    }

}

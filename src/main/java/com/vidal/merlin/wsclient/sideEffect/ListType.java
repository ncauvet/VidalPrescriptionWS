
package com.vidal.merlin.wsclient.sideEffect;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="NARCOTIC"/>
 *     &lt;enumeration value="NULL"/>
 *     &lt;enumeration value="NOT_HOMOGENEOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListType")
@XmlEnum
public enum ListType {

    I,
    II,
    NARCOTIC,
    NULL,
    NOT_HOMOGENEOUS;

    public String value() {
        return name();
    }

    public static ListType fromValue(String v) {
        return valueOf(v);
    }

}


package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenericType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="REFERENT"/>
 *     &lt;enumeration value="NULL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenericType")
@XmlEnum
public enum GenericType {

    GENERIC,
    REFERENT,
    NULL;

    public String value() {
        return name();
    }

    public static GenericType fromValue(String v) {
        return valueOf(v);
    }

}

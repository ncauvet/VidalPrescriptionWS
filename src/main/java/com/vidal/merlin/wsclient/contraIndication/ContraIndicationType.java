
package com.vidal.merlin.wsclient.contraIndication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContraIndicationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContraIndicationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RELATIVE"/>
 *     &lt;enumeration value="ABSOLUTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContraIndicationType")
@XmlEnum
public enum ContraIndicationType {

    RELATIVE,
    ABSOLUTE;

    public String value() {
        return name();
    }

    public static ContraIndicationType fromValue(String v) {
        return valueOf(v);
    }

}


package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UcdApiFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UcdApiFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="HORSGHS"/>
 *     &lt;enumeration value="RETROCESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UcdApiFilter")
@XmlEnum
public enum UcdApiFilter {

    ALL,
    HORSGHS,
    RETROCESSION;

    public String value() {
        return name();
    }

    public static UcdApiFilter fromValue(String v) {
        return valueOf(v);
    }

}

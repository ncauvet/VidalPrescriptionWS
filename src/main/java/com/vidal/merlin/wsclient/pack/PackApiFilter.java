
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackApiFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackApiFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackApiFilter")
@XmlEnum
public enum PackApiFilter {

    ALL;

    public String value() {
        return name();
    }

    public static PackApiFilter fromValue(String v) {
        return valueOf(v);
    }

}

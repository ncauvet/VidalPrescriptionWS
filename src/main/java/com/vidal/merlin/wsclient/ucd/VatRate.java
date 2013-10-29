
package com.vidal.merlin.wsclient.ucd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatRate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VatRate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="REDUCED"/>
 *     &lt;enumeration value="SUPER_REDUCED"/>
 *     &lt;enumeration value="HIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VatRate")
@XmlEnum
public enum VatRate {

    NORMAL,
    REDUCED,
    SUPER_REDUCED,
    HIGH;

    public String value() {
        return name();
    }

    public static VatRate fromValue(String v) {
        return valueOf(v);
    }

}

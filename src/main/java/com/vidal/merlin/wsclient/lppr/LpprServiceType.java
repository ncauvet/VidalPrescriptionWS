
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LpprServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LpprServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUYING"/>
 *     &lt;enumeration value="RENTING"/>
 *     &lt;enumeration value="MAINTENANCE"/>
 *     &lt;enumeration value="REPAIR"/>
 *     &lt;enumeration value="DELIVERY"/>
 *     &lt;enumeration value="SERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LpprServiceType")
@XmlEnum
public enum LpprServiceType {

    BUYING,
    RENTING,
    MAINTENANCE,
    REPAIR,
    DELIVERY,
    SERVICE;

    public String value() {
        return name();
    }

    public static LpprServiceType fromValue(String v) {
        return valueOf(v);
    }

}

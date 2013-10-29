
package com.vidal.merlin.wsclient.indicationGroup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="PHARMACO"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="DELETED_ONEYEAR"/>
 *     &lt;enumeration value="PHARMACO_ONEYEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MarketStatus")
@XmlEnum
public enum MarketStatus {

    AVAILABLE,
    DELETED,
    PHARMACO,
    NEW,
    DELETED_ONEYEAR,
    PHARMACO_ONEYEAR;

    public String value() {
        return name();
    }

    public static MarketStatus fromValue(String v) {
        return valueOf(v);
    }

}

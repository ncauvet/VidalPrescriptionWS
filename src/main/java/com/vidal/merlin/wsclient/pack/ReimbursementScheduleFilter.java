
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReimbursementScheduleFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReimbursementScheduleFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ONLY_FUTURE_EVENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReimbursementScheduleFilter")
@XmlEnum
public enum ReimbursementScheduleFilter {

    NONE,
    ONLY_FUTURE_EVENTS;

    public String value() {
        return name();
    }

    public static ReimbursementScheduleFilter fromValue(String v) {
        return valueOf(v);
    }

}

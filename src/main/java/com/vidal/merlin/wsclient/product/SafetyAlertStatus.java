
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SafetyAlertStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SafetyAlertStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="YES"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SafetyAlertStatus")
@XmlEnum
public enum SafetyAlertStatus {

    NO,
    YES,
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static SafetyAlertStatus fromValue(String v) {
        return valueOf(v);
    }

}

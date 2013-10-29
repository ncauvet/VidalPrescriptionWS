
package com.vidal.merlin.wsclient.drugInteractionClass;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InteractionSeverityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InteractionSeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TAKE_INTO_ACCOUNT"/>
 *     &lt;enumeration value="PRECAUTION_USE"/>
 *     &lt;enumeration value="DISADVISES_ASSOCIATION"/>
 *     &lt;enumeration value="CONTRAINDICATIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InteractionSeverityType")
@XmlEnum
public enum InteractionSeverityType {

    TAKE_INTO_ACCOUNT,
    PRECAUTION_USE,
    DISADVISES_ASSOCIATION,
    CONTRAINDICATIONS;

    public String value() {
        return name();
    }

    public static InteractionSeverityType fromValue(String v) {
        return valueOf(v);
    }

}

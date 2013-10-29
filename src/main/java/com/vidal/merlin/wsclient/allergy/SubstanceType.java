
package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubstanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE_PRINCIPLE"/>
 *     &lt;enumeration value="EXCIPIENT"/>
 *     &lt;enumeration value="ACTIVE_EXCIPIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstanceType")
@XmlEnum
public enum SubstanceType {

    ACTIVE_PRINCIPLE,
    EXCIPIENT,
    ACTIVE_EXCIPIENT;

    public String value() {
        return name();
    }

    public static SubstanceType fromValue(String v) {
        return valueOf(v);
    }

}

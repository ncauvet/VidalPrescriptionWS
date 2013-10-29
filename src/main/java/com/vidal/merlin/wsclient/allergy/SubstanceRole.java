
package com.vidal.merlin.wsclient.allergy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubstanceRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubstanceRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE_PRINCIPLE_OR_EXCIPIENT"/>
 *     &lt;enumeration value="EXCIPIENT"/>
 *     &lt;enumeration value="ACTIVE_PRINCIPLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubstanceRole")
@XmlEnum
public enum SubstanceRole {

    ACTIVE_PRINCIPLE_OR_EXCIPIENT,
    EXCIPIENT,
    ACTIVE_PRINCIPLE;

    public String value() {
        return name();
    }

    public static SubstanceRole fromValue(String v) {
        return valueOf(v);
    }

}

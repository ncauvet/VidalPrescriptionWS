
package com.vidal.merlin.wsclient.indicationGroup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMM_EURO"/>
 *     &lt;enumeration value="AMM_FRA"/>
 *     &lt;enumeration value="ATU_COHORTE"/>
 *     &lt;enumeration value="ATU_NOM"/>
 *     &lt;enumeration value="IMPORT"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="EXPORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmmType", namespace = "http://constant.merlin.vidal.com")
@XmlEnum
public enum AmmType {

    AMM_EURO,
    AMM_FRA,
    ATU_COHORTE,
    ATU_NOM,
    IMPORT,
    OTHER,
    EXPORT;

    public String value() {
        return name();
    }

    public static AmmType fromValue(String v) {
        return valueOf(v);
    }

}

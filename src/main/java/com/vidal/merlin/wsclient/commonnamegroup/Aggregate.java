
package com.vidal.merlin.wsclient.commonnamegroup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Aggregate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Aggregate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPOSITION"/>
 *     &lt;enumeration value="UNIT"/>
 *     &lt;enumeration value="ATC_CLASSIFICATION"/>
 *     &lt;enumeration value="GALENIC"/>
 *     &lt;enumeration value="DRUG"/>
 *     &lt;enumeration value="INDICATION"/>
 *     &lt;enumeration value="INDICATORS"/>
 *     &lt;enumeration value="COMPANY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Aggregate")
@XmlEnum
public enum Aggregate {

    COMPOSITION,
    UNIT,
    ATC_CLASSIFICATION,
    GALENIC,
    DRUG,
    INDICATION,
    INDICATORS,
    COMPANY;

    public String value() {
        return name();
    }

    public static Aggregate fromValue(String v) {
        return valueOf(v);
    }

}

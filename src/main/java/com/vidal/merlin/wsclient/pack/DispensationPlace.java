
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DispensationPlace.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DispensationPlace">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOSPITAL"/>
 *     &lt;enumeration value="PHARMACY"/>
 *     &lt;enumeration value="NOT_HOMOGENEOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DispensationPlace")
@XmlEnum
public enum DispensationPlace {

    HOSPITAL,
    PHARMACY,
    NOT_HOMOGENEOUS;

    public String value() {
        return name();
    }

    public static DispensationPlace fromValue(String v) {
        return valueOf(v);
    }

}

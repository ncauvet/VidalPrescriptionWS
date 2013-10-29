
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HepaticInsufficiency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HepaticInsufficiency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MODERATE"/>
 *     &lt;enumeration value="SEVERE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HepaticInsufficiency")
@XmlEnum
public enum HepaticInsufficiency {

    NONE,
    MODERATE,
    SEVERE;

    public String value() {
        return name();
    }

    public static HepaticInsufficiency fromValue(String v) {
        return valueOf(v);
    }

}

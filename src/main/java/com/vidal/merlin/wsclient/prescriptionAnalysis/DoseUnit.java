
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoseUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DoseUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MCG"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="KU"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="MMOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DoseUnit")
@XmlEnum
public enum DoseUnit {

    MG,
    G,
    ML,
    MCG,
    U,
    KU,
    MU,
    MMOL;

    public String value() {
        return name();
    }

    public static DoseUnit fromValue(String v) {
        return valueOf(v);
    }

}


package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRECAUTION"/>
 *     &lt;enumeration value="CONTRA_INDICATION"/>
 *     &lt;enumeration value="ALLERGY"/>
 *     &lt;enumeration value="POSOLOGY"/>
 *     &lt;enumeration value="PHYSICO_CHEMICAL_INTERACTION"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="SIDE_EFFECT"/>
 *     &lt;enumeration value="SURVEILLANCE"/>
 *     &lt;enumeration value="REDUNDANT_ACTIVE_INGREDIENT"/>
 *     &lt;enumeration value="DRUG_INTERACTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertType")
@XmlEnum
public enum AlertType {

    PRECAUTION,
    CONTRA_INDICATION,
    ALLERGY,
    POSOLOGY,
    PHYSICO_CHEMICAL_INTERACTION,
    WARNING,
    SIDE_EFFECT,
    SURVEILLANCE,
    REDUNDANT_ACTIVE_INGREDIENT,
    DRUG_INTERACTION;

    public String value() {
        return name();
    }

    public static AlertType fromValue(String v) {
        return valueOf(v);
    }

}

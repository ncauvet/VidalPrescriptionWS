
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SummarizedContraIndicationAlert.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SummarizedContraIndicationAlert">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RELATIVE_ALERT"/>
 *     &lt;enumeration value="ABSOLUTE_ALERT"/>
 *     &lt;enumeration value="UNKNOWN_ALERT"/>
 *     &lt;enumeration value="NO_ALERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SummarizedContraIndicationAlert")
@XmlEnum
public enum SummarizedContraIndicationAlert {

    RELATIVE_ALERT,
    ABSOLUTE_ALERT,
    UNKNOWN_ALERT,
    NO_ALERT;

    public String value() {
        return name();
    }

    public static SummarizedContraIndicationAlert fromValue(String v) {
        return valueOf(v);
    }

}

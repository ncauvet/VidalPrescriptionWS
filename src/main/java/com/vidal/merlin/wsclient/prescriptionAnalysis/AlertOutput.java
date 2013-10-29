
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertOutput.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertOutput">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUMMARIZED"/>
 *     &lt;enumeration value="ALERTS"/>
 *     &lt;enumeration value="HTML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertOutput")
@XmlEnum
public enum AlertOutput {

    SUMMARIZED,
    ALERTS,
    HTML;

    public String value() {
        return name();
    }

    public static AlertOutput fromValue(String v) {
        return valueOf(v);
    }

}

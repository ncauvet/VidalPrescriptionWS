
package com.vidal.merlin.wsclient.prescriptionAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosologyFrequencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PosologyFrequencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="THIS_DAY"/>
 *     &lt;enumeration value="PER_DAY"/>
 *     &lt;enumeration value="PER_24_HOURS"/>
 *     &lt;enumeration value="PER_WEEK"/>
 *     &lt;enumeration value="PER_MONTH"/>
 *     &lt;enumeration value="PER_YEAR"/>
 *     &lt;enumeration value="PER_2_DAYS"/>
 *     &lt;enumeration value="PER_N_HOURS"/>
 *     &lt;enumeration value="PER_HOUR"/>
 *     &lt;enumeration value="PER_MINUTE"/>
 *     &lt;enumeration value="TYPE_66"/>
 *     &lt;enumeration value="TYPE_46"/>
 *     &lt;enumeration value="TYPE_44"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PosologyFrequencyType")
@XmlEnum
public enum PosologyFrequencyType {

    THIS_DAY,
    PER_DAY,
    PER_24_HOURS,
    PER_WEEK,
    PER_MONTH,
    PER_YEAR,
    PER_2_DAYS,
    PER_N_HOURS,
    PER_HOUR,
    PER_MINUTE,
    TYPE_66,
    TYPE_46,
    TYPE_44;

    public String value() {
        return name();
    }

    public static PosologyFrequencyType fromValue(String v) {
        return valueOf(v);
    }

}

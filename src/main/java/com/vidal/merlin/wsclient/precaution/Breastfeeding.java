
package com.vidal.merlin.wsclient.precaution;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Breastfeeding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Breastfeeding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="LESS_THAN_ONE_MONTH"/>
 *     &lt;enumeration value="MORE_THAN_ONE_MONTH"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Breastfeeding")
@XmlEnum
public enum Breastfeeding {

    NONE,
    LESS_THAN_ONE_MONTH,
    MORE_THAN_ONE_MONTH,
    ALL;

    public String value() {
        return name();
    }

    public static Breastfeeding fromValue(String v) {
        return valueOf(v);
    }

}

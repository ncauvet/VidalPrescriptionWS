
package com.vidal.merlin.wsclient.contraIndication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDAL"/>
 *     &lt;enumeration value="DIETETIC"/>
 *     &lt;enumeration value="VETERINARY"/>
 *     &lt;enumeration value="NON_PHARMACEUTICAL"/>
 *     &lt;enumeration value="ACCESSORY"/>
 *     &lt;enumeration value="MISCELLANEOUS"/>
 *     &lt;enumeration value="HOMEOPATHIC"/>
 *     &lt;enumeration value="BALNEOLOGY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductType")
@XmlEnum
public enum ProductType {

    VIDAL,
    DIETETIC,
    VETERINARY,
    NON_PHARMACEUTICAL,
    ACCESSORY,
    MISCELLANEOUS,
    HOMEOPATHIC,
    BALNEOLOGY;

    public String value() {
        return name();
    }

    public static ProductType fromValue(String v) {
        return valueOf(v);
    }

}

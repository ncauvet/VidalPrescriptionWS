
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OWNER"/>
 *     &lt;enumeration value="HOLDER"/>
 *     &lt;enumeration value="DISTRIBUTOR"/>
 *     &lt;enumeration value="SUBSCRIBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyType")
@XmlEnum
public enum CompanyType {

    OWNER,
    HOLDER,
    DISTRIBUTOR,
    SUBSCRIBER;

    public String value() {
        return name();
    }

    public static CompanyType fromValue(String v) {
        return valueOf(v);
    }

}

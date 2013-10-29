
package com.vidal.merlin.wsclient.pack;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchPackCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchPackCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CIP7"/>
 *     &lt;enumeration value="CIP13"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="NATIONAL_DRUG_CODE"/>
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchPackCode")
@XmlEnum
public enum SearchPackCode {

    @XmlEnumValue("CIP7")
    CIP_7("CIP7"),
    @XmlEnumValue("CIP13")
    CIP_13("CIP13"),
    EAN("EAN"),
    NATIONAL_DRUG_CODE("NATIONAL_DRUG_CODE"),
    ALL("ALL");
    private final String value;

    SearchPackCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchPackCode fromValue(String v) {
        for (SearchPackCode c: SearchPackCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

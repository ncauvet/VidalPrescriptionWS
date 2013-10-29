
package com.vidal.merlin.wsclient.utilities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompositeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRODUCT"/>
 *     &lt;enumeration value="MOLECULE"/>
 *     &lt;enumeration value="ALLERGY"/>
 *     &lt;enumeration value="SAUMON"/>
 *     &lt;enumeration value="VIDAL"/>
 *     &lt;enumeration value="PRECAUTION"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="SIDE_EFFECT"/>
 *     &lt;enumeration value="INDICATION"/>
 *     &lt;enumeration value="INDICATION_GROUP"/>
 *     &lt;enumeration value="CONTRA_INDICATION"/>
 *     &lt;enumeration value="CIM10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompositeType")
@XmlEnum
public enum CompositeType {

    PRODUCT("PRODUCT"),
    MOLECULE("MOLECULE"),
    ALLERGY("ALLERGY"),
    SAUMON("SAUMON"),
    VIDAL("VIDAL"),
    PRECAUTION("PRECAUTION"),
    WARNING("WARNING"),
    SIDE_EFFECT("SIDE_EFFECT"),
    INDICATION("INDICATION"),
    INDICATION_GROUP("INDICATION_GROUP"),
    CONTRA_INDICATION("CONTRA_INDICATION"),
    @XmlEnumValue("CIM10")
    CIM_10("CIM10");
    private final String value;

    CompositeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompositeType fromValue(String v) {
        for (CompositeType c: CompositeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

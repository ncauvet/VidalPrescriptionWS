
package com.vidal.merlin.wsclient.lppr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AAD"/>
 *     &lt;enumeration value="AAR"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="OPT"/>
 *     &lt;enumeration value="ORC"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PEX"/>
 *     &lt;enumeration value="PH1"/>
 *     &lt;enumeration value="PH4"/>
 *     &lt;enumeration value="PH7"/>
 *     &lt;enumeration value="PHN"/>
 *     &lt;enumeration value="PII"/>
 *     &lt;enumeration value="VEH"/>
 *     &lt;enumeration value="PMR"/>
 *     &lt;enumeration value="ARO"/>
 *     &lt;enumeration value="GLU"/>
 *     &lt;enumeration value="PAU"/>
 *     &lt;enumeration value="PH2"/>
 *     &lt;enumeration value="PME"/>
 *     &lt;enumeration value="TNS"/>
 *     &lt;enumeration value="VER"/>
 *     &lt;enumeration value="LEN"/>
 *     &lt;enumeration value="LUN"/>
 *     &lt;enumeration value="POC"/>
 *     &lt;enumeration value="PG7"/>
 *     &lt;enumeration value="PDM"/>
 *     &lt;enumeration value="PMH"/>
 *     &lt;enumeration value="DVO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActCode")
@XmlEnum
public enum ActCode {

    AAD("AAD"),
    AAR("AAR"),
    MAC("MAC"),
    MAD("MAD"),
    OPT("OPT"),
    ORC("ORC"),
    PA("PA"),
    PAN("PAN"),
    PEX("PEX"),
    @XmlEnumValue("PH1")
    PH_1("PH1"),
    @XmlEnumValue("PH4")
    PH_4("PH4"),
    @XmlEnumValue("PH7")
    PH_7("PH7"),
    PHN("PHN"),
    PII("PII"),
    VEH("VEH"),
    PMR("PMR"),
    ARO("ARO"),
    GLU("GLU"),
    PAU("PAU"),
    @XmlEnumValue("PH2")
    PH_2("PH2"),
    PME("PME"),
    TNS("TNS"),
    VER("VER"),
    LEN("LEN"),
    LUN("LUN"),
    POC("POC"),
    @XmlEnumValue("PG7")
    PG_7("PG7"),
    PDM("PDM"),
    PMH("PMH"),
    DVO("DVO");
    private final String value;

    ActCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActCode fromValue(String v) {
        for (ActCode c: ActCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

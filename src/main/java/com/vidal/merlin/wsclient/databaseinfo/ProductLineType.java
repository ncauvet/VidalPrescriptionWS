
package com.vidal.merlin.wsclient.databaseinfo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductLineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductLineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="VXP"/>
 *     &lt;enumeration value="VCD"/>
 *     &lt;enumeration value="VDE"/>
 *     &lt;enumeration value="VDEJ"/>
 *     &lt;enumeration value="VXPJ"/>
 *     &lt;enumeration value="PORTUGAL"/>
 *     &lt;enumeration value="SPAIN"/>
 *     &lt;enumeration value="BELGIUM_F"/>
 *     &lt;enumeration value="BELGIUM_N"/>
 *     &lt;enumeration value="BULGARIA"/>
 *     &lt;enumeration value="BRASIL"/>
 *     &lt;enumeration value="ABU_DHABI"/>
 *     &lt;enumeration value="MEXICO"/>
 *     &lt;enumeration value="CHILI"/>
 *     &lt;enumeration value="UNITED_KINGDOM"/>
 *     &lt;enumeration value="INTERNATIONAL"/>
 *     &lt;enumeration value="HOPTIMAL"/>
 *     &lt;enumeration value="EVIDAL"/>
 *     &lt;enumeration value="ZAPI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductLineType", namespace = "http://productline.utils.merlin.vidal.com")
@XmlEnum
public enum ProductLineType {

    FR,
    VXP,
    VCD,
    VDE,
    VDEJ,
    VXPJ,
    PORTUGAL,
    SPAIN,
    BELGIUM_F,
    BELGIUM_N,
    BULGARIA,
    BRASIL,
    ABU_DHABI,
    MEXICO,
    CHILI,
    UNITED_KINGDOM,
    INTERNATIONAL,
    HOPTIMAL,
    EVIDAL,
    ZAPI;

    public String value() {
        return name();
    }

    public static ProductLineType fromValue(String v) {
        return valueOf(v);
    }

}

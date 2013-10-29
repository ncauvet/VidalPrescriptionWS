
package com.vidal.merlin.wsclient.reco;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecoDomainType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecoDomainType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="APPENDIX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecoDomainType")
@XmlEnum
public enum RecoDomainType {

    MAIN,
    APPENDIX;

    public String value() {
        return name();
    }

    public static RecoDomainType fromValue(String v) {
        return valueOf(v);
    }

}

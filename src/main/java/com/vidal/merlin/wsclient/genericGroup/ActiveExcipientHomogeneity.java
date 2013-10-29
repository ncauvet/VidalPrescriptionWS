
package com.vidal.merlin.wsclient.genericGroup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiveExcipientHomogeneity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActiveExcipientHomogeneity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_ACTIVE_EXCIPIENT"/>
 *     &lt;enumeration value="ALL_THE_SAME_ACTIVE_EXCIPIENTS"/>
 *     &lt;enumeration value="DIFFERENT_ACTIVE_EXCIPIENTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActiveExcipientHomogeneity")
@XmlEnum
public enum ActiveExcipientHomogeneity {

    NO_ACTIVE_EXCIPIENT,
    ALL_THE_SAME_ACTIVE_EXCIPIENTS,
    DIFFERENT_ACTIVE_EXCIPIENTS;

    public String value() {
        return name();
    }

    public static ActiveExcipientHomogeneity fromValue(String v) {
        return valueOf(v);
    }

}

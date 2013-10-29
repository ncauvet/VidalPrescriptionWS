
package com.vidal.merlin.wsclient.product;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductApiFilter.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductApiFilter">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductApiFilter")
@XmlEnum
public enum ProductApiFilter {

    ALL;

    public String value() {
        return name();
    }

    public static ProductApiFilter fromValue(String v) {
        return valueOf(v);
    }

}

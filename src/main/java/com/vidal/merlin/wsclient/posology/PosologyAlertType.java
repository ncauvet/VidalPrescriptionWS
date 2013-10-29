
package com.vidal.merlin.wsclient.posology;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosologyAlertType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PosologyAlertType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THIS_PRODUCT"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THESE_INDICATIONS"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THESE_ROUTES"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THIS_PROFILE"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THIS_GENDER"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THIS_WEIGHT"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THIS_AGE"/>
 *     &lt;enumeration value="ONLY_FIXED_POSOLOGIES"/>
 *     &lt;enumeration value="MIXED_POSOLOGIES"/>
 *     &lt;enumeration value="MAX_ABSOLUTE_NUMBER_OF_DOSE"/>
 *     &lt;enumeration value="NO_POSOLOGY_FOR_THIS_HEIGHT"/>
 *     &lt;enumeration value="MAX_USUAL_NUMBER_OF_DOSE"/>
 *     &lt;enumeration value="MIN_USUAL_NUMBER_OF_DOSE"/>
 *     &lt;enumeration value="MAX_NUMBER_OF_DOSE_AT_ONCE"/>
 *     &lt;enumeration value="MAX_ABSOLUTE_ACTIVE_PRINCIPLE_DOSE"/>
 *     &lt;enumeration value="MAX_USUAL_ACTIVE_PRINCIPLE_DOSE"/>
 *     &lt;enumeration value="MIN_USUAL_ACTIVE_PRINCIPLE_DOSE"/>
 *     &lt;enumeration value="MAX_ACTIVE_PRINCIPLE_DOSE_AT_ONCE"/>
 *     &lt;enumeration value="MAX_ABSOLUTE_DURATION"/>
 *     &lt;enumeration value="MAX_USUAL_DURATION"/>
 *     &lt;enumeration value="MIN_ABSOLUTE_DURATION"/>
 *     &lt;enumeration value="MIN_USUAL_DURATION"/>
 *     &lt;enumeration value="PRESCRIPTION_LIMITED_TO_ONE_YEAR"/>
 *     &lt;enumeration value="MAX_FREQUENCY"/>
 *     &lt;enumeration value="MIN_FREQUENCY"/>
 *     &lt;enumeration value="AGE_IGNORED"/>
 *     &lt;enumeration value="RENAL_IMPAIRMENT"/>
 *     &lt;enumeration value="CONTRAINDICATED"/>
 *     &lt;enumeration value="RESERVED_FOR"/>
 *     &lt;enumeration value="IN_EVERY_NOSTRIL"/>
 *     &lt;enumeration value="MULTIPLE_ACTIVE_PRINCIPLES"/>
 *     &lt;enumeration value="DOSE_CHECKING_FOR_RENAL_IMPAIRMENT_NOT_SUPPORTED_YET"/>
 *     &lt;enumeration value="DOSE_CHECKING_FOR_LIVER_IMPAIRMENT_NOT_SUPPORTED_YET"/>
 *     &lt;enumeration value="DOSE_CHECKING_FOR_ELDERLY_IMPAIRMENT_NOT_SUPPORTED_YET"/>
 *     &lt;enumeration value="UNSUPPORTED_UNIT"/>
 *     &lt;enumeration value="DOSE_CHECKING_BY_INDICATION_NOT_SUPPORTED_YET_INDICATIONS_IGNORED"/>
 *     &lt;enumeration value="ONLY_DOSE_CHECKING_BY_DISPENSATION_UNIT_SUPPORTED"/>
 *     &lt;enumeration value="ONLY_DOSE_CHECKING_BY_ACTIVE_PRINCIPLE_SUPPORTED"/>
 *     &lt;enumeration value="CHECK_MAXIMUM_PER_INDICATION"/>
 *     &lt;enumeration value="NON_HOMOGENEOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PosologyAlertType")
@XmlEnum
public enum PosologyAlertType {

    NO_POSOLOGY_FOR_THIS_PRODUCT,
    NO_POSOLOGY_FOR_THESE_INDICATIONS,
    NO_POSOLOGY_FOR_THESE_ROUTES,
    NO_POSOLOGY_FOR_THIS_PROFILE,
    NO_POSOLOGY_FOR_THIS_GENDER,
    NO_POSOLOGY_FOR_THIS_WEIGHT,
    NO_POSOLOGY_FOR_THIS_AGE,
    ONLY_FIXED_POSOLOGIES,
    MIXED_POSOLOGIES,
    MAX_ABSOLUTE_NUMBER_OF_DOSE,
    NO_POSOLOGY_FOR_THIS_HEIGHT,
    MAX_USUAL_NUMBER_OF_DOSE,
    MIN_USUAL_NUMBER_OF_DOSE,
    MAX_NUMBER_OF_DOSE_AT_ONCE,
    MAX_ABSOLUTE_ACTIVE_PRINCIPLE_DOSE,
    MAX_USUAL_ACTIVE_PRINCIPLE_DOSE,
    MIN_USUAL_ACTIVE_PRINCIPLE_DOSE,
    MAX_ACTIVE_PRINCIPLE_DOSE_AT_ONCE,
    MAX_ABSOLUTE_DURATION,
    MAX_USUAL_DURATION,
    MIN_ABSOLUTE_DURATION,
    MIN_USUAL_DURATION,
    PRESCRIPTION_LIMITED_TO_ONE_YEAR,
    MAX_FREQUENCY,
    MIN_FREQUENCY,
    AGE_IGNORED,
    RENAL_IMPAIRMENT,
    CONTRAINDICATED,
    RESERVED_FOR,
    IN_EVERY_NOSTRIL,
    MULTIPLE_ACTIVE_PRINCIPLES,
    DOSE_CHECKING_FOR_RENAL_IMPAIRMENT_NOT_SUPPORTED_YET,
    DOSE_CHECKING_FOR_LIVER_IMPAIRMENT_NOT_SUPPORTED_YET,
    DOSE_CHECKING_FOR_ELDERLY_IMPAIRMENT_NOT_SUPPORTED_YET,
    UNSUPPORTED_UNIT,
    DOSE_CHECKING_BY_INDICATION_NOT_SUPPORTED_YET_INDICATIONS_IGNORED,
    ONLY_DOSE_CHECKING_BY_DISPENSATION_UNIT_SUPPORTED,
    ONLY_DOSE_CHECKING_BY_ACTIVE_PRINCIPLE_SUPPORTED,
    CHECK_MAXIMUM_PER_INDICATION,
    NON_HOMOGENEOUS;

    public String value() {
        return name();
    }

    public static PosologyAlertType fromValue(String v) {
        return valueOf(v);
    }

}

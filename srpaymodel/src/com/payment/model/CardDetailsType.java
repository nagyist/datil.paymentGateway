//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.21 at 04:20:53 PM IST 
//


package com.payment.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDetailsType", propOrder = {
    "track1",
    "track2",
    "cardNumber",
    "expiryDate",
    "securityCode",
    "nameOnCard",
    "add1",
    "add2",
    "city",
    "state",
    "zip",
    "country"
})
public class CardDetailsType
    implements Serializable, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Track1")
    protected String track1;
    @XmlElement(name = "Track2")
    protected String track2;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "ExpiryDate")
    protected String expiryDate;
    @XmlElement(name = "SecurityCode")
    protected String securityCode;
    @XmlElement(name = "NameOnCard")
    protected String nameOnCard;
    @XmlElement(name = "Add1")
    protected String add1;
    @XmlElement(name = "Add2")
    protected String add2;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected String zip;
    @XmlElement(name = "Country")
    protected String country;

    /**
     * Gets the value of the track1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack1() {
        return track1;
    }

    /**
     * Sets the value of the track1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack1(String value) {
        this.track1 = value;
    }

    /**
     * Gets the value of the track2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2() {
        return track2;
    }

    /**
     * Sets the value of the track2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2(String value) {
        this.track2 = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the add1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdd1() {
        return add1;
    }

    /**
     * Sets the value of the add1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdd1(String value) {
        this.add1 = value;
    }

    /**
     * Gets the value of the add2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdd2() {
        return add2;
    }

    /**
     * Sets the value of the add2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdd2(String value) {
        this.add2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theTrack1;
            theTrack1 = this.getTrack1();
            strategy.appendField(locator, this, "track1", buffer, theTrack1);
        }
        {
            String theTrack2;
            theTrack2 = this.getTrack2();
            strategy.appendField(locator, this, "track2", buffer, theTrack2);
        }
        {
            String theCardNumber;
            theCardNumber = this.getCardNumber();
            strategy.appendField(locator, this, "cardNumber", buffer, theCardNumber);
        }
        {
            String theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate);
        }
        {
            String theSecurityCode;
            theSecurityCode = this.getSecurityCode();
            strategy.appendField(locator, this, "securityCode", buffer, theSecurityCode);
        }
        {
            String theNameOnCard;
            theNameOnCard = this.getNameOnCard();
            strategy.appendField(locator, this, "nameOnCard", buffer, theNameOnCard);
        }
        {
            String theAdd1;
            theAdd1 = this.getAdd1();
            strategy.appendField(locator, this, "add1", buffer, theAdd1);
        }
        {
            String theAdd2;
            theAdd2 = this.getAdd2();
            strategy.appendField(locator, this, "add2", buffer, theAdd2);
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity);
        }
        {
            String theState;
            theState = this.getState();
            strategy.appendField(locator, this, "state", buffer, theState);
        }
        {
            String theZip;
            theZip = this.getZip();
            strategy.appendField(locator, this, "zip", buffer, theZip);
        }
        {
            String theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry);
        }
        return buffer;
    }

}

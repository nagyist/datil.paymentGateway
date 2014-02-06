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
@XmlType(name = "TerminalDataType", propOrder = {
    "uniqueCode",
    "merchantCode",
    "terminalCode",
    "merchantName",
    "storeAdd",
    "city",
    "state",
    "zip"
})
public class TerminalDataType
    implements Serializable, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UniqueCode", required = true)
    protected String uniqueCode;
    @XmlElement(name = "MerchantCode", required = true)
    protected String merchantCode;
    @XmlElement(name = "TerminalCode", required = true)
    protected String terminalCode;
    @XmlElement(name = "MerchantName", required = true)
    protected String merchantName;
    @XmlElement(name = "StoreAdd")
    protected String storeAdd;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Zip")
    protected Integer zip;

    /**
     * Gets the value of the uniqueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCode() {
        return uniqueCode;
    }

    /**
     * Sets the value of the uniqueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCode(String value) {
        this.uniqueCode = value;
    }

    /**
     * Gets the value of the merchantCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     * Sets the value of the merchantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCode(String value) {
        this.merchantCode = value;
    }

    /**
     * Gets the value of the terminalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCode() {
        return terminalCode;
    }

    /**
     * Sets the value of the terminalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCode(String value) {
        this.terminalCode = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the storeAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreAdd() {
        return storeAdd;
    }

    /**
     * Sets the value of the storeAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreAdd(String value) {
        this.storeAdd = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZip(Integer value) {
        this.zip = value;
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
            String theUniqueCode;
            theUniqueCode = this.getUniqueCode();
            strategy.appendField(locator, this, "uniqueCode", buffer, theUniqueCode);
        }
        {
            String theMerchantCode;
            theMerchantCode = this.getMerchantCode();
            strategy.appendField(locator, this, "merchantCode", buffer, theMerchantCode);
        }
        {
            String theTerminalCode;
            theTerminalCode = this.getTerminalCode();
            strategy.appendField(locator, this, "terminalCode", buffer, theTerminalCode);
        }
        {
            String theMerchantName;
            theMerchantName = this.getMerchantName();
            strategy.appendField(locator, this, "merchantName", buffer, theMerchantName);
        }
        {
            String theStoreAdd;
            theStoreAdd = this.getStoreAdd();
            strategy.appendField(locator, this, "storeAdd", buffer, theStoreAdd);
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
            Integer theZip;
            theZip = this.getZip();
            strategy.appendField(locator, this, "zip", buffer, theZip);
        }
        return buffer;
    }

}

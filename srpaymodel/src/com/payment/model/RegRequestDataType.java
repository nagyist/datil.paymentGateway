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
@XmlType(name = "RegRequestDataType", propOrder = {
    "custIP",
    "dateTime",
    "refNo",
    "terminalData"
})
public class RegRequestDataType
    implements Serializable, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustIP", required = true)
    protected CustIPType custIP;
    @XmlElement(name = "DateTime")
    protected long dateTime;
    @XmlElement(name = "RefNo", required = true)
    protected String refNo;
    @XmlElement(name = "TerminalData", required = true)
    protected TerminalDataType terminalData;

    /**
     * Gets the value of the custIP property.
     * 
     * @return
     *     possible object is
     *     {@link CustIPType }
     *     
     */
    public CustIPType getCustIP() {
        return custIP;
    }

    /**
     * Sets the value of the custIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIPType }
     *     
     */
    public void setCustIP(CustIPType value) {
        this.custIP = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     */
    public long getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     */
    public void setDateTime(long value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
    }

    /**
     * Gets the value of the terminalData property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalDataType }
     *     
     */
    public TerminalDataType getTerminalData() {
        return terminalData;
    }

    /**
     * Sets the value of the terminalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalDataType }
     *     
     */
    public void setTerminalData(TerminalDataType value) {
        this.terminalData = value;
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
            CustIPType theCustIP;
            theCustIP = this.getCustIP();
            strategy.appendField(locator, this, "custIP", buffer, theCustIP);
        }
        {
            long theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
        }
        {
            String theRefNo;
            theRefNo = this.getRefNo();
            strategy.appendField(locator, this, "refNo", buffer, theRefNo);
        }
        {
            TerminalDataType theTerminalData;
            theTerminalData = this.getTerminalData();
            strategy.appendField(locator, this, "terminalData", buffer, theTerminalData);
        }
        return buffer;
    }
}
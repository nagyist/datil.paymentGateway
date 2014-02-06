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


/**
 * <p>Java class for TransactionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MerchantCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TerminalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RedeemRewards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDataType", propOrder = {
    "refNo",
    "dateTime",
    "merchantCode",
    "terminalCode",
    "transactionAmount",
    "currency",
    "redeemRewards"
})
public class TransactionDataType
    implements Serializable, ToString
{
    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RefNo", required = true)
    protected String refNo;
    @XmlElement(name = "DateTime")
    protected long dateTime;
    @XmlElement(name = "MerchantCode", required = true)
    protected String merchantCode;
    @XmlElement(name = "TerminalCode", required = true)
    protected String terminalCode;
    @XmlElement(name = "TransactionAmount")
    protected float transactionAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "RedeemRewards")
    protected boolean redeemRewards;

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
     * Gets the value of the transactionAmount property.
     * 
     */
    public float getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     */
    public void setTransactionAmount(float value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the redeemRewards property.
     * 
     */
    public boolean isRedeemRewards() {
        return redeemRewards;
    }

    /**
     * Sets the value of the redeemRewards property.
     * 
     */
    public void setRedeemRewards(boolean value) {
        this.redeemRewards = value;
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
            String theRefNo;
            theRefNo = this.getRefNo();
            strategy.appendField(locator, this, "refNo", buffer, theRefNo);
        }
        {
            long theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime);
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
            float theTransactionAmount;
            theTransactionAmount = this.getTransactionAmount();
            strategy.appendField(locator, this, "transactionAmount", buffer, theTransactionAmount);
        }
        {
            String theCurrency;
            theCurrency = this.getCurrency();
            strategy.appendField(locator, this, "currency", buffer, theCurrency);
        }
        {
            boolean theRedeemRewards;
            theRedeemRewards = this.isRedeemRewards();
            strategy.appendField(locator, this, "redeemRewards", buffer, theRedeemRewards);
        }
        return buffer;
    }

}

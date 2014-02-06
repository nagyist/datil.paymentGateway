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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrPayRequest", propOrder = {
	"MTI",
	"processingCode",
	"authToken",
    "deviceProfile",
    "regRequestData",
    "salesRequestData",
    "depositRequestData",
    "receiptRequestDataType"
})
@XmlRootElement(name = "SrPayRequest")
public class SrPayRequest
    implements Serializable, ToString
{
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "AuthToken", required = true)
    protected String authToken;
	@XmlElement(name = "MTI")
    protected Integer MTI;
	@XmlElement(name = "ProcessingCode")
    protected String processingCode;
    @XmlElement(name = "DeviceProfile", required = true)
    protected DeviceProfileType deviceProfile;
    @XmlElement(name = "RegRequestData")
    protected RegRequestDataType regRequestData;
    @XmlElement(name = "SalesRequestData")
    protected SalesRequestDataType salesRequestData;
    @XmlElement(name = "DepositRequestData")
    protected DepositRequestDataType depositRequestData;
    @XmlElement(name = "ReceiptRequestDataType")
    protected ReceiptRequestDataType receiptRequestDataType;
    @XmlAttribute(name = "version")
    protected Float version;
    @XmlAttribute(name = "TimeOut")
    protected Integer timeOut;

    /**
     * Gets the value of the authToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the value of the authToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    
    public Integer getMTI() {
		return MTI;
	}

	public void setMTI(Integer mTI) {
		this.MTI = mTI;
	}
    
    /**
     * Gets the value of the processingCode property.
     * 
     */
    public String getProcessingCode() {
        return processingCode;
    }

    /**
     * Sets the value of the processingCode property.
     * 
     */
    public void setProcessingCode(String value) {
        this.processingCode = value;
    }

    /**
     * Gets the value of the deviceProfile property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceProfileType }
     *     
     */
    public DeviceProfileType getDeviceProfile() {
        return deviceProfile;
    }

    /**
     * Sets the value of the deviceProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceProfileType }
     *     
     */
    public void setDeviceProfile(DeviceProfileType value) {
        this.deviceProfile = value;
    }

    /**
     * Gets the value of the regRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link RegRequestDataType }
     *     
     */
    public RegRequestDataType getRegRequestData() {
        return regRequestData;
    }

    /**
     * Sets the value of the regRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegRequestDataType }
     *     
     */
    public void setRegRequestData(RegRequestDataType value) {
        this.regRequestData = value;
    }

    /**
     * Gets the value of the salesRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRequestDataType }
     *     
     */
    public SalesRequestDataType getSalesRequestData() {
        return salesRequestData;
    }

    /**
     * Sets the value of the salesRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRequestDataType }
     *     
     */
    public void setSalesRequestData(SalesRequestDataType value) {
        this.salesRequestData = value;
    }

    /**
     * Gets the value of the depositRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link DepositRequestDataType }
     *     
     */
    public DepositRequestDataType getDepositRequestData() {
        return depositRequestData;
    }

    /**
     * Sets the value of the depositRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositRequestDataType }
     *     
     */
    public void setDepositRequestData(DepositRequestDataType value) {
        this.depositRequestData = value;
    }

    
    /**
     * Gets the value of the depositRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link DepositRequestDataType }
     *     
     */
    public ReceiptRequestDataType getReceiptRequestDataType() {
        return receiptRequestDataType;
    }

    /**
     * Sets the value of the depositRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositRequestDataType }
     *     
     */
    public void setReceiptRequestDataType(ReceiptRequestDataType value) {
        this.receiptRequestDataType = value;
    }
    
    
    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersion(Float value) {
        this.version = value;
    }

    /**
     * Gets the value of the timeOut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeOut() {
        return timeOut;
    }

    /**
     * Sets the value of the timeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeOut(Integer value) {
        this.timeOut = value;
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
            String theAuthToken;
            theAuthToken = this.getAuthToken();
            strategy.appendField(locator, this, "authToken", buffer, theAuthToken);
        }
        {
            String theProcessingCode;
            theProcessingCode = this.getProcessingCode();
            strategy.appendField(locator, this, "processingCode", buffer, theProcessingCode);
        }
        {
            DeviceProfileType theDeviceProfile;
            theDeviceProfile = this.getDeviceProfile();
            strategy.appendField(locator, this, "deviceProfile", buffer, theDeviceProfile);
        }
        {
            RegRequestDataType theRegRequestData;
            theRegRequestData = this.getRegRequestData();
            strategy.appendField(locator, this, "regRequestData", buffer, theRegRequestData);
        }
        {
            SalesRequestDataType theSalesRequestData;
            theSalesRequestData = this.getSalesRequestData();
            strategy.appendField(locator, this, "salesRequestData", buffer, theSalesRequestData);
        }
        {
            DepositRequestDataType theDepositRequestData;
            theDepositRequestData = this.getDepositRequestData();
            strategy.appendField(locator, this, "depositRequestData", buffer, theDepositRequestData);
        }
        {
            Float theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            Integer theTimeOut;
            theTimeOut = this.getTimeOut();
            strategy.appendField(locator, this, "timeOut", buffer, theTimeOut);
        }
        return buffer;
    }

}

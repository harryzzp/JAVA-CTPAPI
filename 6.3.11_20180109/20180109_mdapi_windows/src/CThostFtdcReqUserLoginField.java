/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcReqUserLoginField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqUserLoginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqUserLoginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcReqUserLoginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_Password_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_MacAddress_get(swigCPtr, this);
  }

  public void setOneTimePassword(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_OneTimePassword_set(swigCPtr, this, value);
  }

  public String getOneTimePassword() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_OneTimePassword_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_ClientIPAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    thostmduserapiJNI.CThostFtdcReqUserLoginField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return thostmduserapiJNI.CThostFtdcReqUserLoginField_LoginRemark_get(swigCPtr, this);
  }

  public CThostFtdcReqUserLoginField() {
    this(thostmduserapiJNI.new_CThostFtdcReqUserLoginField(), true);
  }

}

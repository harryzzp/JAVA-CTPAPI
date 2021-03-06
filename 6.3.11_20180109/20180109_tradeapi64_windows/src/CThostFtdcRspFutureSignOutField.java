/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcRspFutureSignOutField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcRspFutureSignOutField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspFutureSignOutField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcRspFutureSignOutField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttradeapiJNI.CThostFtdcRspFutureSignOutField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttradeapiJNI.CThostFtdcRspFutureSignOutField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcRspFutureSignOutField() {
    this(thosttradeapiJNI.new_CThostFtdcRspFutureSignOutField(), true);
  }

}

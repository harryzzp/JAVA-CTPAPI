/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcQryProductField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    thosttradeapiJNI.CThostFtdcQryProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thosttradeapiJNI.CThostFtdcQryProductField_ProductID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    thosttradeapiJNI.CThostFtdcQryProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return thosttradeapiJNI.CThostFtdcQryProductField_ProductClass_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcQryProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcQryProductField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductField() {
    this(thosttradeapiJNI.new_CThostFtdcQryProductField(), true);
  }

}
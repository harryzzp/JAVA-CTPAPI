/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcDiscountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcDiscountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDiscountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcDiscountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcDiscountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcDiscountField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmduserapiJNI.CThostFtdcDiscountField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmduserapiJNI.CThostFtdcDiscountField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcDiscountField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcDiscountField_InvestorID_get(swigCPtr, this);
  }

  public void setDiscount(double value) {
    thostmduserapiJNI.CThostFtdcDiscountField_Discount_set(swigCPtr, this, value);
  }

  public double getDiscount() {
    return thostmduserapiJNI.CThostFtdcDiscountField_Discount_get(swigCPtr, this);
  }

  public CThostFtdcDiscountField() {
    this(thostmduserapiJNI.new_CThostFtdcDiscountField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcMarketDataAsk45Field {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcMarketDataAsk45Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataAsk45Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcMarketDataAsk45Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAskPrice4(double value) {
    thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskVolume4_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return thostmduserapiJNI.CThostFtdcMarketDataAsk45Field_AskVolume5_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataAsk45Field() {
    this(thostmduserapiJNI.new_CThostFtdcMarketDataAsk45Field(), true);
  }

}
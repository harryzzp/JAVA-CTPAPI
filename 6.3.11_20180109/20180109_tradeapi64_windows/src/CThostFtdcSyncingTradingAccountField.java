/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcSyncingTradingAccountField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingTradingAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingTradingAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcSyncingTradingAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPreMortgage(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_set(swigCPtr, this, value);
  }

  public double getPreMortgage() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreMortgage_get(swigCPtr, this);
  }

  public void setPreCredit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_set(swigCPtr, this, value);
  }

  public double getPreCredit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreCredit_get(swigCPtr, this);
  }

  public void setPreDeposit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_set(swigCPtr, this, value);
  }

  public double getPreDeposit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreDeposit_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreBalance_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreMargin_get(swigCPtr, this);
  }

  public void setInterestBase(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_set(swigCPtr, this, value);
  }

  public double getInterestBase() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_InterestBase_get(swigCPtr, this);
  }

  public void setInterest(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Interest_set(swigCPtr, this, value);
  }

  public double getInterest() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Interest_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Withdraw_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CurrMargin_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PositionProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Balance_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Available_get(swigCPtr, this);
  }

  public void setWithdrawQuota(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_set(swigCPtr, this, value);
  }

  public double getWithdrawQuota() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_WithdrawQuota_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Reserve_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SettlementID_get(swigCPtr, this);
  }

  public void setCredit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Credit_set(swigCPtr, this, value);
  }

  public double getCredit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Credit_get(swigCPtr, this);
  }

  public void setMortgage(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_set(swigCPtr, this, value);
  }

  public double getMortgage() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_Mortgage_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setDeliveryMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_set(swigCPtr, this, value);
  }

  public double getDeliveryMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_DeliveryMargin_get(swigCPtr, this);
  }

  public void setExchangeDeliveryMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_set(swigCPtr, this, value);
  }

  public double getExchangeDeliveryMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_ExchangeDeliveryMargin_get(swigCPtr, this);
  }

  public void setReserveBalance(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_set(swigCPtr, this, value);
  }

  public double getReserveBalance() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_ReserveBalance_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setPreFundMortgageIn(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageIn() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageIn_get(swigCPtr, this);
  }

  public void setPreFundMortgageOut(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_set(swigCPtr, this, value);
  }

  public double getPreFundMortgageOut() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_PreFundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageIn(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_set(swigCPtr, this, value);
  }

  public double getFundMortgageIn() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageIn_get(swigCPtr, this);
  }

  public void setFundMortgageOut(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_set(swigCPtr, this, value);
  }

  public double getFundMortgageOut() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageOut_get(swigCPtr, this);
  }

  public void setFundMortgageAvailable(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_set(swigCPtr, this, value);
  }

  public double getFundMortgageAvailable() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FundMortgageAvailable_get(swigCPtr, this);
  }

  public void setMortgageableFund(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_set(swigCPtr, this, value);
  }

  public double getMortgageableFund() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_MortgageableFund_get(swigCPtr, this);
  }

  public void setSpecProductMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductMargin_get(swigCPtr, this);
  }

  public void setSpecProductFrozenMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenMargin_get(swigCPtr, this);
  }

  public void setSpecProductCommission(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductCommission() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCommission_get(swigCPtr, this);
  }

  public void setSpecProductFrozenCommission(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_set(swigCPtr, this, value);
  }

  public double getSpecProductFrozenCommission() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductFrozenCommission_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfit_get(swigCPtr, this);
  }

  public void setSpecProductCloseProfit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_set(swigCPtr, this, value);
  }

  public double getSpecProductCloseProfit() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductCloseProfit_get(swigCPtr, this);
  }

  public void setSpecProductPositionProfitByAlg(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_set(swigCPtr, this, value);
  }

  public double getSpecProductPositionProfitByAlg() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductPositionProfitByAlg_get(swigCPtr, this);
  }

  public void setSpecProductExchangeMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_set(swigCPtr, this, value);
  }

  public double getSpecProductExchangeMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_SpecProductExchangeMargin_get(swigCPtr, this);
  }

  public void setFrozenSwap(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_set(swigCPtr, this, value);
  }

  public double getFrozenSwap() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_FrozenSwap_get(swigCPtr, this);
  }

  public void setRemainSwap(double value) {
    thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_RemainSwap_set(swigCPtr, this, value);
  }

  public double getRemainSwap() {
    return thosttradeapiJNI.CThostFtdcSyncingTradingAccountField_RemainSwap_get(swigCPtr, this);
  }

  public CThostFtdcSyncingTradingAccountField() {
    this(thosttradeapiJNI.new_CThostFtdcSyncingTradingAccountField(), true);
  }

}
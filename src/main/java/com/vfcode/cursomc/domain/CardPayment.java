package com.vfcode.cursomc.domain;

import com.vfcode.cursomc.domain.enums.StatePaymentType;

public class CardPayment extends Payment {
  private static final long serialVersionUID = 1L;
  
  private Integer installmentNumbers;

  public CardPayment() {}

  public CardPayment(Integer id, StatePaymentType statePaymentType, Order order, Integer installmentNumbers) {
    super(id, statePaymentType, order);
    this.installmentNumbers = installmentNumbers;
  }

  public Integer getInstallmentNumbers() {
    return installmentNumbers;
  }

  public void setInstallmentNumbers(Integer installmentNumbers) {
    this.installmentNumbers = installmentNumbers;
  }

  
}

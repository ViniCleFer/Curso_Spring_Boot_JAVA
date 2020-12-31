package com.vfcode.cursomc.domain;

import java.util.Date;

import com.vfcode.cursomc.domain.enums.StatePaymentType;

public class BankSlipPayment extends Payment {
  private static final long serialVersionUID = 1L;
  
  private Date dueDate;
  private Date payday;

  public BankSlipPayment() {}

  public BankSlipPayment(Integer id, StatePaymentType statePaymentType, Order order, Date dueDate,  Date payday) {
    super(id, statePaymentType, order);
    this.dueDate = dueDate;
    this.payday = payday;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public Date getPayday() {
    return payday;
  }

  public void setPayday(Date payday) {
    this.payday = payday;
  }

  
}

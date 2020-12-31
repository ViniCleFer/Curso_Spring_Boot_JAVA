package com.vfcode.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Integer id;
  private Date instante;

  private Payment payment;

  private Client client;

  private Address deliveryAddress;

  public Order() {}

  public Order(Integer id, Date instante, Payment payment, Client client, Address deliveryAddress) {
    this.id = id;
    this.instante = instante;
    this.payment = payment;
    this.client = client;
    this.deliveryAddress = deliveryAddress;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getInstante() {
    return instante;
  }

  public void setInstante(Date instante) {
    this.instante = instante;
  }

  public Payment getPayment() {
    return payment;
  }

  public void setPayment(Payment payment) {
    this.payment = payment;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Order other = (Order) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  
}
package com.vfcode.cursomc.domain.enums;

public enum StatePaymentType {
  
  PENDING(1, "Pendente"),
  PAID(2, "Pago"),
  CANCELED(3, "Cancelado");

  private Integer code;
  private String description;

  private StatePaymentType(Integer code, String description) {
    this.code = code;
    this.description = description;
  }

  public Integer getCode() {
    return code;
  }

  public String getdescription() {
    return description;
  }

  public static StatePaymentType toEnum(Integer code) {

    if (code == null) {
      return null;
    }

    for (StatePaymentType x : StatePaymentType.values()) {
      if (code.equals(x.getCode())) {
        return x;
      }
    }

    throw new IllegalArgumentException("Id inválido "+ code);
  }
}

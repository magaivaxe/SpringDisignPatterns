package com.mpsg.designpatternsapp.decorator;

import java.math.BigDecimal;

public class ThickCrustPizza extends Pizza {

  public ThickCrustPizza() {
    super();
    description = "Thick Crust Pizza";
  }

  @Override
  public BigDecimal getCost() {
    return new BigDecimal(15.00);
  }

}

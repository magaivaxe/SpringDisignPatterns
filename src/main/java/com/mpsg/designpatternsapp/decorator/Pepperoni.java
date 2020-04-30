package com.mpsg.designpatternsapp.decorator;

import java.math.BigDecimal;

public class Pepperoni extends PizzaIngredient {

  private Pizza pizza;

  public Pepperoni(Pizza pizza) {
    super();
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + " + pepperoni!";
  }

  @Override
  public BigDecimal getCost() {
    return new BigDecimal(1.50).add(this.pizza.getCost());
  }

}

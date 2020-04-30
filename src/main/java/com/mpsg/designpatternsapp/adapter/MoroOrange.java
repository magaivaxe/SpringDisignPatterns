package com.mpsg.designpatternsapp.adapter;

public class MoroOrange implements Orange {

  @Override
  public String getVariety() {
    return "Moro orange";
  }

  @Override
  public void eat() {
    System.out.println("Moro get enjoyed");
  }

  @Override
  public void peel() {
    System.out.println("Moro get peeled");
  }

  @Override
  public void juice() {
    System.out.println("Moro get juiced");
  }

}

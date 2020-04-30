package com.mpsg.designpatternsapp.adapter;

/**
 * An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot
 * be connected directly. An Adapter wraps an existing class with a new interface so that it becomes
 * compatible with the client’s interface. In this case wrap orange interface in apple interface
 * 
 * @author gomesm
 *
 */
public class AppleAdapter implements Apple {

  private final Orange orange;

  public AppleAdapter(Orange orange) {
    super();
    this.orange = orange;
  }
  @Override
  public String getVariety() {
    return orange.getVariety();
  }

  @Override
  public void eat() {
    orange.peel();
    orange.eat();
  }

}

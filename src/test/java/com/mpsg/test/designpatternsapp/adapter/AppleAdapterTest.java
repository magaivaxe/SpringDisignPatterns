package com.mpsg.test.designpatternsapp.adapter;

import org.junit.Test;

import com.mpsg.designpatternsapp.adapter.Apple;
import com.mpsg.designpatternsapp.adapter.AppleAdapter;
import com.mpsg.designpatternsapp.adapter.MoroOrange;
import com.mpsg.designpatternsapp.adapter.Orange;

public class AppleAdapterTest {

  @Test
  public void testAdapter() {
    Orange orange = new MoroOrange();
    Apple apple = new AppleAdapter(orange);
    System.out.println(apple.getVariety());
    apple.eat();
  }
}

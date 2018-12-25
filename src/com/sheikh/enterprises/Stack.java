package com.sheikh.enterprises;

import java.util.ArrayList;

public class Stack {

  ArrayList<Integer> internal = new ArrayList();

  public int count() {
    return internal.size();
  }


  public void push(int number){
    internal.add(number);

  }
}

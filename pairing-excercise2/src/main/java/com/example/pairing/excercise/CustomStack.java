package com.example.pairing.excercise;

import java.util.ArrayList;
import java.util.List;

public class CustomStack<T> {

  List<T> array = new ArrayList<>();
  int lastIdx = -1;

  public void push(final T element) {
      array.add(element);
      lastIdx++;
  }

  public T pop() {
    if(array.size() == 0) throw new IllegalStateException();
    return array.get(lastIdx--);
  }
}

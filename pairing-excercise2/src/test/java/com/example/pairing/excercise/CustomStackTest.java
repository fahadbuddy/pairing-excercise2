package com.example.pairing.excercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class CustomStackTest {

  @Test
  void pushOneElementAndPopOneElement() {
    // Given
    CustomStack<Integer> s = new CustomStack();
    int expected = 1;

    // When
    s.push(expected);
    Integer actual = s.pop();

    //Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void pushTwoElementsAndPopOneElement() {
    // Given
    CustomStack<Integer> s = new CustomStack();
    int expected = 1;

    // When
    s.push(2);
    s.push(expected);
    Integer actual = s.pop();

    //Then
    assertThat(actual).isEqualTo(expected);
  }

  @Test
  void pushSomeElementsAndPopSomeElements() {
    // Given
    CustomStack<Integer> s = new CustomStack();

    // When
    s.push(1);
    s.push(2);
    s.push(3);

    //Then
    assertThat(s.pop()).isEqualTo(3);
    assertThat(s.pop()).isEqualTo(2);
    assertThat(s.pop()).isEqualTo(1);
  }


  @Test
  void popAnEmptyStackThrowsException() {
    // Given
    CustomStack<Integer> s = new CustomStack();

    // When
    Assertions.assertThrows(IllegalStateException.class, () -> s.pop());

  }


}

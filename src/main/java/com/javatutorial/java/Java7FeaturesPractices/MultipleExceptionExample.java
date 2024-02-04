package com.javatutorial.java.Java7FeaturesPractices;

public class MultipleExceptionExample {

  /*
  Java allows you to catch multiple type exceptions in a single catch block. It was introduced in Java 7 and helps to optimize code.

   You can use vertical bar (|) to separate multiple exceptions in catch block.

   */

  public static void main(String[] args) {
    try {
      int intArr[] = new int[10];
      intArr[10] = 30/0;
    } catch( ArithmeticException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }

}

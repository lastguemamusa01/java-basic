package com.javatutorial.java.java8.Java45FeaturesPractices;

import java.util.Scanner;

public class AssertionExample {

  /*
  Assertion is a statement in java. It can be used to test your assumptions about the program.

  While executing assertion, it is believed to be true. If it fails, JVM will throw an error named AssertionError.
  It is mainly used for testing purpose.

   */

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter you age");

    int value = scanner.nextInt();
    assert value>=18:"Not valid";

    System.out.println("value is "+value);

  }



}

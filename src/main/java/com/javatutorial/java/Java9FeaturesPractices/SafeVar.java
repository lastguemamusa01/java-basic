package com.javatutorial.java.Java9FeaturesPractices;

import java.util.ArrayList;
import java.util.List;

public class SafeVar {
  /*

  It is an annotation which applies on a method or constructor that takes varargs parameters
  It is used to ensure that the method does not perform unsafe operations on its varargs parameters.

  It was included in Java7 and can only be applied on

  Final methods
  Static methods
  Constructors

  From Java 9, it can also be used with private instance methods.

  The @SafeVarargs annotation can be applied only to methods that cannot be overridden.
  Applying to the other methods will throw a compile time error.

   */

  // safevargs annotation
  @SafeVarargs
  private void display(List<String>... products) {
    for(List<String> product: products) {
      System.out.println(product);
    }
  }

  public static void main(String[] args) {

    SafeVar p = new SafeVar();
    List<String> list = new ArrayList<>();
    list.add("laptop");
    list.add("table");
    List<String> list2 = new ArrayList<>();
    list2.add("soap");
    list2.add("shampoo");
    p.display(list, list2);

  }


}

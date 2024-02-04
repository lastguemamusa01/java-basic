package com.javatutorial.java.Java7FeaturesPractices;

import java.util.ArrayList;
import java.util.List;


// Generic Constructor
class GenericClass<X> {
  <T> GenericClass(T t) {
    System.out.println(t);
  }
}


public class TypeInference {

  /*

  type inference in generic instance creation

  In Java 7, Java provides improved compiler which is enough smart to infer the type of generic instance.
  Now, you can replace the type arguments with an empty set of type parameters (<>).
  This pair of angle brackets is informally called the diamond.

   */

  public static void main(String[] args) {

    // in java 6 and earlier
    List<Integer> list = new ArrayList<Integer>();
    // in java 7 type inference
    List<Integer> list2 = new ArrayList<>();

    list2.add(12);
    for(Integer number: list2) {
        System.out.println(number);
    }

    GenericClass<String> gc = new GenericClass<>("hello");


  }

}

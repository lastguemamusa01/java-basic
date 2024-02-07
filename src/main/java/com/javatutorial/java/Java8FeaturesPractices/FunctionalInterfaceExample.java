package com.javatutorial.java.Java8FeaturesPractices;


interface Doable {
  default void dolt() {
    System.out.println("Do it now");
  }
}

@FunctionalInterface
interface Sayable3 extends Doable {
  void say(String msg); // abstract method

  // It can contain any number of Object class methods.
  int hashCode();
  String toString();
  boolean equals(Object obj);
}

public class FunctionalInterfaceExample implements  Sayable3 {

  /*
  An Interface that contains exactly one abstract method is known as functional interface. It can have any number
  of default, static methods but can contain only one abstract method. It can also declare methods of object class

  Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
  It is a new feature in Java, which helps to achieve functional programming approach.

  A functional interface can have methods of object class.

  A functional interface can extends another interface only when it does not have any abstract method.

  interface Sayable{
      void say(String msg);   // abstract method
  }
  @FunctionalInterface
  interface Doable extends Sayable{
      // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface
      void doIt();
  }

  java Predefined-Functional Interfaces

  Java provides predefined functional interfaces to deal with functional programming by using lambda and method references.

  You can also define your own custom functional interface. Following is the list of functional
  interface which are placed in java.util.function package.






   */

  public void say(String msg) {
    System.out.println(msg);
  }

  public static void main(String[] args) {

    FunctionalInterfaceExample file = new FunctionalInterfaceExample();
    file.say("hi");
    file.dolt();



  }


}

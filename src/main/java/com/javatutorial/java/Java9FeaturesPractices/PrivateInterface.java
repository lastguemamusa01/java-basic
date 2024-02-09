package com.javatutorial.java.Java9FeaturesPractices;

interface Sayable {
  default void say() {
    saySomething(); // calling private method
    // this call will be printed without instantiate
    sayPolitely(); // calling private static method
  }

  // private method inside the interface
  private void saySomething() {
    System.out.println("hello i'm private method");
  }

  // private static method inside interface

  private static void sayPolitely() { System.out.println("i'm private static method"); }

}

public class PrivateInterface implements Sayable {

  /*

  In Java 9, we can create private methods inside an interface. Interface allows us to declare private methods
  that help to share common code between non-abstract methods.

  we can also create private static methods inside an interface.

   */

  public static void main(String[] args) {
    Sayable s = new PrivateInterface();
    s.say();
  }

}

package com.javatutorial.java.JavaPolymorphism;

class Vehicle {
  void run() { System.out.println("vehicle is running"); }
}

public class Bike2 {
  /*

  If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

  Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
  Method overriding is used for runtime polymorphism

  The method must have the same name as in the parent class
  The method must have the same parameter as in the parent class.
  There must be an IS-A relationship (inheritance).

  Can we override static method?
  No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

  Why can we not override static method?
  It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.





   */

  void run() { System.out.println("Bike is running"); } // method overriding

  public static void main(String[] args) {
    Bike2 bike = new Bike2();
    bike.run();
  }

}

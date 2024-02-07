package com.javatutorial.java.Java8FeaturesPractices;

interface Sayable8{
  // Default method
  default void say(){
    System.out.println("Hello, this is default method");
  }
  // Abstract method
  void sayMore(String msg);

  // static method
  static void sayLouder(String msg){
    System.out.println(msg);
  }

}

public class DefaultMethods implements Sayable8{

  /*
  Java provides a facility to create default methods inside the interface.
  Methods which are defined inside the interface and tagged with default are known as default methods.
  These methods are non-abstract methods.

  After having default and static methods inside the interface,
  we think about the need of abstract class in Java. An interface and an abstract class is almost
  similar except that you can create constructor in the abstract class whereas you can't do this in interface.

   */

  public void sayMore(String msg){        // implementing abstract method
    System.out.println(msg);
  }
  public static void main(String[] args) {
    DefaultMethods dm = new DefaultMethods();
    dm.say();   // calling default method
    dm.sayMore("Work is worship");  // calling abstract method
    Sayable8.sayLouder("Helloooo...");   // calling static method

  }


}

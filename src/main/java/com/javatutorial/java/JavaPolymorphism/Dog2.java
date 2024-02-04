package com.javatutorial.java.JavaPolymorphism;

class Animal2{

  void eatDynamicBinding(){System.out.println("animal is eating...");}

}
public class Dog2 extends Animal2 {

  /*

  Static Binding and Dynamic Binding

  binding - Connecting a method call to the method body is known as binding.

  2 types of binding

  Static Binding (also known as Early Binding).
  Dynamic Binding (also known as Late Binding).

  When type of the object is determined at compiled time(by the compiler), it is known as static binding.

  If there is any private, final or static method in a class, there is static binding.

  When type of the object is determined at run-time, it is known as dynamic binding


   */

  int data=30; // variables have a type

  // static binding
  private void eat(){System.out.println("static - dog is eating...");}


  // dynamic biding
  void eatDynamicBinding(){System.out.println("dynamic - dog is eating...");}
  public static void main(String[] args) {
    Dog2 d1;  //  References have a type
    Dog2 d2 = new Dog2(); // Objects have a type, Here d2 is an instance of Dog class, but it is also an instance of Animal.
    d2.eat();
    d2.eatDynamicBinding();
  }
}

package com.javatutorial.java.JavaPolymorphism;


class A {
  A get() { return this; }
}
public class B1 extends A {

  /*
   The covariant return type specifies that the return type may vary in the same direction as the subclass

   Before Java5, it was not possible to override any method by changing the return type. But now, since Java5,
   it is possible to override method by changing the return type if subclass overrides any method whose return
   type is Non-Primitive but it changes its return type to subclass type. Let's take a simple

  advantages

  1) Covariant return type assists to stay away from the confusing type casts in the class hierarchy and makes
  the code more usable, readable, and maintainable.

  2) In the method overriding, the covariant return type provides the liberty to have more to the point return types.

  3) Covariant return type helps in preventing the run-time ClassCastExceptions on returns.

  Covariant prevent complext Type casting

    A2 a2 = new A2();

   // we need to do the type casting to make it
   // more clear to reader about the kind of object created
   ((A2)a2.foo()).print();

   A3 a3 = new A3();

   // doing the type casting
   ((A3)a3.foo()).print();


   */

  @Override
  B1 get() { return this; }

  // method overwrite with covariant return type
  void message() { System.out.println("convariant return type"); }

  public static void main(String[] args) {
    new B1().get().message();
  }

}

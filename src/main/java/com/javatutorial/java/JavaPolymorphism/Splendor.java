package com.javatutorial.java.JavaPolymorphism;

class Bike11 {
  int speedlimit=90;
  void run() { System.out.println("Running"); }
}
public class Splendor extends Bike11 {

  /*

  Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is
  derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms.
  So polymorphism means many forms.

  There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.
  We can perform polymorphism in java by method overloading and method overriding.

  If you overload a static method in Java, it is the example of compile time polymorphism.
  Here, we will focus on runtime polymorphism in java.

  Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is
  resolved at runtime rather than compile-time.

  In this process, an overridden method is called through the reference variable of a superclass.
  The determination of the method to be called is based on the object being referred to by the reference variable.

  Upcasting

  If the reference variable of Parent class refers to the object of Child class, it is known as upcasting

  class A{}
  class B extends A{}

  A a=new B();//upcasting

  interface I{}
  class A{}
  class B extends A implements I{}

  B IS-A A
  B IS-A I
  B IS-A Object

  Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.

  A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

  In the example given below, both the classes have a data member speedlimit. We are accessing the data member by
  the reference variable of Parent class which refers to the subclass object. Since we are accessing the data member
  which is not overridden, hence it will access the data member of the Parent class always.

  Runtime polymorphism can't be achieved by data members.

  Java Runtime Polymorphism with Multilevel Inheritance works fine

   */

  int speedlimit=150;

  void run() { System.out.println("bike running with 60 km"); }

  public static void main(String[] args) {
    Bike11 sp = new Splendor(); // upcasting
    sp.run();
    System.out.println(sp.speedlimit);//90 -> Runtime polymorphism can't be achieved by data members.
  }

}

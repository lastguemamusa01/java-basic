package com.javatutorial.java.JavaAbstraction;

abstract class Bike {

  Bike() { System.out.println("bike is created"); }
  abstract void run();

  void changeGear() { System.out.println("changing gears"); }

}
public class Honda4 extends Bike {

  /*

  A class which is declared with the abstract keyword is known as an abstract class in Java.
  It can have abstract and non-abstract methods (method with the body).

  Abstraction is a process of hiding the implementation details and showing only functionality to the user.

  Abstraction lets you focus on what the object does instead of how it does it.

  2 ways to achieve abstraction in java :
  Abstract clas - 0 to 100 %
  interface 100 %

  An abstract class must be declared with an abstract keyword.
  It can have abstract and non-abstract methods.
  It cannot be instantiated.
  It can have constructors and static methods also.
  It can have final methods which will force the subclass not to change the body of the method.

  A method which is declared as abstract and does not have implementation is known as an abstract method.

  Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the
  implementation class is provided by the factory method.

  A factory method is a method that returns the instance of the class. We will learn about the factory method later.

  An abstract class can have a data member, abstract method, method body (non-abstract method), constructor,
   and even main() method.

   The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.




   */

  @Override
  void run() { System.out.println("honda bike is running"); }

  public static void main(String[] args) {
    Bike honda = new Honda4();
    honda.run();
    honda.changeGear();
  }

}



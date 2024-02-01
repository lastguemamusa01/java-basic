package com.javatutorial.java.java8.JavaOOPPractices;

public class TestContructor {

  /*
  In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.

  It is a special type of method which is used to initialize the object.

  Every time an object is created using the new() keyword, at least one constructor is called.

  It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

  There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

  There are 3 rules defined for the constructor.

  Constructor name must be the same as its class name
  A Constructor must have no explicit return type
  A Java constructor cannot be abstract, static, final, and synchronized

  In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

  Does constructor return any value ?
  Yes, it is the current class instance (You cannot use return type yet it returns a value).

  Can constructor perform other tasks instead of initialization ?
  Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method

   */

  int id;
  String name;

  // A constructor is called "Default Constructor" when it doesn't have any parameter.
  TestContructor() {
    System.out.println("bike is created");
  }

  // A constructor which has a specific number of parameters is called a parameterized constructor.
  TestContructor(int id, String n) {
    this.id = id;
    name = n;
  }

  // constructor overloading
  TestContructor(int id) {
    this.id = id;
  }

  void display() { System.out.println("id: " + id + " name: " + name); }

  public static void main(String[] args) {
    TestContructor testContructor1 = new TestContructor();
    TestContructor testContructor = new TestContructor(1,"flash");
    TestContructor anotherTestContructor = new TestContructor(2);
    testContructor.display();
    anotherTestContructor.display();
  }

}

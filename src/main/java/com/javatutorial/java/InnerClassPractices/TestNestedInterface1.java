package com.javatutorial.java.InnerClassPractices;


interface Showable{
  void show();
  interface Message {
    void msg();
  }
}


public class TestNestedInterface1 implements Showable.Message {
  /*

  An interface, i.e., declared within another interface or class, is known as a nested interface. The nested
  interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface
  must be referred to by the outer interface or class. It can't be accessed directly.

  - The nested interface must be public if it is declared inside the interface, but it can have any access
  modifier if declared within the class.

  - Nested interfaces are declared static
   */

  // public porque es interface
  public void msg() { System.out.println("hello interface practice"); }

  public static void main(String[] args) {
    Showable.Message message = new TestNestedInterface1(); // upcasting here
    message.msg();
  }


}

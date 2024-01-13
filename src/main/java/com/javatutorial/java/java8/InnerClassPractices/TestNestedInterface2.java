package com.javatutorial.java.java8.InnerClassPractices;

class A {
  interface Message {
    void msg();
  }
}
public class TestNestedInterface2 implements A.Message {

  // use public for access the interface
  public void msg() { System.out.println("hello class interface practice"); }

  public static void main(String[] args) {
    A.Message message = new TestNestedInterface2(); // upcasting
    message.msg();
  }


}

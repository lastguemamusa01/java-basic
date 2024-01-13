package com.javatutorial.java.java8.InnerClassPractices;

interface M {
  class A {
    void msg() { System.out.println("bla bla bla");}
  }
}

public class TestNestedInterface3 extends M.A {

  void msg() { System.out.println("mensaje overrided");}

  public static void main(String[] args) {
    M.A message = new TestNestedInterface3(); // upcasting
    message.msg();
  }

}

package com.javatutorial.java.InnerClassPractices;

public class TestOuter1 {

  /*

  A static class is a class that is created inside a class, is called a static nested class in Java.
  It cannot access non-static data members and methods. It can be accessed by outer class name.

  If you have the static member inside the static nested class, you don't need to create an instance of the static nested class.
  */

  static int data = 30;

  static class Inner {
    void display() { System.out.println(data); }
  }

  static class InnerStatic {
    static void displayStatic() { System.out.print(data); }
  }

  public static void main(String[] args) {
    TestOuter1.Inner obj = new TestOuter1.Inner(); // need to create new because of void method that is not static
    obj.display();

    TestOuter1.InnerStatic.displayStatic();  // no need to create new, because this static class have static method

  }

}

package com.javatutorial.java.Java8FeaturesPractices;

abstract class AbstractClass{
  public AbstractClass() {        // constructor
    System.out.println("You can create constructor in abstract class");
  }
  abstract int add(int a, int b); // abstract method
  int sub(int a, int b){      // non-abstract method
    return a-b;
  }
  static int multiply(int a, int b){  // static method
    return a*b;
  }
}

public class AbstractTest extends AbstractClass{

  /*

  After having default and static methods inside the interface,
  we think about the need of abstract class in Java. An interface and an abstract class is almost
  similar except that you can create constructor in the abstract class whereas you can't do this in interface.

   */

  public int add(int a, int b){        // implementing abstract method
    return a+b;
  }
  public static void main(String[] args) {
    AbstractTest a = new AbstractTest();
    int result1 = a.add(20, 10);    // calling abstract method
    int result2 = a.sub(20, 10);    // calling non-abstract method
    int result3 = AbstractClass.multiply(20, 10); // calling static method
    System.out.println("Addition: "+result1);
    System.out.println("Substraction: "+result2);
    System.out.println("Multiplication: "+result3);
  }

}

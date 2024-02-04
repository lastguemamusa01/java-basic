package com.javatutorial.java.ExceptionPractices;

public class TestExceptionChild extends ParentWithException { // Parent

  /*
  There are many rules if we talk about method overriding with exception handling.

  Some of the rules are listed below:

  If the superclass method does not declare an exception
    If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
  If the superclass method declares an exception
    If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

   */

  // overriding the method in child class
  // gives compile time error
  void msg() { // IOException throw error because this is checked Exception, for unchecked Exception is ok.
    // when Parent is ArithmeticException and this is Exception this will throw error
    // when Parent is Exception and thiS IS Exception or ArithmenticExcetion this will run fine
    // also when Paren is Exception and this don't throws any Exception this will run fine
    System.out.println("TestExceptionChild");
  }

  public static void main(String[] args) {
    ParentWithException p = new TestExceptionChild();
    try {
      p.msg();
    }catch (Exception e){}

  }


}

class Parent {
  void msg() {
    System.out.println("parent method");
  }
}

class ParentWithException {
  void msg() throws Exception { //ArithmeticException
    System.out.println("parent method");
  }
}

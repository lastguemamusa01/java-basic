package com.javatutorial.java.Java45FeaturesPractices;

public class VarargsExample1 {

  /*
  The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method
  or take an array as the method parameter but it was not considered good because it leads to the maintenance problem.
  If we don't know how many argument we will have to pass in the method, varargs is the better approach.

  varagrs ...

  rules -
  There can be only one variable argument in the method.
  Variable argument (varargs) must be the last argumen

   */


  static void display(String... values) {
    System.out.println("display method invoked");
    for(String s: values) {
      System.out.println(s);
    }
  }

  // void method(String... a, int... b){}//Compile time error
  // void method(int... a, String b){}//Compile time error
  static void validMethod(String b, int... a){  // valid method

  }

  public static void main(String[] args) {

    display(); // zero argument
    display("one argument"); // one argument
    display("my", "name","many elements"); // many arguments
  }


}

package com.javatutorial.java.JavaOOPsMisc;

public class StrictfpExample {

  /*
  Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in t
  he floating-point variable. The precision may differ from platform to platform that is why java programming
  language have provided the strictfp keyword, so that you get same result on every platform. So, now you have
  better control over the floating-point arithmetic

  The strictfp keyword can be applied on methods, classes and interfaces.

  strictfp class A{}//strictfp applied on class

  strictfp interface M{}//strictfp applied on interface

  class A{
    strictfp void m(){}//strictfp applied on method
  }

  The strictfp keyword cannot be applied on abstract methods, variables or constructors.

  class B{
    strictfp abstract void m();//Illegal combination of modifiers
  }

  class B{
    strictfp int data=10;//modifier strictfp not allowed here
  }

  class B{
    strictfp B(){}//modifier strictfp not allowed here
  }

   */

  strictfp static void calculationWithFloat(){
    float x = 3.52353523f;
    float y = 3.6263262f;
    System.out.println(x*y);
  }//strictfp applied on method


  public static void main(String[] args) {
    calculationWithFloat();
  }
}

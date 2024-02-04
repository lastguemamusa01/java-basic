package com.javatutorial.java.JavaPolymorphism;


class Adder {
  static int add(int a, int b) { return a+b;}
  static int add(int a, int b, int c) { return a+b+c;}

  static double add(double a, double b) { return a+b;}

}
public class TestOverloading1 {

  /*
  If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

  There are two ways to overload the method in java

  By changing number of arguments
  By changing the data type

  In java, method overloading is not possible by changing the return type of the method only because of ambiguity.
  static double add(int a,int b){return a+b;}   -> error the parameter is int only changing the return type to double

  Method Overloading and Type Promotion
  One type is promoted to another implicitly if no matching datatype is found.

   byte can be promoted to short, int, long, float or double. The short datatype can be promoted to int, long,
   float or double. The char datatype can be promoted to int,long,float or double and so on.


   If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.

    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    obj.sum(20,20);//now ambiguity

    Output:Compile Time Error


   */

  public static void main(String[] args) {
    System.out.println(Adder.add(2,5));
    System.out.println(Adder.add(5,2,10));
    System.out.println(Adder.add(2.36,4.364));
  }




}

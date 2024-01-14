package com.javatutorial.java.java8.Java45FeaturesPractices;

public class BoxingExample1 {

  /*
  The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and
  opposite operation is known as unboxing. This is the new feature of Java5. So java programmer doesn't need
  to write the conversion code.

  advantage
  No need of conversion between primitives and Wrappers manually so less coding is required

  In method overloading, boxing and unboxing can be performed. There are some rules for method overloading with boxing:
    - Widening beats boxing
    - Widening beats varargs
    - Boxing beats varargs

   */

  static void m(int i){ System.out.println("int"); }
  static void m(Integer i) {System.out.println("Integer"); }

  static void m(Integer... i){System.out.println("varargs");}

  static void m2(Integer i) {System.out.println("Integer"); }

  static void m2(Integer... i) {System.out.println("varargs"); }

  static void m3(Long l) { System.out.println("Long");} //  Widening and Boxing

  public static void main(String[] args) {

    int a = 5;

    Integer integer = new Integer(a); // boxing
    Integer i2 = 10; // boxing

    System.out.println(integer + i2);

    int i3 = i2; // unboxing
    System.out.println(i3);

    short x = 5;
    m(x);  // int -> Widening beats boxing, widening beats varargs

    int a2= 30;
    m2(a2);   // Integer   ->  boxing beats varargs

    int a3=30;
    // m3(a3); // java: incompatible types: int cannot be converted to java.lang.Long  -> overloading with Widening and Boxing -> error

  }

}

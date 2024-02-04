package com.javatutorial.java.JavaBasicPractices;

public class JavaBasicPractices {

  /*
  Java is an object-oriented, class-based, concurrent, secured and general-purpose computer-programming language

  datatypes in java
  Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
  Byte data type -> -128 to 127 -> 8 bits
  short data type -> 2 bytes -> 16 bit -> -(-2^15) to (2^15 -1)
  Non-primitive data types: The non-primitive data types include String, Classes, Interfaces, and Arrays.
  java use unicode

  */
  static int m = 100; // static variable
  int x = 10; // instances variable
  boolean state = true;
  byte bt = 12;  // -128 to 127
  short sh = 253;
  int number = 253532;
  long largeNumber = 10000020L;
  float pointNumber = 2.35f;
  double doubleNumber = 3.25353; // double is more pricise in decimal than float
  char letterA='a';


  public static void main(String[] args) {
    System.out.println("hello java");

    // unary operator
    int x=10;
    int a=10;
    int b=-10;
    boolean c=true;
    System.out.println(x++);//10
    System.out.println(++x);//12
    System.out.println(x--);//12
    System.out.println(--x);//10

    System.out.println(~a);//-11 (minus of total positive value which starts from 0)
    System.out.println(~b);//9 (positive of total minus, positive starts from 0)
    System.out.println(!c);//false (opposite of boolean value)

    // shift operations
    System.out.println(10<<2);//10*2^2=10*4=40
    System.out.println(10<<3);//10*2^3=10*8=80
    System.out.println(20<<2);//20*2^2=20*4=80
    System.out.println(15<<4);//15*2^4=15*16=240

    System.out.println(10>>2);//10/2^2=10/4=2
    System.out.println(20>>2);//20/2^2=20/4=5
    System.out.println(20>>3);//20/2^3=20/8=2

    //For positive number, >> and >>> works same
    System.out.println(20>>2);
    System.out.println(20>>>2);
    //For negative number, >>> changes parity bit (MSB) to 0
    System.out.println(-20>>2); //-20/2^2=-20/4=-5
    System.out.println(-20>>>2);  //   1073741819

    LogicalAndBitwiseOperator();
    ternaryOperator();

  }

  void method() {
    int n = 90; // local variable
    // widening  -> int converted to float
    int a = 10;
    float b = a;
    // narrowing(Typescasting) - float converted to int

    float f = 50.5f;
    int c = (int)f; // 50
  }

  public static void LogicalAndBitwiseOperator() {

    /*
    The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
    The bitwise & operator always checks both conditions whether first condition is true or false.
    The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.
    The bitwise | operator always checks both conditions whether first condition is true or false.

     */
    int a=10;
    int b=5;
    int c=20;
    System.out.println(a<b&&a<c);//false && true = false
    System.out.println(a<b&a<c);//false & true = false
    System.out.println(a>b||a<c);//true || true = true
    System.out.println(a>b|a<c);//true | true = true

  }

  public static void ternaryOperator() {
    /*
    Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming.
    It is the only conditional operator which takes three operands.
     */

    int a = 4;
    int b = 6;
    int c = (a<b)?3:6;
    System.out.println(c);

  }

  public static void assignOperator() {
    int a=10;
    int b=20;
    a+=4; // a = a + 4;
    b-=6;
    System.out.println(a);
    System.out.println(b);

    short aShort=10;
    short bShort=10;
    a=(short)(aShort+bShort);//20 which is int now converted to short . need to converted

  }

}



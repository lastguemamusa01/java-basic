package com.javatutorial.java.Java7FeaturesPractices;

public class BinaryLiteralsExample {

  /*
  Java added a new feature Binary Literal in Java 7. I allows you to express integral types (byte, short, int, and long)
  in binary number system. To specify a binary literal, add the prefix 0b or 0B to the integral value.



   */

  public static void main(String[] args) {

    // binary literal in byte type
    byte b1 = 0b101;
    byte b2 = 0B101;
    // Declaring negative binary
    byte b3 = -0b101;
    // Using underscore in binary literal
    byte b4 = 0b10_1010;
    System.out.println("----------Binary Literal in Byte----------------");
    System.out.println("b1 = "+b1);
    System.out.println("b2 = "+b2);
    System.out.println("b3 = "+b3);
    System.out.println("b4 = "+b4);

    // Binary literal in short type
    short s1 = 0b101;   // Using b0, The b can be lower or upper case
    short s2 = 0B101;   // Using B0
    System.out.println("----------Binary Literal in Short----------------");
    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);

    // Binary literal in int type
    int i1 = 0b101;     // Using b0, The b can be lower or upper case
    int i2 = 0B101;     // Using B0
    System.out.println("----------Binary Literal in Integer----------------");
    System.out.println("i1 = "+i1);
    System.out.println("i2 = "+i2);

    // Binary literal in long type
    long l1 = 0b0000_0111_1110_0001;   // Using b0, The b can be lower or upper case
    long l2 = 0B0000011111100001;   // Using B0
    System.out.println("----------Binary Literal in Long----------------");
    System.out.println("l1 = "+l1);
    System.out.println("l2 = "+l2);
  }


}


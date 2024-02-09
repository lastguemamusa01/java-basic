package com.javatutorial.java.Java9FeaturesPractices;

public class UnderScoreExample {

  /*

  Java 9 Underscore

  In earlier versions of Java, underscore can be used as identifier and to create variable name also. But in Java 9 release, underscore is a keyword and can't be used as an identifier or variable name.

  If we use the underscore character ("_") as an identifier, our source code can no longer be compiled.

  Let's see some examples that explain, how the use of underscore is changed version after after.

  In Java 7, we can use underscore like the following.

  int _ = 10; // creating variable
  System.out.println(_);

  If we compile the same program in Java 8, it will compile but throws a warning message.

  In Java 9, program fails to compile and throws compile time error because now it is a keyword and can't be use as a
  variable name.


   */

  public static void main(String[] args) {
//    int _ = 10;
//    System.out.println(_); // this cause error
  }
}

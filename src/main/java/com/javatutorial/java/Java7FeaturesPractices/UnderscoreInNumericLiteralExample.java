package com.javatutorial.java.Java7FeaturesPractices;

public class UnderscoreInNumericLiteralExample {


  /*

  Java allows you to use underscore in numeric literals. This feature was introduced in Java 7.
  This feature enables you, for example, to separate groups of digits in numeric literals,
  which can improve the readability of your source code

  You cannot use underscore at the beginning or end of a number.
    Ex. int a = _10; // Error, this is an identifier, not a numeric literal
    Ex. int a = 10_; // Error, cannot put underscores at the end of a number
  You cannot use underscore adjacent to a decimal point in a floating point literal.
    Ex. float a = 10._0; // Error, cannot put underscores adjacent to a decimal point
    Ex. float a = 10_.0; // Error, cannot put underscores adjacent to a decimal point
  You cannot use underscore prior to an F or L suffix
    Ex. long a = 10_100_00_L; // Error, cannot put underscores prior to an L suffix
    Ex. float a = 10_100_00_F; // Error, cannot put underscores prior to an F suffix

   */

  public static void main(String[] args) {
    int a = 10_000_000; // underscore used only for readability in the code, not in the print statement
    System.out.println("a " + a);
    // Underscore in hexadecimal literal
    int d = 0x1_1;
    System.out.println("d = "+d);
    // Underscore in octal literal
    int e = 01_1;
    System.out.println("e = "+e);

  }


}

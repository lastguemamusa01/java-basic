package com.javatutorial.java.Java8FeaturesPractices;

import java.util.StringJoiner;
public class StringJoinerExample {

  /*
  Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters
  separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc.
  You can also pass prefix and suffix to the char sequence.

   */

  public static void main(String[] args) {
    StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter
    // adding prefix and suffix
    StringJoiner joinNames2 = new StringJoiner(",","[","]"); // passing comma(,) and square-brackets as delimiter
    // Creating StringJoiner with :(colon) delimiter
    StringJoiner joinNames3 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter

    joinNames.setEmptyValue("it is empty");

    System.out.println(joinNames);

    // adding values to the string joiner
    joinNames.add("min ku");
    joinNames.add("Raju");
    joinNames.add("Peter");
    joinNames.add("Raheem");

    joinNames2.add("min ku");
    joinNames2.add("Raju");

    joinNames3.add("Peter");
    joinNames3.add("Raheem");

    int length = joinNames.length();
    System.out.println("length " + length);

    System.out.println(joinNames);
    System.out.println(joinNames2);

    StringJoiner merge = joinNames2.merge(joinNames3);
    System.out.println(merge);

    // Returns StringJoiner as String type
    String str = joinNames2.toString();
    System.out.println("string " + str);

    char ch = str.charAt(3);
    System.out.println("character at " + ch);

  }

}

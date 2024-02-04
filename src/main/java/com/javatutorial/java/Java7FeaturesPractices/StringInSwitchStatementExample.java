package com.javatutorial.java.Java7FeaturesPractices;

public class StringInSwitchStatementExample {


  /*

   In Java 7, Java allows you to use string objects in the expression of switch statement.
   must be String Object

   */

  public static void main(String[] args) {
    String game = "Hockey";

    switch(game) {
      case "Hockey":
        System.out.println("let's play hockey"); break;
      case "Football": case "American Football":
        System.out.println("let's play football and american football"); break;
      case "Baseball":
        System.out.println("let's play baseball"); break;
      default:
        System.out.println("Unknown game");
    }

  }
}

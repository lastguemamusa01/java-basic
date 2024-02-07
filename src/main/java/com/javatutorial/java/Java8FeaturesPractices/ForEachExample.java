package com.javatutorial.java.Java8FeaturesPractices;

import java.util.*;
public class ForEachExample {

  /*
  Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interface.
  It is a default method defined in the Iterable interface. Collection classes which extends Iterable interface
  can use forEach loop to iterate elements

  This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.

  Along with forEach() method, Java provides one more method forEachOrdered().
  It is used to iterate elements in the order specified by the stream.



   */

  public static void main(String[] args) {
    List<String> gamesList = new ArrayList<String>();
    gamesList.add("Football");
    gamesList.add("Cricket");
    gamesList.add("Chess");
    gamesList.add("Hocky");
    System.out.println("------------Iterating by passing lambda expression--------------");
    gamesList.forEach(games -> System.out.println(games));
    System.out.println("------------Iterating by passing method reference---------------");
    gamesList.forEach(System.out::println);
    System.out.println("------------Iterating by passing lambda expression---------------");
    gamesList.stream().forEachOrdered(games -> System.out.println(games));
    System.out.println("------------Iterating by passing method reference---------------");
    gamesList.stream().forEachOrdered(System.out::println);


  }

}

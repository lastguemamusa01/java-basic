package com.javatutorial.java.Java9FeaturesPractices;

import java.util.*;
public class FactoryMethodsExample {

  /*

  Java 9 Collection library includes static factory methods for List, Set and Map interface. These methods are useful
  to create small number of collection.

  old way :

  List<String> list = new ArrayList<>();
  list.add("Java");
  list.add("JavaFX");
  list.add("Spring");
  list.add("Hibernate");
  list.add("JSP");

  In the above code, add method is called repeatedly for each list element, while in Java 9 we can do it in single
  line of code using factory methods.

  Factory methods are special type of static methods that are used to create unmodifiable instances of collections.
  It means we can use these methods to create list, set and map of small number of elements.

  It is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException

  In Java 9, apart from static Map.of() methods, Map interface includes one more static method Map.ofEntries().
  This method is used to create a map of Map.Entry instances.



   */

  public static void main(String[] args) {
    List<String> list = List.of("java","javafx","spring boot");
    Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
    Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");
    for(String word: list) {
      System.out.println(word);
    }

    System.out.println();

    for(String word: set) {
      System.out.println(word);
    }

    System.out.println();

    for(Map.Entry<Integer, String> m: map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    // Creating Map Entry
    Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
    Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
    // Creating Map using map entries
    Map<Integer, String> map2 = Map.ofEntries(e1,e2);

    System.out.println();

    for(Map.Entry<Integer, String> m: map2.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

  }



}

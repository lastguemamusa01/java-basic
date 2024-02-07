package com.javatutorial.java.Java8FeaturesPractices;

import java.util.*;

class GenericClass<X> {
  X name;
  public void setName(X name) {
      this.name = name;
  }

  public X getName() {
    return name;
  }

  public String genericMethod(GenericClass<String> x) {
    x.setName("Min");
    return x.name;
  }

}


public class TypeInferenceExample {

  /*
  Type inference is a feature of Java which provides ability to compiler to look at each method invocation and
  corresponding declaration to determine the type of arguments

  In Java 8, you can call specialized method without explicitly mentioning of type of arguments.

  showList(new ArrayList<>());

   */

  public static void showList(List<Integer> list) {
    if(!list.isEmpty()) {
      list.forEach(System.out::println);
    }else {
      System.out.println("list is empty");
    }
  }

  public static void main(String[] args) {
    // An old approach(prior to Java 7) to create a list
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(4);
    showList(list1);
    // Java 7 -> <> diamond operator
    List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
    list2.add(6);
    showList(list2);
    // compiler infers type of arrayList, in java8
    showList(new ArrayList<>());

    GenericClass<String> genericClass = new GenericClass<String>();
    genericClass.setName("Peter");
    System.out.println(genericClass.getName());

    GenericClass<String> genericClass2 = new GenericClass<>();
    genericClass2.setName("peter");
    System.out.println(genericClass2.getName());

    // new improved type inference
    System.out.println(genericClass2.genericMethod(new GenericClass<>()));


  }

}

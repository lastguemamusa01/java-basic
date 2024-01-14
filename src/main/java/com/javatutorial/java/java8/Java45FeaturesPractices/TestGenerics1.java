package com.javatutorial.java.java8.Java45FeaturesPractices;

import java.util.ArrayList;

// generic class

class MyGen<T> {
  T obj;

  void add(T obj) {
    this.obj = obj;
  }

  T get() {
    return obj;
  }

}

public class TestGenerics1 {

  /*
  The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by
  detecting the bugs at compile time.

  Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the
  java programmer to store a specific type of objects.

  Type-safety: We can hold only a single type of objects in generics. It doesn?t allow to store other objects.

  Type casting is not required: There is no need to typecast the object.

    List list = new ArrayList();
    list.add("hello");
    String s = (String) list.get(0);//typecasting

  Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
  The good programming strategy says it is far better to handle the problem at compile time than runtime.

  Syntax of generic -> ClassOrInterface<Type> -> ArrayList<String>

  A class that can refer to any type is known as a generic class. Here, we are using the T type parameter
  to create the generic class of specific type.

  The T type indicates that it can refer to any type (like String, Integer, and Employee). The type you
  specify for the class will be used to store and retrieve the data.

  The type parameters naming conventions are important to learn generics thoroughly.
  The common type parameters are as follows:

  T - Type
  E - Element
  K - Key
  N - Number
  V - Value

  Generic method - Like the generic class, we can create a generic method that can accept any type of arguments.
  Here, the scope of arguments is limited to the method where it is declared. It allows static as well
  as non-static methods.

   */

  public static <E> void printArray(E[] elements) {
    for(E element: elements) {
      System.out.println(element);
    }
    System.out.println();
  }
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("raul");
    list.add("samuel");

    String s = list.get(0); // type casting is not required
    System.out.println(s);

    for(String word: list) {
      System.out.println(word);
    }

    MyGen<Integer> generic = new MyGen<Integer>();

    generic.add(12);

    System.out.println(generic.get());

    Integer[] intArray = {1,254,5,3,9,10};

    Character[] charArray = {'e','t','o','t','p'};

    System.out.println("printing int array");
    printArray(intArray);

    System.out.println("printing vocal array");
    printArray(charArray);

  }


}

package com.javatutorial.java.Java8FeaturesPractices;

import java.util.*;

interface Drawable {
  public void draw();
}

@FunctionalInterface // optional
interface DrawableLambda {
  public void draw();
}

interface Sayable {
  public String say();
}
interface SayableName {
  public String sayName(String name);
}

interface Addable {
  public int add(int x, int y);
}

public class LambdaExpressionExample {

  /*

  Lambda expression is a new and important feature of Java which was included in Java SE 8.
  It provides a clear and concise way to represent one method interface using an expression.
  It is very useful in collection library. It helps to iterate, filter and extract data from collection.

  The Lambda expression is used to provide the implementation of an interface which has functional interface.
  It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
  the implementation. Here, we just write the implementation code.

  Java lambda expression is treated as a function, so compiler does not create .class file.

  Lambda expression provides implementation of functional interface. An interface which has only one abstract
  method is called functional interface. Java provides an anotation @FunctionalInterface, which is used to
  declare an interface as functional interface.

  why use lambda expression

  To provide the implementation of Functional interface.
  Less coding.

  (argument-list) -> {body}

  1) Argument-list: It can be empty or non-empty as well.

  2) Arrow-token: It is used to link arguments-list and body of expression.

  3) Body: It contains expressions and statements for lambda expression.

  In Java lambda expression, if there is only one statement, you may or may not use return keyword.
  You must use return keyword when lambda expression contains multiple statements.

  You can use lambda expression to run thread.

  Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, filter and fetch data.

  Java Lambda Expression is used in Event Listener in java swing

   */

  public static void main(String[] args) {
    int width = 10;

    // no lambda, anonymous class

    Drawable d = new Drawable() {
      @Override
      public void draw() { System.out.println("draw " + width); }
    };

    d.draw();

    // with lambda
    DrawableLambda d2 = () -> {
      System.out.println( "draw lambda " + width);
    };

    d2.draw();

    Sayable s = () -> {
      return "hi";
    };

    System.out.println(s.say());

    SayableName sName = (name) -> {  // // You can omit function parentheses    ->  SayableName sName = name -> {
      return "hi " + name;
    };

    System.out.println(sName.sayName("min ku"));

    Addable sum = (num1, num2) -> {
      return (num1+num2);
    };

    Addable sum2 = (num1, num2) -> (num1+num2); // without parenthesys use () and omit return

    System.out.println("sum result " + sum.add(10,30));
    System.out.println("sum2 reuslt " + sum2.add(4,6));

    List<String> list=new ArrayList<>();
    list.add("ankit");
    list.add("mayank");
    list.add("irfan");
    list.add("jai");

    list.forEach(
      (n) -> System.out.println(n)  // { in here we use ; }, in ( we cannot use ; )
    );

    // multiple statement, return is mandatory
    SayableName person = (name) -> {
      String greeting = "hello buddy ";
      String greetingName = greeting + name;
      return greetingName;
    };

    System.out.println(person.sayName("min ju"));


  }

}

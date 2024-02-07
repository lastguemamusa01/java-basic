package com.javatutorial.java.Java8FeaturesPractices;

interface Sayable2 {
  void say();
}

interface Messageable {
  Message getMessage(String msg);
}

class Message {
 Message(String msg) {
   System.out.println(msg);
 }
}

public class MethodReference {

  /*

  Java provides a new feature called method reference in Java 8. Method reference is used to refer method of
  functional interface. It is compact and easy form of lambda expression. Each time when you are using
  lambda expression to just referring a method, you can replace your lambda expression with method reference

  There are following types of method references in java:

  Reference to a static method.
  Reference to an instance method.
  Reference to a constructor.

   we are using predefined functional interface Runnable to refer static method.

   You can also override static methods by referring methods. we have defined and overloaded three add methods.

   like static methods, you can refer instance methods also

   You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.

   */

  // static method
  public static void saySomething() {
    System.out.println("hello, this is static method");
  }

  public static void threadStatus() {
    System.out.println("thread is running");
  }

  public void sayObject() {
    System.out.println("hello, this is non-static method");
  }

  public static void main(String[] args) {

    // referring static method, instead of lambda , we are suing method referece to static method
    Sayable2 sayable = MethodReference::saySomething;

    sayable.say();  //  hello, this is static method

    Thread t = new Thread(MethodReference::threadStatus);
    t.start();

    MethodReference obj1 = new MethodReference();
    Sayable2 sayable1 = obj1::sayObject;

    sayable1.say();

    Sayable2 sayable2 = new MethodReference()::sayObject; // anonymous object

    sayable2.say();

    Messageable hello = Message::new;
    hello.getMessage("greetings");




  }

}

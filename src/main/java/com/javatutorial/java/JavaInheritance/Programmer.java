package com.javatutorial.java.JavaInheritance;

class Employee {
  float salary=40000;
}

public class Programmer extends Employee {

  /*
  Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

  The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
  When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover,
  you can add new methods and fields in your current class also.

  Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

  inheritance -> method overriding so runtime polymorphism can be achieved and for code reusability

  Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
  Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
  Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.
  Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of
  the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.

  Types of inheritance in java
  On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.

  In java programming, multiple and hybrid inheritance is supported through interface only. We will learn about interfaces later.
  When one class inherits multiple classes, it is known as multiple inheritance.

  When a class inherits another class, it is known as a single inheritance. In the example given below,
  Dog class inherits the Animal class, so there is the single inheritance.

  When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below,
  BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.

  When two or more classes inherits a single class, it is known as hierarchical inheritance

  To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

  Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes
  have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

  Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes.
  So whether you have same method or different, there will be compile time error.

   */

  int bonus=10000;

  public static void main(String[] args) {
    Programmer p = new Programmer();
    System.out.println("programmer salary " + p.salary);
    System.out.println("prgrammer bonus " + p.bonus);
  }

}

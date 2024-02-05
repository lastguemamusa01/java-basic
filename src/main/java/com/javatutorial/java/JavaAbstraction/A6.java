package com.javatutorial.java.JavaAbstraction;

// a marker or tagged interface
interface Feasible {
}

interface Printable {
  void print();

  // nested interface
  interface MessagePrintable {
    void msg();
  }
}

interface Showable {
  void show();
}

interface Readable extends Printable, Showable {  // multiple inheritance with interfaces extends
  void read();
}

interface Drawable {
  void draw();
  // java 8 default method
  default void msg() { System.out.println("default method"); }

  // java 8 static method in interface
  static int cube(int x) { return x*x*x; }
}

class Rectangle implements Drawable {
  @Override
  public void draw() { System.out.println("draw Rectangle"); }
}

class Circle implements Drawable {
  @Override
  public void draw() { System.out.println("draw Circle"); }
}

class Output implements Readable {

  @Override
  public void print() {
    System.out.println("print");
  }

  @Override
  public void show() {
    System.out.println("show");
  }

  @Override
  public void read() {
    System.out.println("read");
  }
}

public class A6 implements Printable, Showable {

  /*
  An interface in Java is a blueprint of a class. It has static constants and abstract methods.

  The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the
  Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

  Java Interface also represents the IS-A relationship.

  It cannot be instantiated just like the abstract class.

  Since Java 8, we can have default and static methods in an interface.

  Since Java 9, we can have private methods in an interface.

  It is used to achieve abstraction.
  By interface, we can support the functionality of multiple inheritance.
  It can be used to achieve loose coupling.

  An interface is declared by using the interface keyword. It provides total abstraction; means all the methods
  in an interface are declared with the empty body, and all the fields are public, static and final by default.
  A class that implements an interface must implement all the methods declared in the interface.

  interface extends another interface, but a class implements an interface

  If a class implements multiple interfaces, or an interface extends multiple interfaces,
  it is known as multiple inheritance.

  multiple inheritance is not supported in the case of class because of ambiguity. However,
  it is supported in case of an interface because there is no ambiguity. It is because its implementation
  is provided by the implementation class.

  interface Printable{
    void print();
  }

  interface Showable{
    void print();
  }

  class TestInterface3 implements Printable, Showable{
    public void print(){ System.out.println("Hello"); }
    public static void main(String args[]){
      TestInterface3 obj = new TestInterface3();
      obj.print();
    }
  }

  Since Java 8, we can have method body in interface. But we need to make it default method.

  Since Java 8, we can have static method in interface.

  An interface which has no member is known as a marker or tagged interface, for example, Serializable,
  Cloneable, Remote, etc. They are used to provide some essential information to the JVM so that JVM may perform some useful operation

  public interface Serializable{
  }

  An interface can have another interface which is known as a nested interface

  Simply, abstract class achieves partial abstraction (0 to 100%) whereas interface achieves fully abstraction (100%).


   */

  @Override
  public void print() { System.out.println("A6"); }

  @Override
  public void show() { System.out.println("tada"); }

  public static void main(String[] args) {
    A6 obj = new A6();
    obj.print();
    obj.show();

    Drawable circle = new Circle();
    circle.draw();
    circle.msg();
    System.out.println(Drawable.cube(4));

    Output out = new Output();
    out.print();
    out.show();
    out.read();


  }



}

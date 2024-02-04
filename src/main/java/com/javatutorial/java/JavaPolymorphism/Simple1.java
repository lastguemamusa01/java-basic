package com.javatutorial.java.JavaPolymorphism;


class Animal3{}
public class Simple1 extends Animal3 {

  /*

  The java instanceof operator is used to test whether the object is an instance of the specified type
  (class or subclass or interface).

  The instanceof in java is also known as type comparison operator because it compares the instance with type.
  It returns either true or false. If we apply the instanceof operator with any variable that has null value,
  it returns false.

  instanceof is operator, not method

  An object of subclass type is also a type of parent class. For example, if Dog extends Animal then object
  of Dog can be referred by either Dog or Animal class.

  Downcasting with java instanceof operator

  When Subclass type refers to the object of Parent class, it is known as downcasting.
  If we perform it directly, compiler gives Compilation error. If you perform it by typecasting,
  ClassCastException is thrown at runtime. But if we use instanceof operator, downcasting is possible.

  Downcasting can also be performed without the use of instanceof operator

   */


  // downcasting method

  static void method(Animal3 a) {

    if(a instanceof Simple1) { // this is not mandatory
      Simple1 d = (Simple1) a; // downcasting
      System.out.println("downcasting performed");
    }
  }

  static void methodWithoutDownCasting(Animal3 a) {

      Simple1 d = (Simple1) a; // downcasting
      System.out.println("downcasting performed");

  }

  public static void main(String[] args) {
    Simple1 s = new Simple1();
    System.out.println(s instanceof Simple1); //true
    System.out.println(s instanceof Animal3); //true

    Simple1 s2 = null;
    System.out.println(s2 instanceof Simple1); //false

    // Simple1 s3 = new Animal3(); // downcasting - compilation error
    //Simple1 s4 = (Simple1) new Animal3(); // Compiles successfully but ClassCastException is thrown at runtime - typescasting

    Animal3 a = new Simple1();
    Simple1.method(a);
    Simple1.methodWithoutDownCasting(a);

    Animal3 b = new Animal3();
    // Simple1.methodWithoutDownCasting(b); // this throw error because the b is Animal3


  }

}

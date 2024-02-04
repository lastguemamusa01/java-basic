package com.javatutorial.java.JavaPolymorphism;

class Bike {

  // final method
  final void run() { System.out.println("running"); }
}

final class FinalBike{}
public class Bike9 extends Bike {  // extends FinalBike -> cannont extend it, FinalBike is final class

  /*
  The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

    variable
    method
    class

  The final keyword can be applied with the variables, a final variable that have no value it is called blank final
  variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable
  can be static also which will be initialized in the static block only.

  If you make any variable as final, you cannot change the value of final variable(It will be constant).

  If you make any method as final, you cannot override it.

  If you make any class as final, you cannot extend it.

   final method is inherited but you cannot override it.

   A final variable that is not initialized at the time of declaration is known as blank final variable.

  If you want to create a variable that is initialized at the time of creating object and once initialized may
  not be changed, it is useful. For example PAN CARD number of an employee.

  It can be initialized only in constructor.

  static blank final variable
  A static final variable that is not initialized at the time of declaration is known as static blank final variable.
  It can be initialized only in static block.

  If you declare any parameter as final, you cannot change the value of it.

  Constructor cannot be final, because constructor is never inherited.

   */

  final int speedLimit = 90; // final variable
//  void run() { // compile error, run method is final, cannot be overrided
//    System.out.println("running safely with 100kmph");
//    // speedLimit=400; // compile time rror
//  }

  final int blanckFinalVariable; // ;//blank final variable

  static final int data; // static blank final variable

  Bike9() {
    blanckFinalVariable=40;
    System.out.println(blanckFinalVariable);
  }

  static {
    data=50;
  }

  int cube(final int n) {
    // n = n+2; // can't be changed as n is final - compile error
    return n*n*n;
  }

  public static void main(String[] args) {
    Bike9 bike = new Bike9();
    bike.run();
    System.out.println(Bike9.data);
    System.out.println(bike.cube(6));
  }
}

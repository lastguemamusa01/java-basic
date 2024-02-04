package com.javatutorial.java.JavaInheritance;

class Operation {
  int square(int n) {
    return n*n;
  }
}

public class Circle {

  /*

  If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

  Consider a situation, Employee object contains many informations such as id, name, emailId etc.
  It contains one more object named address, which contains its own informations such as city, state,
  country, zipcode etc. as given below.

  In such case, Employee has an entity reference address, so relationship is Employee HAS-A address.

  Aggregation - for code reusability

  when use aggregation ?

   Code reuse is also best achieved by aggregation when there is no is-a relationship.
   Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects
   involved; otherwise, aggregation is the best choice


   */

  Operation op; // Aggregation

  double pi = 3.14;


  double area(int radius) {
    op = new Operation();
    int rSqaure = op.square(radius);
    return pi*rSqaure;
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    double result = c.area(5);
    System.out.print(result);
  }


}

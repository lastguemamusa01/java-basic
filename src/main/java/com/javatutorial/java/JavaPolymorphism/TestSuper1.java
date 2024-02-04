package com.javatutorial.java.JavaPolymorphism;


class Person{
  int id;
  String name;
  Person(int id,String name){
    this.id=id;
    this.name=name;
  }
}

class Emp extends Person {
  float salary;
  Emp(int id, String name, float salary) {
    super(id, name);
    this.salary = salary;
  }

  void display() { System.out.println(id+" "+name+" "+salary); }
}
class Animal {

  Animal() { System.out.println("animal is created"); }
  String color="white";

  void eat() { System.out.println("animal eating"); }
}

class Dog extends Animal {

  Dog() {
    // super(); // this is provided implicitly if we removed it
    System.out.println("dog is created");
  }

  String color="black";

  void printColor() {
    System.out.println(color); // print color of Dog
    System.out.println(super.color); // print color of parent class Animal
  }

  void eat() { System.out.println("animal eating bread"); }
  void bark() { System.out.println("war war"); }

  void work() {
    super.eat();
    bark();
  }


}
public class TestSuper1 {

  /*

  The super keyword in Java is a reference variable which is used to refer immediate parent class object.

  Whenever you create the instance of subclass, an instance of parent class is created implicitly which is
  referred by super reference variable.

  super can be used to refer immediate parent class instance variable.
  super can be used to invoke immediate parent class method.
  super() can be used to invoke immediate parent class constructor.

   */

  public static void main(String[] args) {
    Dog d = new Dog();
    d.printColor();
    d.work();

    Emp emp1 = new Emp(1,"aniki", 35623f);
    emp1.display();

  }



}

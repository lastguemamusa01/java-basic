package com.javatutorial.java.JavaOOPPractices;

class StudentStatic {
  int rollno;//instance variable
  String name;
  static String college="ITESM";//static variable
  //constructor
  StudentStatic(int r, String n){
    rollno = r;
    name = n;
  }

  static void change() {
    college="Anahuac";
  }


  //method to display the values
  void display (){System.out.println(rollno+" "+name+" "+college);}
}

class Counter {
  static int count=0; // static variable

  Counter() {
    count++;
    System.out.println(count);
  }
}

class Calculate {
  static int cube(int x) {
    return x*x*x;
  }
}

public class TestStaticVariable {
  /*
  The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods,
  blocks and nested classes. The static keyword belongs to the class than an instance of the class.

  static can be :
  Variable (also known as a class variable)
  Method (also known as a class method)
  Block
  Nested class

  The static variable can be used to refer to the common property of all objects (which is not unique for each object),
  for example, the company name of employees, college name of students, etc.

  The static variable gets memory only once in the class area at the time of class loading.

  Advantages of static variable
  It makes your program memory efficient (i.e., it saves memory).

  If you apply static keyword with any method, it is known as static method.

  A static method belongs to the class rather than the object of a class.
  A static method can be invoked without the need for creating an instance of a class.
  A static method can access static data member and can change the value of it.

  2 main restrictions in static method

  The static method can not use non static data member or call non-static method directly.
  this and super cannot be used in static context.

  Java static block

  Is used to initialize the static data member.
  It is executed before the main method at the time of classloading.

   */

  // static block
  static {System.out.println("static block is invoked");}

  public static void main(String[] args) {
    StudentStatic s1 = new StudentStatic(111,"Karan");
    StudentStatic s2 = new StudentStatic(222,"Aryan");
    s1.display();
    s2.display();
    StudentStatic.change();
    s1.display();
    s2.display();

    Counter cnt1 = new Counter();
    Counter cnt2 = new Counter();
    Counter cnt3 = new Counter();

    int result = Calculate.cube(4);
    System.out.println(result);
  }


}

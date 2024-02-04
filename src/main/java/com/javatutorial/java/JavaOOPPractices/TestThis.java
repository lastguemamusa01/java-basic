package com.javatutorial.java.JavaOOPPractices;

class StudentThis{
  int rollno;
  String name, course;
  float fee;

  // here we use this - this: to refer current class instance variable
  StudentThis(int rollno,String name,float fee){
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
  }

  StudentThis(int rollno,String name,float fee, String course) {
    // overloading constructor  - this() : to invoke current class constructor
    this(rollno, name, fee); //reusing constructor
    this.course = course;
  }
  void display(){System.out.println(rollno+" "+name+" "+fee);}

  void m() {
    // this: to invoke current class method
    this.display();
  }
}

class A {
  A() {
    System.out.println("A");
  }
  A(int x) {
    // this() : to invoke current class constructor
    // It is used to reuse the constructor. In other words, it is used for constructor chaining.
    this();
    System.out.println(x);
  }
}

class S2 {
  void m(S2 obj) {
    System.out.println("method is invoked");
  }

  void p() {
    // this: to pass as an argument in the method
    // this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
    m(this);
  }
}

class B {
  TestThis obj;
  B(TestThis obj) {
    this.obj = obj;
  }

  void display() {
    System.out.println(obj.data); // using data member of A4 class
  }
}

class A2 {
  A2 getA() {
    return this; //  this keyword can be used to return current class instance
  }

  void msg() {
    System.out.println("hello java");
  }
}

public class TestThis {

  /*
  There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.

  Here is given the 6 usage of java this keyword.

  this can be used to refer current class instance variable.
  this can be used to invoke current class method (implicitly)
  this() can be used to invoke current class constructor.
  this can be passed as an argument in the method call.
  this can be passed as argument in the constructor call.
  this can be used to return the current class instance from the method.

   */

  int data = 10;
  TestThis() {
    B b = new B(this); //  this: to pass as argument in the constructor call
    b.display();
  }

  public static void main(String[] args) {
    StudentThis s1=new StudentThis(111,"ankit",5000f);
    StudentThis s2=new StudentThis(112,"sumit",6000f);
    s1.display();
    s2.display();
    s1.m();

    A a = new A(12);

    S2 s3 = new S2();
    s3.p();

    TestThis a2 = new TestThis();  // 10

    new A2().getA().msg();

  }

}

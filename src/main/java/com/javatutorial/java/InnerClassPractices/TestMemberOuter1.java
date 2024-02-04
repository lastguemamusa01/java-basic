package com.javatutorial.java.InnerClassPractices;

public class TestMemberOuter1 {

  /*
  Java inner class or nested class is a class that is declared inside the class or interface.
  We use inner classes to logically group classes and interfaces in one place to be more readable and maintainable.

  advantages of java inner class

  - Nested classes represent a particular type of relationship that is it can access all the members
  (data members and methods) of the outer class, including private.
  - Nested classes are used to develop more readable and maintainable code because it logically group
  classes and interfaces in one place only.
  - Code Optimization: It requires less code to write.


  Sometimes users need to program a class in such a way so that no other class can access it. Therefore,
  it would be better if you include it within other classes.

  If all the class objects are a part of the outer object then it is easier to nest that class inside the outer
 class. That way all the outer class can access all the objects of the inner class.

   An inner class is a part of a nested class.
   Non-static nested classes are known as inner classes.

   There are two types of nested classes non-static and static nested classes.
   The non-static nested classes are also known as inner classes.

   - Non-static nested class (inner class)
      - Member inner class - A non-static class that is created inside a class but outside a method is called
         member inner class. It is also known as a regular inner class. It can be declared with access modifiers
         like public, default, private, and protected.
      - Anonymous inner class - A class created for implementing an interface or extending class. The java compiler decides its name.
      - Local inner class - A class was created within the method.

  - Static nested class - A static class was created within the class.

   - Nested Interface - 	An interface created within class or interface.

  The java compiler creates two class files in the case of the inner class. The class file name of the inner class
  is "Outer$Inner". If you want to instantiate the inner class, you must have to create the instance of the outer class.
  In such a case, an instance of inner class is created inside the instance of the outer class.


   */

  private int data = 30;

  class Inner {
    void msg() { System.out.println(data);}
  }


  public static void main(String[] args) {
    TestMemberOuter1 obj = new TestMemberOuter1();
    TestMemberOuter1.Inner in = obj.new Inner();
    in.msg();
  }

}

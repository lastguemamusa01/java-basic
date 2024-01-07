package com.javatutorial.java.java8.ReflectionPractices;


public class ReflectionPractices {

  /*
  Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
   */

  void printName(Object obj) {
    Class c = obj.getClass();
    System.out.println(c.getName());
  }

  public static void main(String[] args) {

    Simple s = new Simple();
    ReflectionPractices r = new ReflectionPractices();
    r.printName(s);

    Class c2 = ReflectionPractices.class;
    System.out.println(c2.getName());

  }


}

class Simple{}
interface My{}

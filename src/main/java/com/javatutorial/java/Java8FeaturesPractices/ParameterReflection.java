package com.javatutorial.java.Java8FeaturesPractices;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Calculate {
  int add(int a, int b){
    return (a+b);
  }
  int mul(int a, int b){
    return (b*a);
  }
}
public class ParameterReflection {

  /*
  Java provides a new feature in which you can get the names of formal parameters of any method or constructor. T
  he java.lang.reflect package contains all the required classes like Method and Parameter to work with parameter
   reflection.

   */

  public static void main(String[] args) {

    // Creating object of a class
    Calculate calculate = new Calculate();
    // instantiating Class class
    Class cls = calculate.getClass();
    // Getting declared methods inside the Calculate class
    Method[] method = cls.getDeclaredMethods(); // It returns array of methods
    // Iterating method array
    for (Method method2 : method) {
      System.out.print(method2.getName());    // getting name of method
      // Getting parameters of each method
      Parameter parameter[] = method2.getParameters(); // It returns array of parameters
      // Iterating parameter array
      for (Parameter parameter2 : parameter) {
        System.out.print(" "+parameter2.getParameterizedType()); // returns type of parameter
        System.out.print(" "+parameter2.getName()); // returns parameter name
      }
      System.out.println();
    }

  }

}

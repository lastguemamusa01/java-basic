package com.javatutorial.java.JavaOOPsMisc;

public class RecursionExample1 {

  /*
  Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is
  called recursive method.

  It makes the code compact but complex to understand.

   */

  static int count = 0;
  static void p() {
    count++;
    if(count <= 5) {
      System.out.println("hello" + count);
      p();
    }
  }
  static int factorial(int n){
    if (n == 1)
      return 1;
    else
      return(n * factorial(n-1));
  }


  public static void main(String[] args) {
    p();
    System.out.println();
    System.out.println("factorial " +factorial(5));
  }

}

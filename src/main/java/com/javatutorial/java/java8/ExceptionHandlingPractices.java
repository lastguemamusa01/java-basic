package com.javatutorial.java.java8;

public class ExceptionHandlingPractices {

  /*
  The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow
  of the application can be maintained.

  There are mainly 3 types of exceptions: checked, unchecked and An error


  checked exception - The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions.
  For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

  unchecked exception - The classes that inherit the RuntimeException are known as unchecked exceptions. For example,
  ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked
  at compile-time, but they are checked at runtime.

  Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

   */
  public static void main(String[] args) {

    try {
      int x = 100/0;
    } catch(ArithmeticException e) {
      System.out.println(e);
    }

    System.out.println("rest of the code");

    try {
      String s = null;
      int length = s.length(); // null pointer excepction
    }catch(NullPointerException e) {
      System.out.println(e);
    }

    try {
      String noun = "Egypt";
      int number = Integer.parseInt(noun);
    }catch( NumberFormatException e) {
      System.out.println(e);
    }

    try {
      int a[] = new int[5];
      a[10] = 50;
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }


  }



}

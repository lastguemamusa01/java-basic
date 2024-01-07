package com.javatutorial.java.java8.ExceptionPractices;

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

    //declaring final variable
    final int age = 18;

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

    try {
      int divisionByZERO = 10/0;

    } catch(Exception e) {
      // System.out.println(e);
      // Custom meessage
      System.out.println("can't divided by zero");
    }

    try {
      int a[] = new int[5];
      a[5]=30/0;
      a[10]= 5;
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("ArraIndexOutOfBounds Exception occurs");
    } catch(ArithmeticException e) {
      System.out.println("ArithmeticException Exception occurs");
    } catch(Exception e) {
      System.out.println("Parent Exception occurs");
    }

    System.out.println("rest of the code");

    // nested try

    try {

      try {
        int a = 10/0;
      }catch(ArithmeticException e) {
        System.out.println(e);
      }

      try {
       int array[] = new int[5];
       array[10] = 5;
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
      }

      // another statetment

    }catch(Exception e) {
      System.out.println(e);
    }

    System.out.println("rest of the code");

    // outer (main) try block
    try {

      //inner try block 1
      try {

        // inner try block 2
        try {
          int arr[] = { 1, 2, 3, 4 };

          //printing the array element out of its bounds
          System.out.println(arr[10]);
        } catch (ArithmeticException e) {
          System.out.println("Arithmetic exception");
          System.out.println(" inner try block 2");
        }
      } catch (ArithmeticException e) {
        System.out.println("Arithmetic exception");
        System.out.println("inner try block 1");
      }
    } catch (ArrayIndexOutOfBoundsException e4) {
      System.out.print(e4);
      System.out.println(" outer (main) try block");
    } catch (Exception e5) {
      System.out.print("Exception");
      System.out.println(" handled in main try-block");
    }


    try {
      int divisionByZero = 10/0;
    } catch(ArithmeticException e) {
      System.out.println(e);
    } finally {
      System.out.println("finally block will be executed no matter if there is a excepction or not");
    }

    /*
    In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead
    of runtime and we can create custom exceptions making the code recovery and debugging easier.

    The Java throw keyword is used to throw an exception explicitly.

    */


  validation(13);
  System.out.println("rest of the code");

  try {
    throw new CustomException("this is custom exception message");
  } catch (CustomException e) {
    System.out.println(e.getMessage());
  }

  /*
  The Java throws keyword is used to declare an exception. It gives an information to the programmer that there
  may occur an exception. So, it is better for the programmer to provide the exception handling code so that
  the normal flow of the program can be maintained.

  Checked exception only,

  */

  ExceptionHandlingPractices testExceptionPropagationObj = new ExceptionHandlingPractices();
  testExceptionPropagationObj.p();
  System.out.println("normal flow code");

  /*
  The throw and throws is the concept of exception handling where the throw keyword throw the exception explicitly
  from a method or a block of code whereas the throws keyword is used in signature of the method.

  Type of exception Using throw keyword, we can only propagate
  the throws keyword can be used to propagate checked exceptions only.


  The final, finally, and finalize are keywords in Java that are used in exception handling. Each of these
  keywords has a different functionality. The basic difference between final, finally and finalize is that the
  final is an access modifier, finally is the block in Exception Handling and finalize is the method of object class.

  final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.
  finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.
  finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.

   */

    ExceptionHandlingPractices finalizeExampleObj = new ExceptionHandlingPractices();

    // printing the hashcode
    System.out.println("Hashcode is: " + finalizeExampleObj.hashCode());
    finalizeExampleObj = null;
    // calling the garbage collector using gc()
    System.gc();
    System.out.println("End of the garbate collection");

  }
  protected void finalize() {
    System.out.println("Called the finalized() method");
  }

  public static void validation(int age) {
    try {
      if(age < 18) throw new ArithmeticException("person in not eligible to vote");
      else System.out.println("you can vote");
    } catch (ArithmeticException e) {
        System.out.println(e);
    }
  }


  void m() throws ArithmeticException {
    throw new ArithmeticException("customer arithmetic exception");
  }

  void n() throws ArithmeticException {
    m();
  }

  void p() {
    try {
      n();
    }catch (Exception e) {
      System.out.println("exception handler");
    }
  }

}


package com.javatutorial.java.java8.JavaBasicPractices;

import java.io.*;

/**
 * <h2> Calculation of numbers </h2>
 * This program implements an application
 * to perform operation such as addition of numbers
 * and print the result
 * <p>
 * <b>Note:</b> Comments make the code readable and
 * easy to understand.
 *
 * @author min ku nam
 * @version 16.0
 * @since 2024-01-25
 */

public class JavaComments {

  /*
  The Java comments are the statements in a program that are not executed by the compiler and interpreter.

  Comments are used to make the program more readable by adding the details of the code.
  It makes easy to maintain the code and to find the errors easily.
  The comments can be used to provide information or explanation about the variable, method, class, or any statement.
  It can also be used to prevent the execution of program code while testing the alternative code.

  There are three types of comments in Java.

  Single Line Comment  The single-line comment is used to comment only one line of the code. It is the widely used
  and easiest way of commenting the statements.

  Multi Line Comment  The multi-line comment is used to comment multiple lines of code. It can be used to explain
  a complex code snippet or to comment multiple lines of code at a time (as it will be difficult to use single-line
  comments there).

  Documentation Comment    Documentation comments are usually used to write large programs for a project or software
  application as it helps to create documentation API. These APIs are needed for reference,
  i.e., which classes, methods, arguments, etc., are used in the code.

  javadoc tool required for documentation comment

  use in terminal : javadoc JavaComments.java  to generate java documentation
   */


  // single line comment
  int i=10; // i is a variable with value 10

  /*
  This
  is
  multi line
  comment
  */

  /**
   * This is the main method uses of sum() method.
   * @param args Unused
   * @see IOException
   */
  public static void main(String[] args) {
    /* Let's declare and
     print variable in java. */
    int i=10;
    System.out.println(i);
    /* float j = 5.9;
        float k = 4.4;
        System.out.println( j + k ); */

    JavaComments obj = new JavaComments();
    int result = obj.sum(40, 20);

    System.out.println("Addition of numbers: " + result);

    //the below comment will be executed
    // \u000d System.out.println("Java comment is executed!!");

  }

  // documentation comment
  //
  /**
   *
   *We can use various tags to depict the parameter
   *or heading or author name
   *We can also use HTML tags
   *
   */
  /*
  {@docRoot}	{@docRoot}	to depict relative path to root directory of generated document from any page.
  @author	@author name - text	To add the author of the class.
  @code	{@code text}	To show the text in code font without interpreting it as html markup or nested javadoc tag.
  @version	@version version-text	To specify "Version" subheading and version-text when -version option is used.
  @since	@since release	To add "Since" heading with since text to generated documentation.
  @param	@param parameter-name description	To add a parameter with given name and description to 'Parameters' section.
  @return	@return description	Required for every method that returns something (except void)
   */

  /**
   * This method calculates the summation of two integers.
   * @param input1 This is the first parameter to sum() method
   * @param input2 This is the second parameter to the sum() method.
   * @return int This returns the addition of input1 and input2
   */
  public int sum(int input1, int input2){
    return input1 + input2;
  }


}

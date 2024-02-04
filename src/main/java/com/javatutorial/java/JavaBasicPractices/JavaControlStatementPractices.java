package com.javatutorial.java.JavaBasicPractices;

public class JavaControlStatementPractices {

  /*
  Decision Making statements
    if statements
    switch statement
  Loop statements
    do while loop
    while loop
    for loop
    for-each loop
  Jump statements
    break statement
    continue statement

   */

  public enum Day { Mon, Tue, Wed, Thu,Fri,Sat, Sun}

  public static void main(String[] args) {

    int x = 10;
    int y = 20;

    if (x + y > 20) {
      System.out.println("x + y is greater than 20");
    }
    else if (x + y == 20) {
      System.out.println("x + y is equal to 20");
    }
    else {
      System.out.println("x + y is less than 20");
    }

    String address = "Delhi, India";
    // nested if
    if (address.endsWith("India")) {

      if (address.contains("Seoul")) {
        System.out.println("Your city is Seoul");
      }
      else if (address.contains("Noida")) {
        System.out.println("Your city is Noida");
      }
      else {
        System.out.println(address.split(",")[0]);
      }

    }
    else {
      System.out.println("you are not living in India");
    }

    /*
    Using Ternary Operator
    We can also use ternary operator (? :) to perform the task of if...else statement.
    It is a shorthand way to check the condition. If the condition is true, the result of ? is returned. But,
    if the condition is false, the result of : is returned.
    */

    int num = 13;

    String output = (num % 2 == 0) ? "even number" : "odd number";
    System.out.println(num);


      /*
     In Java, Switch statements are similar to if-else-if statements. The switch statement contains multiple blocks
   of code called cases and a single case is executed based on the variable which is being switched.
   The switch statement is easier to use instead of if-else-if statements. It also enhances the readability of the program.

   The case variables can be int, short, byte, char, or enumeration. String type is also supported since version 7 of Java
  Cases cannot be duplicate
  Default statement is executed when any of the case doesn't match the value of expression. It is optional.
  Break statement terminates the switch block when the condition is satisfied.
  It is optional, if not used, next case is executed.

  While using switch statements, we must notice that the case expression will be of the same type as the variable.
  The case statement should be string literal.

  However, it will also be a constant value.

  There can be one or N number of case values for a switch expression.
  The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
  The case values must be unique. In case of duplicate value, it renders compile-time error.
  The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
  Each case statement can have a break statement which is optional. When control reaches to the break statement, it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
  The case value can have a default label which is optional.

   */
    System.out.println();

    int n = 2;

    switch (n) {
      case 0:
        System.out.println("0");
        break;
      case 1:
        System.out.println("1");
        break;
      default:
        System.out.println(n);
    }

    // nested swtich statement

    //C - CSE, E - ECE, M - Mechanical
    char branch = 'C';
    int collegeYear = 4;
    switch (collegeYear) {
      case 1:
        System.out.println("English, Maths, Science");
        break;
      case 2:
        switch (branch) {
          case 'C':
            System.out.println("Operating System, Java, Data Structure");
            break;
          case 'E':
            System.out.println("Micro processors, Logic switching theory");
            break;
          case 'M':
            System.out.println("Drawing, Manufacturing Machines");
            break;
        }
        break;
      case 3:
        switch (branch) {
          case 'C':
            System.out.println("Computer Organization, MultiMedia");
            break;
          case 'E':
            System.out.println("Fundamentals of Logic Design, Microelectronics");
            break;
          case 'M':
            System.out.println("Internal Combustion Engines, Mechanical Vibration");
            break;
        }
        break;
      case 4:
        switch (branch) {
          case 'C':
            System.out.println("Data Communication and Networks, MultiMedia");
            break;
          case 'E':
            System.out.println("Embedded System, Image Processing");
            break;
          case 'M':
            System.out.println("Production Technology, Thermal Engineering");
            break;
        }
        break;
    }

    /*
    Java Enum in Switch Statement
Java allows us to use enum in switch statement. Java enum is a class that represent the group of constants.
 (immutable such as final variables). We use the keyword enum and put the constants in curly braces separated by comma.
     */

    String levelStr = "Expert";
    int level = 0;

    switch (levelStr) {
      case "Beginner":
        level = 1;
        break;
      case "Intermediate":
        level = 2;
        break;
      case "Expert":
        level = 3;
        break;
      default:
        level = 0;
    }

    System.out.println("your level is " + level);


    Day now = Day.Mon;
    switch (now) {
      case Mon:
        System.out.println("monday");
        break;
      case Tue:
        System.out.println("tuesday");
        break;
      case Wed:
        System.out.println("wednesday");
        break;
      case Thu:
        System.out.println("thursday");
        break;
      case Fri:
        System.out.println("friday");
        break;
      case Sat:
        System.out.println("saturday");
        break;
      case Sun:
        System.out.println("sunday");
        break;
    }


    /*
    In programming, sometimes we need to execute the block of code repeatedly while some condition evaluates to true.
    However, loop statements are used to execute the set of instructions in a repeated order.
    The execution of the set of instructions depends upon a particular condition.
    */
    System.out.println();

    int sum = 0;

    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
    }

    System.out.println(sum);

    /*
    java for-each loop
    Java provides an enhanced for loop to traverse the data structures like array or collection. In the for-each loop,
    we don't need to update the loop variable
    */
    System.out.println();

    String[] names = {"min ku", "samuel", "diego"};

    for (String name : names) {
      System.out.println(name);
    }

    /*
    The while loop is also used to iterate over the number of statements multiple times. However,
    if we don't know the number of iterations in advance, it is recommended to use a while loop.
    Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop.
    */
    System.out.println();

    int i = 0;

    while (i <= 10) {
      System.out.println(i);
      i = i + 2;
    }

    /*
    The do-while loop checks the condition at the end of the loop after executing the loop statements.
    When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.
    */

    System.out.println();

    int j = 2;

    do {
      System.out.println(j);
      j += 2;
    } while (j <= 2);

    /*
    Jump statements are used to transfer the control of the program to the specific statements. In other words,
    jump statements transfer the execution control to the other part of the program. There are two types of jump
    statements in Java, i.e., break and continue.

    As the name suggests, the break statement is used to break the current flow of the program and transfer the
    control to the next statement outside a loop or switch statement. However, it breaks only the inner loop in
    the case of the nested loop.

    The break statement cannot be used independently in the Java program, i.e., it can only be written inside
    the loop or switch statement.

    in for if we are looping the array from 1 to 10, if the break is equal 6, after printing 6, the for cycle is exit
     */
    System.out.println();

    for (int number = 1; number <= 10; number++) {
      System.out.println(number);
      if (number == 6)
        break;
    }

    /*
    Unlike break statement, the continue statement doesn't break the loop, whereas,
    it skips the specific part of the loop and jumps to the next iteration of the loop immediately.

    in for if we are looping the array from 1 to 10, if the continue is equal 6, this is only not print 6,
    the for cycle is continued

     */
    System.out.println();

    for (int xs = 1; xs <= 10; xs++) {
      System.out.println(xs);
      if (xs == 6)
        continue;
    }

    System.out.println();

    for (int ix = 1; ix <= 5; ix++) {
      for (int jx = 1; jx <= ix; jx++) {
        System.out.print("* ");
      }
      System.out.println();//new line
    }

    System.out.println();

    int term = 6;
    for (int is = 1; is <= term; is++) {
      for (int js = term; js >= is; js--) {
        System.out.print("* ");
      }
      System.out.println();//new line
    }

    /*
    Java Labeled For Loop
    We can have a name of each Java for loop. To do so, we use label before the for loop.
    It is useful while using the nested for loop as we can break/continue specific for loop.
    */

    System.out.println();

    aa:
    for (int id = 1; id <= 3; id++) {
      bb:
      for (int jd = 1; jd <= 3; jd++) {
        if (id == 2 && jd == 2) {
          break aa;
        }
        System.out.println(id + " " + jd);
      }
    }

    /*
    Java Infinitive for Loop
    If you use two semicolons ;; in the for loop, it will be infinitive for loop.
     */

    System.out.println();

    //Using no condition in for loop
//    for(;;){
//      System.out.println("infinitive loop");
//    }

  }
}

package com.javatutorial.java.java8.Java45FeaturesPractices;

enum Season{SPRING, SUMMER, FALL, WINTER}

public class EnumExample1 {

  /*
  The Enum in Java is a data type which contains a fixed set of constants.

  It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY) ,
  directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL),
  colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc. According to the Java naming conventions,
  we should have all constants in capital letters. So, we have enum constants in capital letters.

  Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change).
  The Java enum constants are static and final implicitly. It is available since JDK 1.5.

  Enums are used to create our own data type like classes. The enum data type (also known as Enumerated Data Type)
  is used to define an enum in Java. Unlike C/C++, enum in Java is more powerful. Here, we can define an enum either
  inside the class or outside the class.

  Java Enum internally inherits the Enum class, so it cannot inherit any other class, but it can implement many
  interfaces. We can have fields, constructors, methods, and main methods in Java enum.

  Enum improves type safety
  Enum can be easily used in switch
  Enum can be traversed
  Enum can have fields, constructors and methods
  Enum may implement many interfaces but cannot extend any class because it internally extends Enum class

  The Java compiler internally adds the values(), valueOf(), and ordinal() methods when it creates an enum

  The enum can be defined within or outside the class because it is similar to a class.
  The semicolon (;) at the end of the enum constants are optional

  We cannot create the instance of Enum by new keyword because it contains private constructors only

  we can have abstract method in the Enum, and provide the implementation of these methods

  we can use eum on switch


   */

  enum Season2 {SPRING, SUMMER, FALL, WINTER}  // Index 0, 1, 2, 3

  enum CustomValueSeasons {
    SPRING(0), SUMMER(10), FALL(5), WINTER(53);

    private int value;
    private CustomValueSeasons(int value) { // Constructor of enum type is private.
      this.value = value;
    }
  }

  public static void main(String[] args) {
    for(Season3 season: Season3.values()) { // The values() method returns an array containing all the values of the enum.
      System.out.println(season);
    }


    System.out.println("Value of WINTER is " + Season3.valueOf("WINTER")); // The valueOf() method returns the value of given constant enum.
    System.out.println("Index of WINTER is " + Season3.valueOf("WINTER").ordinal());
    System.out.println("Index of SUMMER is " + Season3.valueOf("SUMMER").ordinal()); // The ordinal() method returns the index of the enum value.


    System.out.println("Index of the SPRING is" + Season3.valueOf("SPRING").ordinal());

    Season2 spring = Season2.SPRING;
    System.out.println(spring);

    for(CustomValueSeasons s: CustomValueSeasons.values()) {
      System.out.println(s + " value is " + s.value);  //  s.value is the single value, SPRING value is 0    in here s is SPRING AND value is custom value 0
    }

    // enum with swtich example

    Season2 season = Season2.WINTER;

    switch(season) {  // the season is winter
      case WINTER: System.out.println("the season is winter"); break;
      case SPRING: System.out.println("the season is srping"); break;
      default: System.out.println("doesn't know the season");
    }

  }


}

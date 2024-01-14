package com.javatutorial.java.java8.Java45FeaturesPractices;

import static java.lang.System.*;  // static import

public class StaticImportExample {

  /*
  The static import feature of Java 5 facilitate the java programmer to access any static member of a class directly.
  There is no need to qualify it by the class name.

   advantage
   Less coding is required if you have access any static member of a class oftenly.

   disadvantage
   If you overuse the static import feature, it makes the program unreadable and unmaintainable.

   The import allows the java programmer to access classes of a package without package qualification whereas
   the static import feature allows to access the static members of a class without the class qualification.
   The import provides accessibility to classes and interface whereas static import provides accessibility to static members of the class.
   */

  public static void main(String... args) {
      out.println("static import example");
  }


}

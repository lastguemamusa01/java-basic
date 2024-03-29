package com.javatutorial.java.Java8FeaturesPractices;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Declaring repeatable annotation type
@Repeatable(Games.class)
@interface Game {
  String name();
  String day();
}

// declaring container for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Games{
  Game[] value();
}

// repeating annotation
@Game(name="Cricket", day="Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")
public class RepeatingAnnotationsExample {
  /*
  Java Type Annotations

  Java 8 has included two new features repeating and type annotations in its prior annotations topic.
  In early Java versions, you can apply annotations only to declarations. After releasing of Java SE 8 ,
  annotations can be applied to any type use. It means that annotations can be used anywhere you use a type.
  For example, if you want to avoid NullPointerException in your code, you can declare a string variable like this:

  type annotations:

  @NonNull String str;
  List<@NonNull String> str
  Arrays<@NonNegative Integer> sort
  @Encrypted File file
  @Open Connection connection
  void divideInteger(int a, int b) throws @ZeroDivisor ArithmeticException

  Java created type annotations to support improved analysis of Java programs.
  It supports way of ensuring stronger type checking.

  Java Repeating Annotations

  In Java 8 release, Java allows you to repeating annotations in your source code. It is helpful when you want to
  reuse annotation for the same class. You can repeat an annotation anywhere that you would use a standard annotation.

  For compatibility reasons, repeating annotations are stored in a container annotation that is automatically generated
  by the Java compiler. In order for the compiler to do this, two declarations are required in your code.

  Declare a repeatable annotation type
  Declare the containing annotation type

  1) Declare a repeatable annotation type
  Declaring of repeatable annotation type must be marked with the @Repeatable meta-annotation. In the following example,
  we have defined a custom @Game repeatable annotation type.

  @Repeatable(Games.class)
  @interfaceGame{
      String name();
      String day();
  }

  The value of the @Repeatable meta-annotation, in parentheses, is the type of the container annotation that the
  Java compiler generates to store repeating annotations. In the following example, the containing annotation
  type is Games. So, repeating @Game annotations is stored in an @Games annotation.

  2) Declare the containing annotation type

  Containing annotation type must have a value element with an array type. The component type of the array type
  must be the repeatable annotation type. In the following example, we are declaring Games containing annotation type:

  @interfaceGames{
      Game[] value();
  }

   */

  public static void main(String[] args) {
    // getting annotation by type into an array
    Game[] game = RepeatingAnnotationsExample.class.getAnnotationsByType(Game.class);
    for (Game game2 : game) {    // Iterating values
      System.out.println(game2.name()+" on "+game2.day());
    }
  }

}

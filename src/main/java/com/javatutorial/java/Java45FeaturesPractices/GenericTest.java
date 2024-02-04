package com.javatutorial.java.Java45FeaturesPractices;


import java.util.*;

abstract class Shape {
  abstract void draw();
}

class Rectangle extends Shape {
  void draw() { System.out.println("draw rectangle"); }
}

class Circle extends Shape {
  void draw() { System.out.println("draw circle"); }
}


public class GenericTest {

  /*

    The ? (question mark) symbol represents the wildcard element. It means any type. If we write <? extends Number>,
  it means any child class of Number, e.g., Integer, Float, and double. Now we can call the method of Number class
  through any child class object.

  We can use a wildcard as a type of a parameter, field, return type, or local variable. However, it is not allowed
  to use a wildcard as a type argument for a generic method invocation, a generic class instance creation,
  or a supertype.

  The purpose of upper bounded wildcards is to decrease the restrictions on a variable. It restricts the unknown
  type to be a specific type or a subtype of that type. It is used by declaring wildcard character ("?") followed
  by the extends (in case of, class) or implements (in case of, interface) keyword, followed by its upper bound.

  List<? extends Number>

  ? is a wildcard character.
  extends, is a keyword.
  Number, is a class present in java.lang package

  suppose, we want to write the method for the list of Number and its subtypes (like Integer, Double).
  Using List<? extends Number> is suitable for a list of type Number or any of its subclasses whereas List<Number>
  works with the list of type Number only. So, List<? extends Number> is less restrictive than List<Number>.

  The unbounded wildcard type represents the list of an unknown type such as List<?>. This approach can be useful
  in the following scenarios: -

  When the given method is implemented by using the functionality provided in the Object class.
  When the generic class contains the methods that don't depend on the type parameter.

  The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype
  of that type. It is used by declaring wildcard character ("?") followed by the super keyword, followed
  by its lower bound.

  Suppose, we want to write the method for the list of Integer and its supertype (like Number, Object).
  Using List<? super Integer> is suitable for a list of type Integer or any of its superclasses whereas
  List<Integer> works with the list of type Integer only. So, List<? super Integer> is less restrictive
  than List<Integer>.


   */

  public static void drawShape(List<? extends Shape> shapelist) {
    for(Shape shape: shapelist) {
      shape.draw();
    }
  }

  private static Double add(ArrayList<? extends Number> num) {
    double sum=0.0;
    for(Number n: num) {
      sum = sum + n.doubleValue();
    }

    return sum;
  }

  public static void display(List<?> list) {
    for(Object obj: list) {
      System.out.println(obj);
    }
  }

  public static void addNumbers(List<? super Integer> list) {
    for(Object number: list) {
      System.out.println(number);
    }
  }

  public static void main(String[] args) {

    List<Rectangle> rectangleList = new ArrayList<Rectangle>();
    rectangleList.add(new Rectangle());

    List<Circle> circleList = new ArrayList<Circle>();
    circleList.add(new Circle());
    circleList.add(new Circle());

    System.out.println(" upper bounded ");
    drawShape(rectangleList);
    drawShape(circleList);

    ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.add(10);
    l1.add(20);
    System.out.println("upper bounded - displaying the sum= "+add(l1));

    ArrayList<Double> l2 = new ArrayList<Double>();
    l2.add(30.0);
    l2.add(40.0);
    System.out.println("upper bounded -  displaying the sum= "+add(l2));


    List<Integer> intList = Arrays.asList(1,2,3);
    System.out.println("display int list - unbouded wildcard");
    display(intList);

    List<String> wordList = Arrays.asList("magma", "sur", "doma");
    System.out.println("display word list- unbouded -wildcard");
    display(wordList);

    List<Number> numberList = new ArrayList<Number>();
    numberList.add(3.5);
    numberList.add(1);
    numberList.add(4.0);

    System.out.println("display int list - lower bound wildcard");
    addNumbers(intList);

    System.out.println("display number list - lower bound wildcard");
    addNumbers(numberList);

  }



}

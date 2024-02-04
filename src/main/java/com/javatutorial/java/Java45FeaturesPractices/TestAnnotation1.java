package com.javatutorial.java.Java45FeaturesPractices;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.lang.reflect.*;

@Documented
@Inherited
@interface MyMarkerAnnotation{}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@interface  MySingleValueAnnotation {
  int value() default 0;
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyMultiValueAnnotation {
  int value() default 0;
  String value2() default "";
  String value3() default "etc";
}

class Animal {

  @MyMultiValueAnnotation(value = 1, value2 = "second", value3 = "third")
  void eatingSomething() { System.out.println("eating something");}

  @Deprecated // this will be deprecated in the future, warning about don't use it
  void n(){ System.out.println("Hello n");}

}

class Dog extends Animal {

  @MySingleValueAnnotation(value = 10)
  @Override   // annotation
  void eatingSomething() { System.out.println("eating dog food"); } // eatsomething() if not override the parent method, this will throw error
  // method does not override or implement a method from a supertype
}


public class TestAnnotation1 {

  /*
  Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields
  to indicate some additional information which can be used by java compiler and JVM.

  Annotations in Java are used to provide additional information, so it is an alternative option for XML
  and Java marker interfaces.

  First, we will learn some built-in annotations then we will move on creating and using custom annotations.

  Built-In Java Annotations used in Java code
    @Override
    @SuppressWarnings
    @Deprecated

  Built-In Java Annotations used in other annotations
    @Target
    @Retention
    @Inherited
    @Documented

   @Override annotation assures that the subclass method is overriding the parent class method. If it is not so,
   compile time error occurs.

   @SuppressWarnings annotation: is used to suppress warnings issued by the compiler.

   @Deprecated annoation marks that this method is deprecated so compiler prints warning.
   It informs user that it may be removed in the future versions. So, it is better not to use such methods.

   Java Custom annotations or Java User-defined annotations are easy to create and use. The @interface element
   is used to declare an annotation

   1 - Method should not have any throws clauses
   2 - Method should return one of the following: primitive data types, String, Class, enum or array of these data types.
   3 - Method should not have any parameter.
   4 - We should attach @ just before interface keyword to define annotation.
   5 - It may assign a default value to the method.

   There are three types of annotations.

   1 - Marker Annotation - An annotation that has no method, is called marker annotation ->  @interface MyAnnotation{}
      -> @Override and @Deprecated are marker annotations.
   2 -  Single-Value Annotation - An annotation that has one method, is called single-value annotation ->
        @interface MyAnnotation{
          int value() default 0;   -> @MyAnnotation(value=10)
        }
    Multi-Value Annotation - An annotation that has more than one method, is called Multi-Value annotation.
       @interface MyAnnotation{
          int value1() default 1;
          String value2() default "";
          String value3() default "xyz";
        }   -> @MyAnnotation(value1=10,value2="Arun Kumar",value3="Ghaziabad")


    @Target tag is used to specify at which type, the annotation is used.

   The java.lang.annotation.ElementType enum declares many constants to specify the type of element where annotation
   is to be applied such as TYPE, METHOD, FIELD


   adding this, said in annotation where can be applied

    TYPE -> 	class, interface or enumeration
    FIELD	 -> fields
    METHOD -> 	methods
    CONSTRUCTOR -> 	constructors
    LOCAL_VARIABLE -> 	local variables
    ANNOTATION_TYPE	->  annotation type
    PARAMETER -> 	parameter

    @Retention annotation is used to specify to what level annotation will be available.

    RetentionPolicy.SOURCE	-> refers to the source code, discarded during compilation. It will not be available
    in the compiled class.
    RetentionPolicy.CLASS	-> refers to the .class file, available to java compiler but not to JVM .
    It is included in the class file.
    RetentionPolicy.RUNTIME	 -> refers to the runtime, available to java compiler and JVM .

    @Inherited
    By default, annotations are not inherited to subclasses. The @Inherited annotation marks the annotation to be
    inherited to subclasses.

    @Documented
    The @Documented Marks the annotation for inclusion in the documentation.

   */

  @SuppressWarnings("unchecked")
  public static void main(String[] args)  {

    @MyMarkerAnnotation
    Animal a = new Dog();
    a.eatingSomething();


    a.n(); // n() is depreated
    ArrayList list = new ArrayList();
    list.add("sonoo"); // Unchecked call to 'add(E)' as a member of raw type java.util.ArrayList
    list.add("something");
    list.add("fence");

    for(Object obj: list) {
      System.out.println(obj);
    }


  }


}

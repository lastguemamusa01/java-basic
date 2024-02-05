package com.javatutorial.java.JavaOOPsMisc;

public class WrapperExample1 {

  /*

  The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

  Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.

  The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.

  where we need to use the wrapper classes.

  Change the value in Method: Java supports only call by value. So, if we pass a primitive value, it will not change
  the original value. But, if we convert the primitive value in an object, it will change the original value.

  Serialization: We need to convert the objects into streams to perform the serialization. If we have a primitive value,
  we can convert it in objects through the wrapper classes.

  Synchronization: Java synchronization works with objects in Multithreading.

  java.util package: The java.util package provides the utility classes to deal with objects.

  Collection Framework: Java collection framework works with objects only. All classes of the collection framework
  (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

  The eight classes of the java.lang package are known as wrapper classes in Java. The list of eight wrapper classes are given below:


  primitive Wrapper
  ------------------
  boolean	Boolean
  char	Character
  byte	Byte
  short	Short
  int	Integer
  long	Long
  float	Float
  double	Double

  The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
  for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean,
  double to Double, and short to Short

  Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.

  The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.
  It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of wrapper classes
  to convert the wrapper type into primitives.



   */


  public static void main(String[] args) {

    // autoboxing
    int a = 20;
    Integer ibefore = Integer.valueOf(a);
    Integer iafter = a;

    System.out.println(a + " " + ibefore + " " + iafter);

    // unboxing

    Integer a2 = new Integer(3);

    int jbefore = a2.intValue();
    int jafter = a2;

    System.out.println(a2 + " " + jbefore + " " + jafter);
  }

}

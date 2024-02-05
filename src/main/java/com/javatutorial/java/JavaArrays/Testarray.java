package com.javatutorial.java.JavaArrays;

import java.util.Arrays;

public class Testarray {

  /*

  Normally, an array is a collection of similar type of elements which has contiguous memory location.

  Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are
  stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a
  fixed set of elements in a Java array.

  Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on
  1st index and so on.

  In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements
  the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java.
  Like C/C++, we can also create single dimentional or multidimentional arrays in Java.

  Advantages

  Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
  Random access: We can get any data located at an index position.

  Disadvantages

  Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
  To solve this problem, collection framework is used in Java which grows automatically.

  There are two types of array.

  Single Dimensional Array
  Multidimensional Array

  We can pass the java array to method so that we can reuse the same logic on any array

  Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

  he Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative,
  equal to the array size or greater than the array size while traversing the array.

  If we are creating odd number of columns in a 2D array, it is known as a jagged array. In other words,
  it is an array of arrays with different number of columns.

  In Java, an array is an object. For array object, a proxy class is created whose name can be obtained by
  getClass().getName() method on the object.

  Since, Java array implements the Cloneable interface, we can create the clone of the Java array.
  If we create the clone of a single-dimensional array, it creates the deep copy of the Java array.
  It means, it will copy the actual value. But, if we create the clone of a multidimensional array,
  it creates the shallow copy of the Java array which means it copies the references.




   */


  static int minimum(int[] arr) {
    int min = arr[0];

    for(int i = 1; i < arr.length; i++) {
      if(min > arr[i]) {
        min = arr[i];
      }
    }
    return min;
  }

  static int[] get() {
    return new int[]{3,5,2,3,5};
  }

  public static void main(String[] args) {

    int[] a = new int[5];
    int b[] = new int[2];
    // We can declare, instantiate and initialize the java array together
    int[] c = {3,6,13};

    a[0] = 10;
    b[0] = 3;

    a[0] = 6;
    b[1] = 35;
    a[2] = 5;
    a[3] = 3;
    a[4] = 69;

    // length of array is variable -> this could get the array size
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    System.out.println();

    for(int i =0; i < b.length; i++) {
      System.out.println(b[i]);
    }

    System.out.println();

    //  for-each loop
    for(int number: c) {
      System.out.println(number);
    }

    System.out.println();

    System.out.println("the minimum number in the arry is " + minimum(c));

    // anonymous array example
    System.out.println("the minimum number in the arry is " + minimum(new int[]{1,5,32}));

    System.out.println();

    int[] arrayE = get();
    for(int num: arrayE) {
      System.out.println(num);
    }

    System.out.println();

    // multidimensional(bidimensional) array of x = 3 and y = 3
    int[][] d = new int[3][3];
    int[][] e = {{4,89,2},{5,36,6},{6,46,3}};

    for(int x = 0; x < e.length; x++) {
      for(int y = 0; y < e[x].length; y++) {
        System.out.print(e[x][y] + " ");
      }
      System.out.println();
    }

    System.out.println();

    //declaring a 2D array with odd columns
    int arr[][] = new int[3][];
    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[2] = new int[2];

    //initializing a jagged array
    int count = 0;
    for (int i=0; i<arr.length; i++)
      for(int j=0; j<arr[i].length; j++)
        arr[i][j] = count++;


    // Arrays.deepToString(bi-dimesionalArryVariable) -> to print bidimensional Arrays
    System.out.println(Arrays.deepToString(arr));

    System.out.println();

    int arr2[]={4,4,5};

    int arr2Copy[] = new int[3];

    // parameter - copy from Array, from array start index , destination array, destinatino start index, size
    System.arraycopy(arr2, 0, arr2Copy, 0 , 3 );

    //getting the class name of Java array
    Class cs=arr2.getClass();
    String name=cs.getName();
    //printing the class name of Java array
    System.out.println(name); // I

    System.out.println();

    // Arrays.toString to print one dimensional array values
    System.out.println(Arrays.toString(arr2Copy));

    System.out.println();

    System.out.println("Printing original array:");
    System.out.println(Arrays.toString(arr2));


    System.out.println("Printing clone of the array:");
    int[] arr2Clone = arr2.clone();
    System.out.println(Arrays.toString(arr2Clone));

    System.out.println("Are both equals ?");
    System.out.println(arr2 == arr2Clone);

    System.out.println();



  }

}

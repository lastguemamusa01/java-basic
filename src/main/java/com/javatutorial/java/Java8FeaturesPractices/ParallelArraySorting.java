package com.javatutorial.java.Java8FeaturesPractices;

import java.util.Arrays;

public class ParallelArraySorting {

  /*
  Java provides a new additional feature in Array class which is used to sort array elements parallel.New methods
  has added to java.util.Arrays package that use the JSR 166 Fork/Join parallelism common pool to provide sorting
  of arrays in parallel.The methods are called parallelSort() and are overloaded for all the primitive data types
  and Comparable objects.

   */

  public static void main(String[] args) {

    // creating an integer array
    int[] arr = {5,8,1,0,6,9,50,-3};
    int[] arr2 = {5,8,1,0,6,9,50,-3};
    // iterating array elements
    for(int i: arr) System.out.print(i + " ");


    // sorting array elements parallel
    Arrays.parallelSort(arr);
    System.out.println("\n Array elements after sorting");
    // Iterating array elements
    for (int i : arr) {
      System.out.print(i+" ");
    }

    // Sorting array elements parallel and passing start, end index
    Arrays.parallelSort(arr2,0,4);
    System.out.println("\nArray elements after sorting");
    // Iterating array elements
    for (int i : arr2) {
      System.out.print(i+" ");
    }

  }

}

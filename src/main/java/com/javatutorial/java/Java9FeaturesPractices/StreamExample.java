package com.javatutorial.java.Java9FeaturesPractices;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

  /*
  In Java 9, Stream API has improved and new methods are added to the Stream interface

  Java Stream takeWhile() Method

  Stream takeWhile method takes each element that matches its predicate. It stops when it get unmatched element.
  It returns a subset of elements that contains all matched elements, other part of stream is discarded.

  Java Stream dropWhile() Method

  Stream dropWhile method returns result on the basis of order of stream elements.

  Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.

  Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of
  elements that match the given predicate.

  Java 9 Stream ofNullable Method
  Stream ofNullable method returns a sequential stream that contains a single element, if non-null. Otherwise,
  it returns an empty stream.

  It helps to handle null stream and NullPointerException.

  Java Stream Iterate Method
  A new overloaded method iterate is added to the Java 9 stream interface. This method allows us to iterate stream elements till the specified condition.

  It takes three arguments, seed, hasNext and next.


   */

  public static void main(String[] args) {
    List<Integer> list =
      Stream.of(1,2,3,4,5,6,7,8,9,10)
        .takeWhile(i -> (i%2 ==0)).collect(Collectors.toList());

    // This example returns an empty list because it fails at first list element, and takewhile stops here.
    System.out.println(list); // []

    List<Integer> list2
      = Stream.of(2,2,3,4,5,6,7,8,9,10)
      .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
    System.out.println(list2); // 2 y 2 are matched, so return all discarded list -> [3, 4, 5, 6, 7, 8, 9, 10]

    Stream<Integer> val
      = Stream.ofNullable(null);
    val.forEach(System.out::println);

    Stream.iterate(1, i -> i <= 10, i -> i*3)
      .forEach(System.out::println); // 1, 3 ,9




  }

}

package com.javatutorial.java.java8.Java45FeaturesPractices;

import java.util.ArrayList;

public class ForEachExample1 {

  /*
  The Java for-each loop or enhanced for loop is introduced since J2SE 5.0. It provides an alternative approach to
  traverse the array or collection in Java. It is mainly used to traverse the array or collection elements.
  The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable.
  It is known as the for-each loop because it traverses each element one by one.

  The drawback of the enhanced for loop is that it cannot traverse the elements in reverse order.
  Here, you do not have the option to skip any element because it does not work on an index basis.
  Moreover, you cannot traverse the odd or even elements only.
   */

  public static void main(String[] args) {

    int arr[] = {1,2,5,7,9};
    ArrayList<String> stringList = new ArrayList<String>();

    stringList.add("one");
    stringList.add("two");
    stringList.add("ten");


    for(int i: arr) {
      System.out.println(i);
    }

    for(String word: stringList) {
      System.out.println(word);
    }


  }

}

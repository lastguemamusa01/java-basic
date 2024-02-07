package com.javatutorial.java.Java8FeaturesPractices;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product1{
  int id;
  String name;
  float price;
  public Product1(int id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public float getPrice() {
    return price;
  }
}

public class JavaStreamExample {

  /*

  Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes,
  interfaces and enum to allows functional-style operations on the elements. You can use stream by importing
  java.util.stream package.

  Stream provides following features:

  Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or
   an I/O channel, through a pipeline of computational operations.

  Stream is functional in nature. Operations performed on a stream does not modify it's source. For example,
  filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than
  removing elements from the source collection.

  Stream is lazy and evaluates code only when required.

  The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream
  must be generated to revisit the same elements of the source.

  You can use stream to filter, collect, print, and convert from one data structure to other etc.

  Collectors is a final class that extends Object class. It provides reduction operations,
  such as accumulating elements into collections, summarizing elements according to various criteria, etc.


   */

  public static void main(String[] args) {

    List<Product1> productsList = new ArrayList<>();
    //Adding Products
    productsList.add(new Product1(1,"HP Laptop",25000f));
    productsList.add(new Product1(2,"Dell Laptop",30000f));
    productsList.add(new Product1(3,"Lenevo Laptop",28000f));
    productsList.add(new Product1(4,"Sony Laptop",28000f));
    productsList.add(new Product1(5,"Apple Laptop",90000f));

    List<Float> productPriceList = new ArrayList<>();

    for(Product1 product: productsList){

      // filtering data of list before Stream
      if(product.price<30000){
        productPriceList.add(product.price);    // adding price to a productPriceList
      }
    }

    System.out.println(productPriceList);   // displaying data

    // we are filtering data by using stream. You can see that code is optimized and maintained. Stream provides fast execution.
    List<Float> productPriceListStream =  productsList.stream()
      .filter(p -> p.price > 30000) // filtering data
      .map(p -> p.price) // fetching price
      .collect(Collectors.toList()); // collection as list

    System.out.println(productPriceListStream);

    Stream.iterate(1, element -> element+1)
      .filter(element -> element%5==0)
      .limit(5)
      .forEach(System.out::println);

    productsList.stream()
      .filter(p -> p.price > 20000)
      .forEach(product -> System.out.println(product.name));

    Float totalPrice = productsList.stream()
      .map(p -> p.price)
      .reduce(0.0f, (sum, price) -> sum+price); // .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class

    System.out.println(totalPrice);

    double totalPrice2 = productsList.stream()
      .collect(Collectors.summingDouble(p -> p.price));

    System.out.println(totalPrice2);

    Double average = productsList.stream()
      .collect(Collectors.averagingDouble(p->p.price));
    System.out.println("Average price is: "+average);

    Long noOfElements = productsList.stream()
      .collect(Collectors.counting());
    System.out.println("Total elements : "+noOfElements);

    // max
    Product1 maxPriceProduct = productsList.stream().max((p1,p2) -> p1.price > p2.price?1:-1).get();
    System.out.println(maxPriceProduct.price);

    Product1 minPriceProduct = productsList.stream().min((p1,p2) -> p1.price > p2.price? 1: -1).get();
    System.out.println(minPriceProduct.price);

    // count number of proudcts based on the filter

    long count = productsList.stream()
      .filter(p -> p.price < 30000)
      .count();

    System.out.println(count);

    // convert product list into Set

    Set<Float> productPriceSet = productsList.stream()
      .filter(p -> p.price < 30000)
      .map(Product1::getPrice)     //  Method reference ->  .map(Product1::getPrice)         // fetching price by referring getPrice method
      .collect(Collectors.toSet());

    System.out.println(productPriceSet);

    // convert product list into a map

    Map<Integer, String> productPriceMap = productsList.stream()
      .collect(Collectors.toMap(p -> p.id, p -> p.name));

    System.out.println(productPriceMap);


  }


}

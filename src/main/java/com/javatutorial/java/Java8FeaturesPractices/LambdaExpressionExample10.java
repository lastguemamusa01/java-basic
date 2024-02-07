package com.javatutorial.java.Java8FeaturesPractices;

import java.util.*;
import java.util.stream.Stream;

class Product {
   int id;
   String name;
   float price;
  public Product(int id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }
}
public class LambdaExpressionExample10 {

  // example of Java lambda expression can be used in the collection framework. It provides efficient and concise way to iterate, filter and fetch data.

  public static void main(String[] args) {

    List<Product> productList = new ArrayList<>();
    productList.add(new Product(1,"HP Laptop",25000f));
    productList.add(new Product(3,"Keyboard",300f));
    productList.add(new Product(2,"Dell Mouse",150f));

    System.out.println("sorting on the bassis of name ");

    // lambda expression
    Collections.sort(productList, (p1, p2) -> {
      return p1.name.compareTo(p2.name);
    });

    // Collections.sort(productList, Comparator.comparing(p -> p.name));

    for(Product p: productList) {
      System.out.println(p.id + " " + p.name + " " + p.price);
    }

    System.out.println("filtering by price is higher than 400");

    // using Stream class to filtering with lambda

    Stream<Product> filteredProList = productList.stream().filter( p -> p.price > 400f);

    filteredProList.forEach(
      (p) -> System.out.println(p.id + " " + p.name + " " + p.price )
    );

  }

}

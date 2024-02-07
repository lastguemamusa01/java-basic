package com.javatutorial.java.Java8FeaturesPractices;

public class LambdaExpressionExample9 {

  // example : You can use lambda expression to run thread.

  public static void main(String[] args) {

    // Thread example without lambda
    // create runnable anonymous class, pass the Runnable anonymous class as parameter of the Thread class
    // thread variable call start() method
    Runnable r1 = new Runnable(){
      public void run() {
        System.out.println("normal thread is running");
      }
    };

    Thread t1 = new Thread(r1);
    t1.start();

    // thread with lambda
    Runnable r2 = () -> {
      System.out.println("lambda thread is running");
    };

    Thread t2 = new Thread(r2);
    t2.start();



  }

}

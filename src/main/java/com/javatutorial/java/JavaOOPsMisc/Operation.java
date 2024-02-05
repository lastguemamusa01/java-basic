package com.javatutorial.java.JavaOOPsMisc;

public class Operation {

  /*

  There is only call by value in java, not call by reference. If we call a method passing a value, it is known as
  call by value. The changes being done in the called method, is not affected in the calling method

  In case of call by reference original value is changed if we made changes in the called method. If we pass
  object in place of any primitive value, original value will be changed

   */

  int data = 50;

  // call by value
  void change(int data){
    data=data+100;//changes will be in the local variable only
  }

  // call by reference -> this is not done in java
  void changeObj(Operation op) {
    op.data = op.data + 100; //changes will be in the instance variable
  }

  public static void main(String[] args) {
    Operation op = new Operation();

    System.out.println("before change "+op.data); // 50
    op.change(500);
    System.out.println("after change "+op.data); // 50

    op.changeObj(op);
    System.out.println("after change "+op.data); // 150

  }


}

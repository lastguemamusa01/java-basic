package com.javatutorial.java.JavaOOPPractices;


class Account {
  int accNo;
  String name;
  float amount;

  public Account(int accNo, String name, float amount) {
    this.accNo = accNo;
    this.name = name;
    this.amount = amount;
  }

  void deposit(float depositedAmount ) {
    amount = amount + depositedAmount;
    System.out.println(depositedAmount + " deposited");
  }

  void withdraw(float withdrawedAmout ) {
    if(amount < withdrawedAmout) {
      System.out.println("insufficient balance");
    }
    amount = amount - withdrawedAmout;
    System.out.println(withdrawedAmout + "withdrawn");
  }

  void checkBlance() {
    System.out.println("your current balance is " +amount);
  }

  void displayAccountInfo() {
    System.out.println("account of " + name + " and account No " + accNo );
  }


}
public class TestAccount {

  public static void main(String[] args) {
    Account min = new Account(1, "min", 100.45f);
    min.displayAccountInfo();
    min.checkBlance();
    min.deposit(200.35f);
    min.checkBlance();
    min.withdraw(100.53f);
    min.checkBlance();

  }


}

package com.javatutorial.java.JavaInheritance;

public class Emp {

  int id;
  String name;
  Address address;

  public Emp(int id, String name, Address address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  void display() {
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
  }

  public static void main(String[] args) {
    Address address2=new Address("gno","UP","india");

    Emp e=new Emp(111,"varun",new Address("gzb","UP","india"));
    Emp e2=new Emp(112,"arun",address2);

    e.display();
    e2.display();
  }

}

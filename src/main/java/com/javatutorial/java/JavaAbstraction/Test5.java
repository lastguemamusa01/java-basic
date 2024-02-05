package com.javatutorial.java.JavaAbstraction;

interface A{
  void a();
  void b();
  void c();
  void d();
}

abstract class B implements A {
  public void c() { System.out.println("C"); }
}

class M extends B {
  public void a() { System.out.println("A"); }
  public void b() { System.out.println("B"); }
  public void d() { System.out.println("D"); }

}

public class Test5 {

  public static void main(String[] args) {
    A a = new M();
    a.a();
    a.b();
    a.c();
    a.d();
  }

}

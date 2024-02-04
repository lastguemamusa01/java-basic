package com.javatutorial.java.JavaPolymorphism;


interface Printable{}
class A2 implements Printable{
  public void a(){System.out.println("a method");}
}
class B implements Printable{
  public void b(){System.out.println("b method");}
}

class Call{
  void invoke(Printable p){//upcasting
    if(p instanceof A2){
      A2 a=(A2)p;//Downcasting
      a.a();
    }
    if(p instanceof B){
      B b=(B)p;//Downcasting
      b.b();
    }

  }
}//end of Call class

public class Test4 {

  /*
  Understanding Real use of instanceof in java
   */
  public static void main(String[] args) {
    Printable p = new B();
    Call c = new Call();
    c.invoke(p);
  }

}

package com.javatutorial.java.InnerClassPractices;

public class LocalInner1 {

  /*

  A class i.e., created inside a method, is called local inner class in java. Local Inner Classes are the
  inner classes that are defined inside a block. Generally, this block is a method body. Sometimes this block
  can be a for loop, or an if clause. Local Inner classes are not a member of any enclosing classes. They belong
  to the block they are defined within, due to which local inner classes cannot have any access modifiers associated
  with them. However, they can be marked as final or abstract. These classes have access to the fields of the class
  enclosing it.

  If you want to invoke the methods of the local inner class, you must instantiate this class inside the method.
   */

  private int data = 30;


  void display() {
    final int data2 = 30;
    class Message {

      void printMeesage() {
        System.out.println(data+data2);
      }
    }

    Message m = new Message();
    m.printMeesage();
  }

  public static void main(String[] args) {
    LocalInner1 local = new LocalInner1();
    local.display();

  }


}

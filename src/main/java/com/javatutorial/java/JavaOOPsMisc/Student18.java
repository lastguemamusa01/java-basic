package com.javatutorial.java.JavaOOPsMisc;

public class Student18 implements Cloneable {

  /*
  The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.

  The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class
  reference variable can refer the child class object, know as upcasting.

  Let's take an example, there is getObject() method that returns an object but it can be of any type like
  Employee,Student etc, we can use Object class reference to refer that object. For example:

  Object obj=getObject();//we don't know what object will be returned from this method

  The Object class provides some common behaviors to all the objects such as object can be compared, object can be
  cloned, object can be notified etc.

  public final Class getClass()
  public int hashCode()
  public boolean equals(Object obj)
  protected Object clone() throws CloneNotSupportedException
  public String toString()
  public final void notify()
  public final void notifyAll()
  public final void wait(long timeout)throws InterruptedException
  public final void wait(long timeout,int nanos)throws InterruptedException
  public final void wait()throws InterruptedException
  protected void finalize()throws Throwable

  The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.

  The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
  If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.

  The clone() method is defined in the Object class.

  The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by
  using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.

  Although Object.clone() has some design issues but it is still a popular and easy way of copying objects.
  Following is a list of advantages of using clone() method:

  You don't need to write lengthy and repetitive codes. Just use an abstract class with a 4- or 5-line long clone() method.

  It is the easiest and most efficient way for copying objects, especially if we are applying it to an already
  developed or an old project. Just define a parent class, implement Cloneable in it, provide the definition of the clone() method and the task will be done.

  Clone() is the fastest way to copy array.

  Following is a list of some disadvantages of clone() method:

  To use the Object.clone() method, we have to change a lot of syntaxes to our code, like implementing a Cloneable
  interface, defining the clone() method and handling CloneNotSupportedException, and finally, calling Object.clone() etc.

  We have to implement cloneable interface while it doesn't have any methods in it. We just have to use it to tell t
  he JVM that we can perform clone() on our object.

  Object.clone() is protected, so we have to provide our own clone() and indirectly call Object.clone() from it.

  Object.clone() doesn't invoke any constructor so we don't have any control over object construction.

  If you want to write a clone method in a child class then all of its superclasses should define the clone() method
  in them or inherit it from another parent class. Otherwise, the super.clone() chain will fail.

  Object.clone() supports only shallow copying but we will need to override it if we need deep cloning.

   */

  int rollno;
  String name;

  Student18(int rollno,String name){
    this.rollno=rollno;
    this.name=name;
  }

  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }

  public static void main(String args[]){
    try{
      Student18 s1=new Student18(101,"amit");

      Student18 s2=(Student18)s1.clone();

      System.out.println(s1.rollno+" "+s1.name);
      System.out.println(s2.rollno+" "+s2.name);

    }catch(CloneNotSupportedException c){}

  }


}

// package example
package com.javatutorial.java.JavaPackage;

class A{

  // private A(){}//private constructor
  private int data=40;
  private void msg(){System.out.println("Hello java");}

  protected void msg2(){System.out.println("Hello java");}

}

public class Simple extends A {

  /*
  A java package is a group of similar types of classes, interfaces and sub-packages.

  Package in java can be categorized in two form, built-in package and user-defined package.

  There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

  1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.

  2) Java package provides access protection.

  3) Java package removes naming collision.

  There are three ways to access the package from outside the package.

  import package.*;
  import package.classname;
  fully qualified name.

  If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.

  If you import package.classname then only declared class of this package will be accessible.

  If you use fully qualified name then only declared class of this package will be accessible.
  Now there is no need to import. But you need to use fully qualified name every time when you are accessing
  the class or interface.

  If you import a package, all the classes and interface of that package will be imported excluding the classes
  and interfaces of the subpackages. Hence, you need to import the subpackage as well.

  Let's take an example, Sun Microsystem has definded a package named java that contains many classes like System,
  String, Reader, Writer, Socket etc. These classes represent a particular group e.g. Reader and Writer classes
  are for Input/Output operation, Socket and ServerSocket classes are for networking etc and so on. So,
  Sun has subcategorized the java package into subpackages such as lang, net, io etc. and put the Input/Output
  related classes in io package, Server and ServerSocket classes in net packages and so on.

  Rule: There can be only one public class in a java source file and it must be saved by the public class name.

  C.java -> if not this will throw error

  class A{}
  class B{}
  public class C{}

  There are two types of modifiers in Java: access modifiers and non-access modifiers.

  The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
  We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

  4 type of java access modifiers :

  Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
  Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
  If you do not specify any access level, it will be the default.
  Protected: The access level of a protected modifier is within the package and outside the package through child class.
  If you do not make the child class, it cannot be accessed from outside the package.
  Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class,
  within the package and outside the package.


  There are many non-access modifiers, such as static, abstract, synchronized, native, volatile, transient, etc. H

  The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

  //save by A.java
  package pack;
  public class A{
    protected void msg(){System.out.println("Hello");}
  }

  //save by B.java
  package mypack;
  import pack.*;

  class B extends A{
    public static void main(String args[]){
     B obj = new B();
     obj.msg();
    }
  }

  If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.





   */

  // If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive
  // overwriting
  // void msg2(){System.out.println("Hello java");}//C.T.Error

  public static void main(String[] args) {
    System.out.println("package example");
    com.javatutorial.java.JavaInheritance.Address obj = new com.javatutorial.java.JavaInheritance.Address("beijing","aloha","hawaii");

    // A obj=new A();  // private constructor - Compile error
    // System.out.println(obj.data);//Compile Time Error
    // obj.msg();//Compile Time Error

  }
}

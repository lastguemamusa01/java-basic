package com.javatutorial.java.java8.JavaOOPPractices;

class Calculation{
  void fact(int  n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println("factorial is " + fact);
  }
}

  class StudentC {
  int id;
  String name;

  public StudentC(int id, String name) {
    this.id = id;
    this.name = name;
  }

  void display() {
    System.out.println(id+ " " + name);
  }

}
class Student {
  int id;
  String name;

  void insertRecord(int rollNoId, String studentName) {
    id = rollNoId;
    name = studentName;
  }

  void display() {
    System.out.println(id+ " " + name);
  }
}

public class TestStudent {

  /*
   OOP feaatures -> inheritance, data binding and polymorphism
   Simula - first OOP language
   Smalltalk -first truly oop language

   OOP implement real-world entities, object, classes, abstraction , inheritance, polymorphism
   concepts - Coupling, Cohesion, Association, Aggregation and Composition

   Any entity that has state and behavior is known as an object. It can be physical or logical.

   Collection of objects is called class. It is a logical entity.

   When one object acquires all the properties and behaviors of a parent object, it is known as inheritance.
   It provides code reusability. It is used to achieve runtime polymorphism

   If one task is performed in different ways, it is known as polymorphism
   In Java, we use method overloading and method overriding to achieve polymorphism.

   Hiding internal details and showing functionality is known as abstraction.
   In Java, we use abstract class and interface to achieve abstraction.

   Binding (or wrapping) code and data together into a single unit are known as encapsulation.

   A java class is the example of encapsulation.
   Java bean is the fully encapsulated class because all the data members are private here.

  Coupling refers to the knowledge or information or dependency of another class.
  It arises when classes are aware of each other. If a class has the details information
  of another class, there is strong coupling. In Java, we use private, protected, and
  public modifiers to display the visibility level of a class, method, and field.
  You can use interfaces for the weaker coupling because there is no concrete implementation.


  Cohesion refers to the level of a component which performs a single well-defined task.
  A single well-defined task is done by a highly cohesive method. T
  he weakly cohesive method will split the task into separate parts.
  The java.io package is a highly cohesive package because it has I/O related classes and interface.
  However, the java.util package is a weakly cohesive package because it has unrelated classes and interfaces.

  Association represents the relationship between the objects. 4 types :

  One to One
  One to Many
  Many to One, and
  Many to Many

  Let's understand the relationship with real-time examples. For example, One country can have one prime minister
  (one to one), and a prime minister can have many ministers (one to many). Also, many MP's can have one prime
  minister (many to one), and many ministers can have many departments (many to many).

  Association can be undirectional or bidirectional.

  Aggregation

  Aggregation is a way to achieve Association. Aggregation represents the relationship where one object contains
  other objects as a part of its state. It represents the weak relationship between objects. It is also
  termed as a has-a relationship in Java. Like, inheritance represents the is-a relationship.
  It is another way to reuse objects.

  Composition

  The composition is also a way to achieve Association. The composition represents the relationship where one
  object contains other objects as a part of its state. There is a strong relationship between the containing
  object and the dependent object. It is the state where containing objects do not have an independent existence.
  If you delete the parent object, all the child objects will be deleted automatically.

  Object-based programming language follows all the features of OOPs except Inheritance.
  JavaScript and VBScript are examples of object-based programming languages.

  Java naming convention is a rule to follow as you decide what to name your identifiers such as class, package,
  variable, constant, method

  But, it is not forced to follow. So, it is known as convention not rule. These conventions are suggested by
  several Java communities such as Sun Microsystems and Netscape

  Class ->  Color, Button, System, Thread -> public class Employee
  Interface ->  Runnable, Remote, ActionListener. -> interface Printable
  Method -> It should start with lowercase letter -> verb as main(), print(), println(), actionPerformed() -> void draw()
  Variable -> start with a lowercase letter such as id, name. -> int id;
              It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
              firstName, lastName. -> cammel case
  Package ->  a lowercase letter such as java, lang. -> package com.javatpoint;
              If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
  Constant ->  uppercase letters such as RED, YELLOW. -> static final int MIN_AGE = 18;
               contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
               It may contain digits but not as the first letter.

  Java follows camel-case syntax for naming the class, interface, method, and variable. -> firstName, ActionEvent, ActionListener

  A class is a group of objects which have common properties. It is a template or blueprint from which
  objects are created. It is a logical entity. It can't be physical

  A variable which is created inside the class but outside the method is known as an instance variable.
  Instance variable doesn't get memory at compile time. It gets memory at runtime when an object
  or instance is created

  In Java, a method is like a function which is used to expose the behavior of an object.
  pros of method - code reusability and code optimization

  The new keyword is used to allocate memory at runtime. All objects get memory in Heap memory area.

  There are 3 ways to initialize object in Java.

  By reference variable
  By method
  By constructor

  different methods to create an object :

  By new keyword
  By newInstance() method
  By clone() method
  By deserialization
  By factory method etc.

  Anonymous simply means nameless. An object which has no reference is known as an anonymous object.
  It can be used at the time of object creation only.

  If you have to use an object only once, an anonymous object is a good approach

   */

  public static void main(String[] args) {
    Student min = new Student(); // min is reference variable
    Student manuel = new Student();
    // initialization through reference variable
    min.name = "min";
    min.id = 1;
    System.out.println(min.name + " " + min.id);

    // initialization through method
    manuel.insertRecord(2,"manuel");
    manuel.display();

    // initialization through a constructor
    StudentC nick = new StudentC(3, "nick");
    nick.display();

    // anonymous object
    new Calculation().fact(4);

    // creating multiple ocjects by one type only

    StudentC s1 = new StudentC(4, "caribbean"), s2 = new StudentC(5, "balcony");
    s1.display();
    s2.display();




  }





}

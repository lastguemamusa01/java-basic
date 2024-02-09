package com.javatutorial.java.Java9FeaturesPractices;

public class ProcessApiExample {

  /*

  Java has improved its process API in Java 9 version that helps to manage and control operating system processes.

  In earlier versions, it was complex to manage and control operating system processes by using Java programming.
  Now, new classes and interfaces are added to perform this task.

  New methods are added to the java.lang.Process class

  New interfaces ProcessHandle and ProcessHandle.Info are added.

  Java ProcessHandle Interface

  ProcessHandle helps to handle and control processes. We can monitor processes, list its children, get information etc.

  This interface contains static factory methods that return instances that are value-based, immutable and thread-safe.

  Java ProcessHandle.Info Interface

  It is added to Java 9, and used to provide information about the process. It is nested interface of ProcessHandle interface.

   */

  public static void main(String[] args) {
    ProcessHandle currentProcess = ProcessHandle.current();     // Current processhandle
    System.out.println("Process Id: "+currentProcess.pid());    // Process id
    System.out.println("Direct children: "+ currentProcess.children()); // Direct children of the process
    System.out.println("Class name: "+currentProcess.getClass());       // Class name
    System.out.println("All processes: "+ProcessHandle.allProcesses()); // All current processes
    System.out.println("Process info: "+currentProcess.info());         // Process info
    System.out.println("Is process alive: "+currentProcess.isAlive());
    System.out.println("Process's parent "+currentProcess.parent());  // Parent of the process
  }

}

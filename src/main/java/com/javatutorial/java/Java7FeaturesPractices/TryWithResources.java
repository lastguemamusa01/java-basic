package com.javatutorial.java.Java7FeaturesPractices;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithResources {

  /*
  In Java, the try-with-resources statement is a try statement that declares one or more resources.
  The resource is as an object that must be closed after finishing the program. The try-with-resources statement
  ensures that each resource is closed at the end of the statement execution.

  You can pass any object that implements java.lang.AutoCloseable, which includes all objects which
  implement java.io.Closeable.

  The following example writes a string into a file. It uses an instance of FileOutputStream to write data into the file.
  FileOutputStream is a resource that must be closed after the program is finished with it. So, in this example,
  closing of resource is done by itself try.



  Using Closeable interface, don't need to close with try catch finally
  import java.io.DataInputStream;
  import java.io.FileInputStream;
  import java.io.FileOutputStream;
  import java.io.InputStream;

   */

  public static void main(String[] args) {
    // Using try-with-resources
    try (    // Using multiple resources
             FileOutputStream fileOutputStream = new FileOutputStream("/java7-new-features/src/abc.txt");
             InputStream input = new FileInputStream("/java7-new-features/src/abc.txt")) {
      // -----------------------------Code to write data into file--------------------------------------------//
      String msg = "Welcome to javaTpoint!";
      byte byteArray[] = msg.getBytes();  // Converting string into byte array
      fileOutputStream.write(byteArray);  // Writing  data into file
      System.out.println("------------Data written into file--------------");
      System.out.println(msg);
      // -----------------------------Code to read data from file---------------------------------------------//
      // Creating input stream instance
      DataInputStream inst = new DataInputStream(input);
      int data = input.available();
      // Returns an estimate of the number of bytes that can be read from this input stream.
      byte[] byteArray2 = new byte[data]; //
      inst.read(byteArray2);
      String str = new String(byteArray2); // passing byte array into String constructor
      System.out.println("------------Data read from file--------------");
      System.out.println(str); // display file data
    }
    catch (Exception exception) {
      System.out.println(exception.getMessage());
    }

  }
}




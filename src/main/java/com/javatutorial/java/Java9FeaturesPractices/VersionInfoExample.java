package com.javatutorial.java.Java9FeaturesPractices;

public class VersionInfoExample {

  /*

  Java version-string is a format that contains version specific information. This version-string consists of major,
  minor, security and patch update releases.

  $MAJOR.$MINOR.$SECURITY.$PATCH

  $MAJOR
  This version number shows a major change in Java version. It increases when a major change occurs.
  Like Java 8 to Java 9. Each major release contains new features to the existing one.

  $MINOR
  This version number shows minor changes in Java version and increases with each minor update.
  These updates can be bug fixes, revision to standard API etc. if an update is released to Java 9,
  version-string format will be Java 9.1 (contains major and minor release number).

  $SECURITY
  This version number represents security update and increase for each new security update. Security updates can
  be critical fixes and security issues. If any security update is released to Java 9, the version-string format
  will be like: Java 9.1.5 (contains major, minor and security release number).

  $PATCH
  This version number increases for each security and high-priority customer fixes, which has been tested together.
  If a patch is released to Java 9, version-string format will be Java 9.1.5.1 (contains major, minor,
  security and patch release number).

  REPL -> Java Shell Tool -> Jshell

  It is an interactive Java Shell tool, it allows us to execute Java code from the shell and shows output immediately.
  JShell is a REPL (Read Evaluate Print Loop) tool and run from the command line.

  Advantages of JShell
  Jshell has reduced all the efforts that are required to run a Java program and test a business logic.

  If we don't use Jshell, creating of Java program involves the following steps.

  Open editor and write program
  Save the program
  Compile the program
  Edit if any compile time error
  Run the program
  Edit if any runtime error
  Repeat the process

  Jshell does not require above steps. We can evaluate statements, methods and classes, even can write hello program
  without creating class

  To start Jshell, first we must have installed Java 9 then open terminal in Linux or command prompt in windows and type
  terminal command : jshell -v

  jshell> System.out.println("hello");
  hello

  If we don't provide variable name, Java create implicit variable to store the value.
  These variables start with $ sign. We can use these variable by specifying implicit variable, as we did in the in the following screen-shot.

  jshell> 30
  $2 ==> 30
  |  created scratch variable $2 : int

  jshell> System.out.println($2);
  30

  jshell> void show(){
     ...> System.out.println("hello");
     ...> }
  |  created method show()

  jshell> show();
  hello

  jshell> class Hello{
     ...> void show(){
     ...> System.out.println("This is show method");
     ...> }
     ...> }
  |  created class Hello

  jshell> new Hello().show();
  This is show method

  Package Imports
  By default, 10 packages are imported and can also be imported any package by using import statement.

  jshell> import java.sql.*;

  Command /import to show all imported packages.
  Command /vars to show variables.
  To get all written source code, use /list

  Java Module System is a major change in Java 9 version. Java added this feature to collect Java packages and code i
  nto a single unit called module.

  In earlier versions of Java, there was no concept of module to create modular Java applications, that why size of
  application increased and difficult to move around. Even JDK itself was too heavy in size, in Java 8, rt.jar
  file size is around 64MB.

  To deal with situation, Java 9 restructured JDK into set of modules so that we can use only required module for our project.

  Apart from JDK, Java also allows us to create our own modules so that we can develop module based application.

  The module system includes various tools and options that are given below.

  Includes various options to the Java tools javac, jlink and java where we can specify module paths that locates to the location of module.

  Modular JAR file is introduced. This JAR contains module-info.class file in its root folder.

  JMOD format is introduced, which is a packaging format similar to JAR except it can include native code and configuration files.

  The JDK and JRE both are reconstructed to accommodate modules. It improves performance, security and maintainability.

  Java defines a new URI scheme for naming modules, classes and resources.


  Module is a collection of Java programs or softwares. To describe a module, a Java file module-info.java is required. This file also known as module descriptor and defines the following

  Module name
  What does it export
  What does it require

  It is a name of module and should follow the reverse-domain-pattern. Like we name packages, e.g. com.javatpoint.

  Creating Java module required the following steps.

  Create a directory structure
  Create a module declarator
  Java source code

  To create module, it is recommended to follow given directory structure, it is same as reverse-domain-pattern,
  we do to create packages / project-structure in Java.

  src
  -----com.javapoint
          --- Hello.java
  -----module-info.java

  Java 9 Control panel

  Java control panel is used to control Java applications that are embedded in browser.
  his control panel maintains the settings that manage Java application embedded in browser.

  In Java 9, control panel was rewritten as a JavaFX application and the storage location has changed.
  To start control panel, enter jcontrol to the terminal (cmd for windows)






   */

  public static void main(String[] args) {

    Runtime.Version version = Runtime.version();                 // Getting runtime version instance
    System.out.println("Current version is "+version);           // Getting current Java version
    System.out.println("Major version number "+version.major()); // Getting major version number
    System.out.println("Minor version number "+version.minor()); // Getting minor version number
    System.out.println("Security version number "+version.security());  // Getting security version number
    System.out.println("Pre-released information "+version.pre());      // Getting pre-release version information
    System.out.println("Build Number "+version.build());                // Getting Optional build number

  }

}

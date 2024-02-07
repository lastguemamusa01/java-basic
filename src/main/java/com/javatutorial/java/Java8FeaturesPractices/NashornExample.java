package com.javatutorial.java.Java8FeaturesPractices;

import javax.script.*;
import java.io.*;

public class NashornExample {

  /*
  Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine).
  Java provides a command-line tool jjs which is used to execute JavaScript code.

  You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.
   */

  public static void main(String[] args) throws Exception {
    /// Creating script engine
    ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
    // Reading Nashorn file
    ee.eval("print('Hello Nashorn');");
  }
}

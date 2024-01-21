package com.javatutorial.java.java8.JavaConversion;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


class Emp{}
public class ConversationPractice {

  /*

  String to an int in java using Integer.parseInt()
  String to Integer in java Integer.valueOf()
  int to String in java String.valueOf(), Integer.toString(), String.format()

  String to long in java    Long.parseLong()
  long to String in java using String.valueOf() and Long.toString()

  String to float in java using Float.parseFloat()
  float to String in java using String.valueOf() and Float.toString() methods.

  String to double in java using Double.parseDouble()
  double to String in java using String.valueOf() and Double.toString()

  String to char in java using charAt() method of String class.
  char to String in java using String.valueOf(char) method of String class and Character.toString(char)


  int to long in java using assignment operator. There is nothing to do extra because lower type can be converted to higher type implicitly.
  long to int in java using typecasting. To convert higher data type into lower, we need to perform typecasting.
  Long object to int by intValue() method of Long class

  int to double in java using assignment operator.
  double to int in java using typecasting

  String to Date in java using parse() method of DateFormat and SimpleDateFormat classes
  Date to String in java using format() method of java.text.DateFormat class.

  Convert String to Object in java with assignment operator. Each class is internally a child class of Object class.
  So you can assign string to Object directly.

  convert Object to String in java using toString() method of Object class or String.valueOf(object) method
  "Converting StringBuilder"

  char to int in java using various ways. If we direct assign char variable to int, it will return ASCII value of given character.
  int to char in java using typecasting.

  We can convert String to boolean in java using Boolean.parseBoolean(string) method.
  To convert String into Boolean object, we can use Boolean.valueOf(string) method which returns instance of Boolean class.
  boolean to String in java using String.valueOf(boolean) method.

  TimeStamp is from java.sql and Date is from java.util

  binary to decimal in java using Integer.parseInt()
  decimal to binary in java using Integer.toBinaryString()
  hexadecimal to decimal in java using Integer.parseInt()
   decimal to hexadecimal in java using Integer.toHexString()
   octal to decimal in java using Integer.parseInt()
   decimal to octal in java using Integer.toOctalString()

  */

  public static void main(String[] args) throws Exception {

    String s = "100";
    long l2 = 235235235325L; // L is suffix for long
    String f = "23.5";
    float f3 = 89.5f; // f is suffix for float
    double d2 = 35.46;
    String schar = "hello";
    char[] chArray = schar.toCharArray();
    char newchar= 'c';
    int i = 200;

    Emp emp = new Emp();
    long l6 = 500;
    Long l7 = new Long(10);

    // conversion from string to another format

    // int integer = Integer.parseInt(s);
    Integer integer = Integer.valueOf(s);
    // long l = Long.parseLong(s);
    long l = Long.valueOf(s);
    // float f2 = Float.parseFloat(f);
    float f2 = Float.valueOf(f);

    //double d = Double.parseDouble(f);
    double d = Double.valueOf(f);
    char chzero = schar.charAt(0);



    // convert other format to String

    String str = String.valueOf(integer); // use this
    // String str3 = String.format("%d",integer);
    // String str2 = Integer.toString(integer);
    // String str4 = Long.toString(l2);
    String str5 = String.valueOf(l2);
    //String str6 = Float.toString(f3);
    String str6 = String.valueOf(f3);
    //String str7 = Double.toString(d2);
    String str7 = String.valueOf(d2);
    String str8 = String.valueOf(newchar);
    // String str9 = emp.toString();
    String str9 = String.valueOf(emp);

    Object obj = schar;

    // conversion from other format to other format - int to long higher -  named implicit type casting or type promotion
    long l3 = i;
    // Long l4 = Long.valueOf(i);
    Long l5 = new Long(i);
    double d4 = i;
    Double d5 = new Double(i);

    //  conversion from other format to other format - long to int lower - type casting

    int i4 = (int)l6;
    int i5 = l7.intValue();


    int i6 = (int)d2;
    Double d6 = new Double(23.53);
    int i7 = d6.intValue();



    System.out.println(integer);
    System.out.println(str);
    System.out.println(l);
    System.out.println(str5);
    System.out.println(f2);
    System.out.println(str6);
    System.out.println(d);
    System.out.println(str7);
    System.out.println(chzero);

    for(char ch: chArray) {
      System.out.println(ch);
    }

    System.out.println(str8);
    System.out.println(obj);
    System.out.println(str9);


    System.out.println();
    System.out.println(l3);
    System.out.println(l5);
    System.out.println(i4);
    System.out.println(i5);
    System.out.println(d4);
    System.out.println(d5);
    System.out.println(i6);
    System.out.println(i7);

    // dates
    System.out.println();

    String sDate = "31/21/1987";
    Date date2 = Calendar.getInstance().getTime();

    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
    System.out.println(date);
    String strDate = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date2);
    System.out.println(strDate);

    System.out.println();

    Class c=Class.forName("java.lang.String");
    System.out.println("class name: "+c.getName());
    System.out.println("super class name: "+c.getSuperclass().getName());

    // Converting StringBuilder
    System.out.println();

    String helloS = "hello";
    StringBuilder strBdr = new StringBuilder(helloS);
    strBdr.reverse();
    String rev = String.valueOf(strBdr);
    System.out.println(rev);

    // char to int

    System.out.println();

    char cNum = '3';
    char cInt = 'c';
    int intC = cInt;
    System.out.println(intC);

    int intLiteral = Character.getNumericValue(cNum);
    System.out.println(intLiteral);

    int doubleConversion = Integer.valueOf(String.valueOf(cNum));
    System.out.println(doubleConversion);

    // int to char

    int numberC = 65;
    char cNumber = (char)numberC; // type scasting  - ASCII character

    System.out.println(cNumber);

    int REDIX = 10; // 10 is decimal, 16 hexadecimal
    int a10 = 1;
    char c10 = (char)(a10+'0'); // convert to character of number literal
    char c11 = Character.forDigit(a10, REDIX);
    System.out.print(c10);
    System.out.print(c11);


    // String to Boolean

    System.out.println();

    String sBol = "true";

    Boolean bol = Boolean.valueOf(sBol);

    System.out.println(bol);

    boolean bolbefore = true;

    String bolStr = String.valueOf(bolbefore);

    System.out.println(bolStr);


  // binary to decimal

    System.out.println();

    String binaryString="1010";
    int decimal=Integer.parseInt(binaryString,2);
    System.out.println(decimal);

    String hex="a";
    int decimal2=Integer.parseInt(hex,16);
    System.out.println(decimal2);

    String octalString="121";
    //Converting octal number into decimal
    int decimal3=Integer.parseInt(octalString,8);
    //Printing converted decimal number
    System.out.println(decimal3);


    System.out.println(Integer.toBinaryString(10));
    System.out.println(Integer.toHexString(10));
    System.out.println(Integer.toOctalString(8));

  }


}

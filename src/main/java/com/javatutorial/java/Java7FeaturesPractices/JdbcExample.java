package com.javatutorial.java.Java7FeaturesPractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.JdbcRowSet;

public class JdbcExample {


  /*

  JDBC (Java Database Connectivity) provides universal data access from the Java programming language.
  You can access any data from database, spreadsheets or flat files by using JDBC.

  In Java 7, Java has introduced the following features:

  1) It provides the ability to use a try-with-resources statement to automatically close resources of
  type Connection, ResultSet, and Statement.

  2) RowSet 1.1: The introduction of the RowSetFactory interface and the RowSetProvider class, which enable you
  to create all types of row sets supported by your JDBC driver.

  RowSetFactory interface

  It creates a new instance of a CachedRowSet. It throws SQLException, if a CachedRowSet cannot be created.
	It creates a new instance of a FilteredRowSet. It throws SQLException, if a FilteredRowSet cannot be created.
	It creates a new instance of a JdbcRowSet. It throws SQLException, if a JdbcRowSet cannot be created.
  It creates a new instance of a JoinRowSet. It throws SQLException, if a JoinRowSet cannot be created.
	It creates a new instance of a WebRowSet. It throws SQLException, if a WebRowSet cannot be created.

  RowSetProvider class

   Java CachedRowSet - It stores (caches) data into memory so that is can perform operations on its own data
   rather than data stored in the database. It can

   Java JdbcRowSet - It is an improvedResultSet object which is used to maintain connection to a data source.
   It is similar to ResultSet, but the big difference is that it provides set of properties and listener like
   a JavaBeans.The main purpose of JdbcRowSet is to make a ResultSet scrollable and updatable.


   */

  public static void main(String[] args) {

    try(// --------------try-with-resources begin-------------//
        // Creating connection
        Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student","root","mysql");
        // Creating statement
        Statement stmt=con.createStatement();
        // Executing Sql query
        ResultSet rs=stmt.executeQuery("select * from user");
    )// --------------try-with-resources end--------------//
    { // ----------------try block begin---------------------//
      // Creating CachedRowSet
      CachedRowSet cRS = RowSetProvider.newFactory().createCachedRowSet();
      // Populating ResultSet data into CachedRowSet
      cRS.populate(rs);
      // Iterating ResultSet elements
      while(rs.next()){
        System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
      }
    } // ----------------try block end----------------------//
    catch(Exception e){ // Exception handler
      System.out.println(e.getMessage());
    }

    try(// --------------try-with-resources begin-------------//
        // Creating connection
        JdbcRowSet jRS = RowSetProvider.newFactory().createJdbcRowSet();
    )// --------------try-with-resources end--------------//
    { // ----------------try block begin---------------------//
      // Set database connection
      jRS.setUrl("jdbc:mysql://localhost:3306/student");
      // Set database username
      jRS.setUsername("root");
      // Set database password
      jRS.setPassword("mysql");
      // Set sql query to execute
      jRS.setCommand("select * from user");
      // Execute query
      jRS.execute();
      while(jRS.next()){
        System.out.println(jRS.getInt(1)+""+jRS.getString(2)+""+jRS.getString(3));
      }
      // Getting 3rd row because it is scrollable by default
      jRS.absolute(3);
      System.out.println(jRS.getInt(1)+""+jRS.getString(2)+""+jRS.getString(3));
      // Updating 3rd row
      jRS.updateString("name", "Neraj Kumar Singh");
      jRS.updateRow();
      // Fetching 3rd row again
      System.out.println(jRS.getInt(1)+""+jRS.getString(2)+""+jRS.getString(3));
    } // ----------------try block end----------------------//
    catch(Exception e){ // Exception handler
      System.out.println(e);
    }

  }

}

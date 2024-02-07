package com.javatutorial.java.Java8FeaturesPractices;
import java.sql.*;


// implementing DriverAction interface
public class JdbcExample  implements DriverAction {

  /*

  1) The JDBC-ODBC Bridge has been removed.

  Oracle does not support the JDBC-ODBC Bridge. Oracle recommends that you use JDBC drivers provided by the
  vendor of your database instead of the JDBC-ODBC Bridge.

  Java JDBC 4.2 introduces the following features:

  Addition of REF_CURSOR support.
  Addition of java.sql.DriverAction Interface
  Addition of security check on deregisterDriver Method in DriverManager Class
  Addition of the java.sql.SQLType Interface
  Addition of the java.sql.JDBCType Enum
  Add Support for large update counts
  Changes to the existing interfaces
  Rowset 1.2: Lists the enhancements for JDBC RowSet.

   */

  @Override
  public void deregister() {
    System.out.println("Driver deregistered");
  }

  public static void main(String[] args) {

    try{
      // Creating driver instance
      Driver driver = new com.mysql.jdbc.Driver();
      // Creating Action Driver
      DriverAction da = new JdbcExample();
      // Registering driver by passing driver and driverAction
      DriverManager.registerDriver(driver, da);
      // Creating connection
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");
      //Here student is database name, root is username and password is mysql
      Statement stmt=con.createStatement();
      // Executing SQL query
      ResultSet rs=stmt.executeQuery("select * from user");
      while(rs.next()){
        System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
      }
      // Closing connection
      con.close();
      // Calling deregisterDriver method
      DriverManager.deregisterDriver(driver);
    }catch(Exception e){
      System.out.println(e);
    }


  }


}

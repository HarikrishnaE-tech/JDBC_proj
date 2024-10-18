package jdbc;

import java.sql.*;

public class Insertion {
public static void main(String[] args) throws SQLException {
	Driver driver = new com.mysql.cj.jdbc.Driver();
    DriverManager.registerDriver(driver);
	
  Connection conn=  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/insertion","root","HAri7510@");
  
  Statement stat=conn.createStatement();
  String query = "INSERT INTO student VALUES (2, 'raj', 22, 150),(3,'rohit',23,250),(4,'raj',26,140),(5,'kiran',21,150)";
  int executeUpdate=stat.executeUpdate(query);
  
    if(executeUpdate>0) {
    	System.out.println("insertion successful");
    }
    		else {
    	
    	System.out.println("unsuccessful");	
    	
    }
    conn.close();
}
}

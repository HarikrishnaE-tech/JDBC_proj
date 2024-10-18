package jdbc;
import java.sql.*;
public class Updation {
public static void main(String[] args) throws SQLException {
	Driver driver=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/insertion","root","HAri7510@");
	Statement state=conn.createStatement();
	String query="Update student set stdage=30 where stdid=3";
	int executeupdate =state.executeUpdate(query);
	
	if(executeupdate>0) {
		System.out.println("successs");
	}
	else {
		System.out.println("unsuccessful");
	}
	conn.close();
}
}



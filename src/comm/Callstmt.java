package comm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callstmt {
  public static void main(String[] args) throws SQLException {
	  Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo_insert","root","HAri7510@");
		CallableStatement call=conn.prepareCall("call retrieve()");
		System.out.println("hai");
		ResultSet eq = call.executeQuery();
		while(eq.next()) {
			System.out.println(eq.getString(1));
			System.out.println(eq.getInt(2));
			System.out.println(eq.getInt(3));
		}
}
}

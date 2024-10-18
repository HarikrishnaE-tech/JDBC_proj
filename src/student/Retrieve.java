package student;
import java.sql.*;
public class Retrieve {
public static void main(String[] args) throws SQLException {
	Driver driver=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","HAri7510@");
	String retrieve_sql ="Select * from stud where  std=?";
	
	PreparedStatement psmt=conn.prepareStatement(retrieve_sql);
	psmt.setInt(1,28);
	
	
	ResultSet rs= psmt.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
	}
}
}

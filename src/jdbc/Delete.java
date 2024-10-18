package jdbc;
import java.sql.*;
public class Delete {
public static void main(String[] args) throws SQLException {
	Driver driver =new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/insertion","root","HAri7510@");
	Statement state=conn.createStatement();
	String query="Delete from Student where Stdid=1";
	int execute=state.executeUpdate(query);
	
	if(execute>0) {
		System.out.println("success");
	}
	else {
		System.out.println("unsuccess");
	}
	conn.close();
}
}

package student;
import java.sql.*;

public class Main {


public static void main(String[] args) throws SQLException {
	 final String INSERT_SQL = "INSERT INTO stud (std, stdname, stdage) VALUES (?, ?, ?)";

	Driver driver=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","HAri7510@");
	Student student=new Student(2,"hari",28);
	
	PreparedStatement pstmt = conn.prepareStatement( INSERT_SQL);
	 
			 pstmt.setInt(1,student.getStdid());
			 pstmt.setString(2,student.getStdname());
			 pstmt.setInt(3,student.getStdage());
			 
	int execute=pstmt.executeUpdate();
	if(execute>0) {
		System.out.println("success");
	}else {
		System.out.println("not success");
	}
pstmt.close();	
conn.close();
 

}
}

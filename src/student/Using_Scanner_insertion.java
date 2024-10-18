package student;
import java.sql.*;
import java.util.Scanner;

public class Using_Scanner_insertion {
public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println("-------------------MENU-------------------");
	System.out.println("Enter the name:");
	String name=sc.next();
	System.out.println("Enter the age:");
	int age=sc.nextInt();
	System.out.println("Enter thr mark");
	int mark=sc.nextInt();
	System.out.println("------------------------------------------");

	
	Driver D=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(D);
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo_insert","root","HAri7510@");
	String insert="Insert into student(stdname,stdage,stdmark)values(?,?,?)";
	
	PreparedStatement pstmt=conn.prepareStatement(insert);
	pstmt.setString(1, name);
	pstmt.setInt(2, age);
	pstmt.setInt(3, mark);
	
	int execute=pstmt.executeUpdate();
	if(execute>0) {
		System.out.println("success");
	}
	else {
		System.out.println("no succes");
	}
	pstmt.close();
	conn.close();
	
}
}

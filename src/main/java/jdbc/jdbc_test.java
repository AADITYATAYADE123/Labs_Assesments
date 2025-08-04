package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//2a
	String url = "jdbc:mysql://localhost:3306/Feb18",
	user = "root" , pass = "root";
	
	//2b
	Connection con = DriverManager.getConnection(url, user, pass);
	
	//3 create statement
	Statement st = con.createStatement();

System.out.println("connected");
}
}
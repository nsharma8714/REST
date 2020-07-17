package TestScripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseTesting {
  @Test
  public void testDB() throws ClassNotFoundException, SQLException {
	  
	 Class.forName("com.mysql.jdbc.Driver");
	 System.out.println("driver loaded");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1qazxcvbnm");
	 System.out.println("driver connected");
	 Statement stm = con.createStatement();
	 ResultSet rs = stm.executeQuery("Select* from emplyoee");
	 while(rs.next())
	 {
		 
		String empid= rs.getNString("empid");
		 System.out.println("print"+ empid);
	 } 
		 
		 
		
  }
}

//Program to delete record from the table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLPreparedStatementDelete{
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr","root","root");  
			
			PreparedStatement stmt = con.prepareStatement("delete from pqrs1 where emailid =?");
			stmt.setString(5," pqr@gmail.com ");
					
			int i = stmt.executeUpdate();
			System.out.println(i + "Records deleted");
			con.close();  
		}
		catch(Exception e){ 
			System.out.println(e);
		}  }  }

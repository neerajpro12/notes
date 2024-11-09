//Program to insert new record into the table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLPreparedStatementInsert{
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr","root","root");  
			
	PreparedStatement stmt = con.prepareStatement("insert into pqrs1 values (?,?,?)");
			stmt.setString(1,"5");
			stmt.setString(2,"pqr@gmail.com");
			stmt.setString(3,"Baramati");
			//stmt.setString(4, "India");
			//stmt.setString(4,"India");
			int i = stmt.executeUpdate();
			System.out.println(i + "Records inserted..");
			con.close();  
		}
		catch(Exception e){ 
			System.out.println(e);
		}  

	}
	
}

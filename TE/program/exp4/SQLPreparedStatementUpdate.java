//Program to update any field of the record
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLPreparedStatementUpdate{
	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr","root","root");  
			
        PreparedStatement stmt = con.prepareStatement("update pqrs1 set  user=? where emailid=? ");
                        stmt.setString(1,"5");			
                        stmt.setString(2,"santosh@gmail.com");
			
			int i = stmt.executeUpdate();
			System.out.println(i + "Records updated");
			con.close();  
		}
		catch(Exception e){ 
			System.out.println(e);
		}  

	}

}

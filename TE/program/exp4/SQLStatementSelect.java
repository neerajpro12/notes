import java.sql.*;
// User class 
public class SQLStatementSelect{ 
public static void main(String args[]){ 
try{ 
Class.forName("com.mysql.jdbc.Driver"); // register the driver class 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pqr?characterEncoding=latin1","root","root"); 
Statement stmt=con.createStatement(); 
ResultSet rs=stmt.executeQuery("select * from pqrs1"); 
while(rs.next()) 
//System.out.println("Success");
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
con.close(); 
}catch(Exception e){ 
System.out.println(e);} 
} 
} 

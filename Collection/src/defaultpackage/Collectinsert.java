package defaultpackage;
import java.sql.*;
public class Collectinsert {
	public static void main(String[]args)throws Exception{
		insert();
	}
	public static void insert() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/collection";
	    String username ="root";
	    String password="0525";
	    String Query="insert into jp values(?,?,?,?,?)";
	    Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 1);
		pst.setString(2, "Jayaprathab");
		pst.setString(3, "iphone");
		pst.setLong(4, 9360294895l);
		pst.setString(5, "abcd0525@gmail.com");
		
		pst.setInt(1, 2);
		pst.setString(2, "Jeni");
		pst.setString(3, "iphone");
		pst.setLong(4, 9360294895l);
		pst.setString(5, "abcd0525@gmail.com");
		
		
		
		pst.executeUpdate();
		con.close();
	}
}

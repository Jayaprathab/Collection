package defaultpackage;
import java.sql.*;
public class Collectupdate {
	public static void main(String[]args)throws Exception{
		update();
	}
	public static void update() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/collection";
	    String username ="root";
	    String password="0525";
	    String Query="update jp set name='jenifer ' where id=2";
	    Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();

		con.close();

}
}
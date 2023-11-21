package defaultpackage;
import java.sql.*;
public class Collectget {
		public static void main(String[]args)throws Exception{
			get();
		}
		public static void get() throws Exception{
			String url="jdbc:mysql://127.0.0.1:3306/collection";
		    String username ="root";
		    String password="0525";
		    String Query="select * from jp";
		    Connection con=DriverManager.getConnection(url, username, password);
		    Statement st =con.createStatement();
			ResultSet rs=st.executeQuery(Query);
			while(rs.next()) {
				System.out.println("Id is:"+rs.getInt(1));
				System.out.println("name is:"+rs.getString(2));
				System.out.println("Product is:"+rs.getString(3));
				System.out.println("Phoneno is:"+rs.getLong(4));
				System.out.println("mail is:"+rs.getString(5));
			}
		}
}

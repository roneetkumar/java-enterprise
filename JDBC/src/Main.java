import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import com.project.models.User;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				 Connection conn = null;
		        try {
		            String url = "jdbc:mysql://localhost/project";
		            String username = "root";
		            String password = "";
		            // create a connection to the database
		            conn = DriverManager.getConnection(url,username,password);
		            System.out.println("Connection to SQLite has been established.");
		            
		        } catch (SQLException e) {
		            System.out.println(e.getMessage());
		        } 
		        System.out.println(conn);

	}
}

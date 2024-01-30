package connectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory
{
	public static Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/chey";
		String user="root";
		String pswd="root";
		return DriverManager.getConnection(url, user, pswd);
	}

}

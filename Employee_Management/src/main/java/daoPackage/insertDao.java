package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionPackage.ConnectionFactory;

public class insertDao 
{
	public static int getinsertdata(String name,String id,String department,String phnnum,String salary) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement("INSERT INTO EMPLOYEEDETAILS VALUES(?,?,?,?,?)");
		
		pst.setString(1, name);
		pst.setString(2, id);
		pst.setString(3, department);
		pst.setString(4, phnnum);
		pst.setString(5, salary);
		return pst.executeUpdate();
	}
}

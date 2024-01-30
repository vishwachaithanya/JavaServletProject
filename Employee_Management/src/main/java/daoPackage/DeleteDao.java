package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionPackage.ConnectionFactory;

public class DeleteDao 
{
	public static int getDeletedata(String id) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement("DELETE FROM EMPLOYEEDETAILS WHERE EMPID=?");
		
		pst.setString(1, id);
		return pst.executeUpdate();
	}

}

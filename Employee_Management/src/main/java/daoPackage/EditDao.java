package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectionPackage.ConnectionFactory;

public class EditDao
{
	public static ResultSet EditData(String id) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement("SELECT * FROM EMPLOYEEDETAILS WHERE EMPID=?");
		pst.setString(1, id);
		return pst.executeQuery();
		
	}

}

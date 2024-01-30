package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectionPackage.ConnectionFactory;

public class DisplayDao 
{
	public static ResultSet DisplayData() throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement("SELECT * FROM EMPLOYEEDETAILS");
		return pst.executeQuery();
		
	}

}

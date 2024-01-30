package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectionPackage.ConnectionFactory;
public class EmpDao 
{
	public static ResultSet getData(String username,String id) throws ClassNotFoundException, SQLException 
	{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement("SELECT * FROM EMPLOYEEDETAILS WHERE EMPNAME=? AND EMPID=?");
		pst.setString(1, username);
		pst.setString(2, id);
		
		return pst.executeQuery();
		
	}

}

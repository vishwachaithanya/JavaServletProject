package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectionPackage.ConnectionFactory;

public class UpdateDao 
{
	public static int getupdatedata(String username,String id,String department,String phnnum,String salary) throws ClassNotFoundException, SQLException
	{
		Connection con=ConnectionFactory.getconnection();
		PreparedStatement pst=con.prepareStatement("UPDATE EMPLOYEEDETAILS SET EMPNAME=?,EMPDEPARTMENT=?,EMPPHN=?,EMPSALARY=? WHERE EMPID=?");
		pst.setString(1, username);
		pst.setString(2, department);
		pst.setString(3, phnnum);
		pst.setString(4, salary);
		pst.setString(5, id);
		return pst.executeUpdate();
	}

}

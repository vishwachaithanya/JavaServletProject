package managerPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.EditDao;

@WebServlet("/Edit")
public class EditServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			ResultSet rs=EditDao.EditData(id);
			if(rs.next())
			{
				out.println("<body style=' background-image:url(ss.jpg)'>"
						+ "<center>"
						+ "<fieldset style='width:30%;text-align:center;position:relative; margin-top:200px;margin-left:50px';>"
						+ "<h2 style='color:brown'>Updating The Employee Details:</h2>"
						+ "<form action='update' method='post'>"
						+ "<table style='font-size:18px'>"
						+ "<tr><td>Empname:</td>"
						+ "<td><input type='text' name='username' value="+rs.getString(1)+"></td></tr>"
						+ "<tr><td>EmpId:</td>"
					    + "<td><input type='text'  name='id' value="+rs.getString(2)+"></td></tr>"
					    + "<tr><td>EmpDepartment:</td>"
					    + "<td><input type='text'  name='department' value="+rs.getString(3)+"></td></tr>"
					    + "<tr><td>EmpPhn:</td>"
					    + "<td><input type='text' name='phnnum' value="+rs.getString(4)+"></td></tr>"
					    + "<tr><td>Empsalary:</td>"
					    + "<td><input type='text'  name='salary' value="+rs.getString(5)+"></td></tr>"
					    + "<tr align='center'><td><input type='submit' style='color:white;background-color:#1e90ff;margin-top:8px;font-size:18px;' value='update'></td></tr>"
					    + "</table></form></fieldset></center></body>");
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}

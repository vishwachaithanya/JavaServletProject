 package managerPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.UpdateDao;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String id=request.getParameter("id");
		String department=request.getParameter("department");
		String phnnum=request.getParameter("phnnum");
		String salary=request.getParameter("salary");
		try {
			int rows=UpdateDao.getupdatedata(username, id, department, phnnum, salary);
			if(rows>0)
			{
				out.println("<body><center>"
						+ "<fieldset style='width:30%;text-align:center;background-color:white;position:relative; margin-top:200px;margin-left:50px';>"
						+ "<h2>Updated Successfully</h2>"
						+ "<a href='EmpDisplay'><button style='color:white;background-color:#1e90ff';>Back</button></a>"
						+ "<a href='index.jsp'><button style='color:white;background-color:black;margin-left:10px;'>Home</button></a>"
						+ "</fieldset></center></body>");
				
			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}

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

import daoPackage.DisplayDao;

public class EmpDisplay extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			ResultSet rs=DisplayDao.DisplayData();
			out.println("<htmL>"
					+ "<body style='background-image:url(ss.jpg);'>"
					+ "<h1 align='center' style='color:brown'>Employee Details<h1>"
					+ "<a href='insert'><button style='background-color:green;color:white;margin-left:85px;font-size:20px'>AddEmployee</button></a>"
					+ "<br><br>"
					+ "<table align='center' border style='border-collapse:collapse;width:100%;height:50%;font-size:25px'>"
					+ "<tr>"
					+ "<th>EmpName</th>"
					+ "<th>Empid</th>"
					+ "<th>EmpDepartment</th>"
					+ "<th>EmpPhnNum</th>"
					+ "<th>EmpSalary</th>"
					+ "<th>Edit</th>"
					+ "<th>Delete</th>"
					+ "</tr>");
			while(rs.next())
			{
				out.println("<tr  align='center'>"
						+ "<td>"+rs.getString(1)+"</td>"
						+"<td>"+rs.getString(2)+"</td>"
					    + "<td> "+rs.getString(3)+"</td>"
						+"<td>"+rs.getString(4)+"</td>"
						+ "<td>"+rs.getString(5)+"</td>"
						+ "<td><a href='Edit?id="+rs.getString(2)+"'>Edit</a></td>"
						+ "<td><a href='Delete?id="+rs.getString(2)+"'>Delete</a></td>"
						+ "</tr>"
						
						);
				
			}
			out.println("</body>"
					+ "</html>");
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}

	

}

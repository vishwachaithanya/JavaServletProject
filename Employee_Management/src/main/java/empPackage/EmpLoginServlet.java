package empPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.EmpDao;



@WebServlet("/elogin")
public class EmpLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username= request.getParameter("username");
		String id=request.getParameter("id");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		

		try 
		{
			ResultSet rs=EmpDao.getData(username, id);
			if(rs.next())
			{
				out.println("<body style='background-image:url(ss.jpg)'>"
						+ "<h2 align='center' style='color:brown'>Details of "+username+"</h2><br>"
						+ "<table border style='border-collapse:collapse;width:100%;font-size:25px'>"
						+ "<tr>"
						+ "<th>EmpName</th>"
						+ "<th>Empid</th>"
						+ "<th>Empdept</th>"
						+ "<th>Empphn</th>"
						+ "<th>Empsal</th>"
						+ "</tr>"
						+ "<tr align='center'> "
						+ "<td>"+rs.getString(1)+"</td>"
						+ "<td>"+rs.getString(2)+"</td>"
						+ "<td>"+rs.getString(3)+"</td>"
						+ "<td>"+rs.getString(4)+"</td>"
						+ "<td>"+rs.getString(5)+"</td>"
						+ "</tr>"
						+ "</table>"
						+ "<br>"
						+ "<center><a href='index.jsp'><button style='color:white;background-color:#1e90ff;font-size:18px'>Home</button></a></center>"
						+ "</body>");
				
			}
			else
			{
				out.println("invalid crededentials");
				RequestDispatcher rd=request.getRequestDispatcher("EmpLogin.html");
				rd.include(request, response);
				
			}
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	
	

}

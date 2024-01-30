package managerPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import daoPackage.MngDao;
@WebServlet("/mlogin")
public class ManagerLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String id=request.getParameter("id");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			ResultSet rs=MngDao.getMngdata(username, id);
			if(rs.next())
			{
				RequestDispatcher rd=request.getRequestDispatcher("EmpDisplay");
				rd.forward(request, response);
			}
			else {
				out.println("PLEASE TRY AGAIN");
				RequestDispatcher rd=request.getRequestDispatcher("ManagerLogin.html");
				rd.include(request, response);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}

}

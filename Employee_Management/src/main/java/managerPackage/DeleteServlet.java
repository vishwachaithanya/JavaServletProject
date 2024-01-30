package managerPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.DeleteDao;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		try {
			int rows=DeleteDao.getDeletedata(id);
			out.println("<body><center>"
					+ "<fieldset style='width:30%;text-align:center;background-color:white;position:relative; margin-top:200px;margin-left:50px';>"
					+ "<h2>Deleted Successfully</h2>"
					+ "<a href='EmpDisplay'><button style='color:white;background-color:#1e90ff';>Back</button></a>"
					+ "<a href='index.jsp'><button style='color:white;background-color:black;margin-left:10px;'>Home</button></a>"
					+ "</fieldset></center></body>");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

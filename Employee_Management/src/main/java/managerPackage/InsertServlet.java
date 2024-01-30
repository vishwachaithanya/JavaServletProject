package managerPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body style='background-image:url(ss.jpg);'>"
				+ "<center>"
				+ "<fieldset style='width:30%;position:relative;margin-top:200px;margin-left:50px;'>"
				+ "<h2>Adding the Employee:<h2><br>"
				+ "<form action='addemploy' method='post'>"
				+ "<table style='font-size:18px'>"
				+ "<tr>"
				+ "<td>Empname:</td>"
				+ "<td><input type='text' name='username'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>EmpId:</td>"
			    + "<td><input type='text' name='id' ></td>"
			    + "</tr>"
			    + "<tr>"
			    + "<td>EmpDepartment:</td>"
			    + "<td><input type='text' name='department'></td>"
			    + "</tr>"
			    + "<tr>"
			    + "<td>EmpPhn:</td>"
			    + "<td><input type='text' name='phnnum' ></td>"
			    + "</tr>"
			    + "<tr>"
			    + "<td>EmpSalary:</td>"
			    + "<td><input type='text' name='salary' ></td>"
			    + "</tr>"
			    + "<tr>"
			    + "<td><input type='submit'style=color:white;background-color:#1e90ff;margin-top:10px;font-size:17px value='insert'></td>"
			    + "<td><input type='reset' style=color:white;background-color:black;margin-left:10px;margin-top:10px;font-size:17px  value='cancel'></td>"
			    + "</tr></table>"
			    + "</form>"
			    + "</fieldset>"
			    + "</center>"
			    + "</body>");

	}

}

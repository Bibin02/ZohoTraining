import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/calculate_emp_salary")
public class T1Q2 extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		PrintWriter out = res.getWriter();
		
		int a = Integer.parseInt(req.getParameter("bs"));
		int b = Integer.parseInt(req.getParameter("role"));
		int c = Integer.parseInt(req.getParameter("ded"));
		
		c = a + (a/10)*b - (c*500);
		
		out.println("Calculated Employee Formula (bs > 10K) : bs + (bs/10)*role - (ded*500) ");
		out.println("Calculated Employee Salary : "+c);
	}
}
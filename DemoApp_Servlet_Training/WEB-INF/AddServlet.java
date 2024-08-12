import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		int a = 10;
		int b = 20;
		
		int c = a + b;
		
		PrintWriter out = res.getWriter();
		
		out.println("Addition Result : "+c);
		
		a = Integer.parseInt(req.getParameter("num1"));
		b = Integer.parseInt(req.getParameter("num2"));
		
		c = a + b;
		
		out.println("Input Addition Result : "+c);
	}
}
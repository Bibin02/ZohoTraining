import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class T1Q1 extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		out.println("<DOCTYPE html><head><title>Print Programmer</title></head><body>");
		
		out.println("<p>HI I'M A PROGRAMMER</p>");
		
		out.println("</body></html>");
		
	}
}
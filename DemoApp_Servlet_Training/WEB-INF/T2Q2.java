import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/calculate_percentage")
public class T2Q2 extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/plain");
		
		String[] Smarks = req.getParameter("marks").split(" ");
		int total = 1, sum = 0;
		
		out.println("Marks Obtained by Student Name : "+req.getParameter("name"));
		out.println("Marks Obtained by Student Class : "+req.getParameter("class"));
		
		for(String mark : Smarks){
			sum += Integer.parseInt(mark);
			out.println("Marks for Subject "+total+" : "+mark);
			total += 1;
		}
		
		out.println("Total Marks Obtained by Student : "+sum);
		out.println("Percentage Marks Obtained by Student : "+((float)(sum/(total-1))));
		
		
		
	}
}
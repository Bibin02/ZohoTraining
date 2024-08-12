import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/gen_form")
public class T2Q1 extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		File file = new File(getServletContext().getRealPath("/Form.html"));
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		PrintWriter out = res.getWriter();
		
		String line = br.readLine();
		while(line != null){
			out.println(line);
			line = br.readLine();
		}
		
		br.close();
		
	}
}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Controller")
public class T2Q3 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		// This Servlet acts as a Controler Part (MVC)
		
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String mail = req.getParameter("mail");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String deg = req.getParameter("deg");
		String clg = req.getParameter("clg");
		String exp = req.getParameter("exp");
		String skills = req.getParameter("skills");
		
		if (Integer.parseInt(age) < 0){
			PrintWriter out = res.getWriter();
			out.println("Age must be Positive");
		}
		else{
			
			req.setAttribute("name",name);
			req.setAttribute("phone",phone);
			req.setAttribute("mail",mail);
			req.setAttribute("gender",gender);
			req.setAttribute("age",age);
			req.setAttribute("deg",deg);
			req.setAttribute("clg",clg);
			req.setAttribute("exp",exp);
			req.setAttribute("skills",skills);
			
			req.getRequestDispatcher("./T2Q3.jsp").forward(req, res);
		}
		
	}
}
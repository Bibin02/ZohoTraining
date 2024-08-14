import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/UserValidator")
public class T3Q3 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		if (req.getParameter("logout") != null){
			HttpSession session = req.getSession();
			session.removeAttribute("name");
			res.sendRedirect("T3Q3login.jsp");
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		if (name.equals("admin") && pass.equals("123")){
			HttpSession session = req.getSession();
			
			session.setAttribute("name", "ADMIN");
			
			res.sendRedirect("T3Q3welcome.jsp");
		}
		else{
			res.sendRedirect("T3Q3login.jsp");
		}
	}
}
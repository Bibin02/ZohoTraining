import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/t2q4_control")
public class T2Q4 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		// This Servlet acts as a Controler Part (MVC)
		
		int pgno = Integer.parseInt(req.getParameter("pgno"));
		
		StdDAO sdao = new StdDAO();
		
		List<Student> students = sdao.getStudents(pgno);
		
		req.setAttribute("students",students);
		
		req.getRequestDispatcher("/T2Q4.jsp").forward(req, res);
		
		
	}
}
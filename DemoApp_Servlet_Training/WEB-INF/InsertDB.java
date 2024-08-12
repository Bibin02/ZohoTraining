import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;

@WebServlet("/crud_insert")
public class InsertDB extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		Connection con = (Connection)req.getAttribute("dbconnection");
		int eno = Integer.parseInt(req.getParameter("eno"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String address = req.getParameter("address");
		int pno = Integer.parseInt(req.getParameter("ph"));
		
		PrintWriter out = res.getWriter();
		
		try{
			insertDB(con, eno, name, age, address, pno);
			out.println("<!DOCTYPE html><body><p> Elements Inserted Sucessfully </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
			
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			out.println("<!DOCTYPE html><body><p> Error Happened </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
		}
		
	}
	
	void insertDB(Connection con, int emp_no, String emp_name, int emp_age, String emp_address, int emp_phone) throws SQLException{
		
		String query = "insert into empdetails values (?, ?, ?, ?, ?)";
		PreparedStatement psmt = con.prepareStatement(query);
		
		psmt.setInt(1, emp_no);
		psmt.setString(2, emp_name);
		psmt.setInt(3, emp_age);
		psmt.setString(4, emp_address);
		psmt.setInt(5, emp_phone);
		
		psmt.executeUpdate();
	}
}


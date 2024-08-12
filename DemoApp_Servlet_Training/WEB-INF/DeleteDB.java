import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;

@WebServlet("/crud_delete")
public class DeleteDB extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		Connection con = (Connection)req.getAttribute("dbconnection");
		String col = req.getParameter("column");
		String val = req.getParameter("value");
		
		PrintWriter out = res.getWriter();
		
		try{
			int affected = updateDB(con, col, val);
			out.println("<!DOCTYPE html><body><p>"+affected+" Elements Delete Sucessfully </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
			
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			out.println("<!DOCTYPE html><body><p> Error Happened </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
		}
		
	}
	
	int updateDB(Connection con, String col, String val) throws SQLException{
		
		String query = "delete from empdetails where "+col+" = ?";
		
		PreparedStatement psmt = con.prepareStatement(query);
		
		psmt.setString(1, val);
		
		int affected = psmt.executeUpdate();
		return affected;
	}
}


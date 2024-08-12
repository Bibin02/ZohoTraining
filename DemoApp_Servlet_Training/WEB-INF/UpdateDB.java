import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;

@WebServlet("/crud_update")
public class UpdateDB extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		Connection con = (Connection)req.getAttribute("dbconnection");
		String col1 = req.getParameter("column1");
		String val1 = req.getParameter("value1");
		String col2 = req.getParameter("column2");
		String val2 = req.getParameter("value2");
		
		PrintWriter out = res.getWriter();
		
		try{
			int affected = updateDB(con, col1, val1, col2, val2);
			out.println("<!DOCTYPE html><body><p>"+affected+" Elements Updated Sucessfully </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
			
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
			out.println("<!DOCTYPE html><body><p> Error Happened </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
		}
		
	}
	
	int updateDB(Connection con, String col1, String val1, String col2, String val2) throws SQLException{
		
		String query = "update empdetails set "+col1+" = ? where "+col2+" = ?";
		
		PreparedStatement psmt = con.prepareStatement(query);
		
		psmt.setString(1, val1);
		psmt.setString(2, val2);
		
		int affected = psmt.executeUpdate();
		return affected;
	}
}


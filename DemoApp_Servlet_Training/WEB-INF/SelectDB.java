import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;

@WebServlet("/crud_select")
public class SelectDB extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		Connection con = (Connection)req.getAttribute("dbconnection");
		
		PrintWriter out = res.getWriter();
		
		try{
			selectDB(con, out);
		}
		catch(SQLException e){
			out.println("<!DOCTYPE html><body><p> Error Happened </p>");
			out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
		}
		
	}
	
	void selectDB(Connection con, PrintWriter out) throws SQLException{
		
		String query = "select * from empdetails";
		
		PreparedStatement psmt = con.prepareStatement(query);

		ResultSet rs = psmt.executeQuery();
		
		out.println("<!DOCTYPE html><body><table border=1>");
		
		// Table Heading.
		out.println("<tr> <th>emp_no</th>  <th>emp_name</th>  <th>emp_age</th>  <th>emp_address</th> <th>emp_phone</th> </tr> ");
		
		while (rs.next()) {
			out.println("<tr> <td>"+rs.getInt(1) +"</td><td> "+ rs.getString(2) +"</td><td> "+ rs.getInt(3) +"</td><td> "+ rs.getString(4) +"</td> <td>"+ rs.getInt(5)+"</td></tr>");
		}
		
		out.println("<a href=\"CRUD_index.html\"> <- Back </a></body></html>");
	}
}


import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;

@WebServlet("/crud_op")
public class T3Q1 extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		//creating ServletContext object  
		ServletContext context = getServletContext();  
		  
		//Getting the value of the initialization parameters
		String url = context.getInitParameter("EmpDatabaseURL");  
		String user = context.getInitParameter("username");  
		String pass = context.getInitParameter("password"); 
		
		Connection con = establishCon(url, user, pass);
		
		req.setAttribute("dbconnection",con);
		
		switch(req.getParameter("op")){
			case "ins" -> {
				req.getRequestDispatcher("/crud_insert").include(req, res);
			}
			
			case "upd" -> {
				req.getRequestDispatcher("/crud_update").include(req, res);
			}
			
			case "del" -> {
				req.getRequestDispatcher("/crud_delete").include(req, res);
			}
			
			case "sel" -> {
				req.getRequestDispatcher("/crud_select").include(req, res);
			}
			
		}
		
		req.setAttribute("dbconnection",null);
		closeCon(con);
	}
	
	static Connection establishCon(String url, String user, String pass){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,pass);
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
	
	static void closeCon(Connection con){
        try {
            con.close();
        } 
        catch (SQLException e) {
            System.out.println("Could'nt Close Connection");
        }
    }
	
}
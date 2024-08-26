import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UpdateUserDB")
public class Signup extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        String uname = req.getParameter("username").toString();
        String pass = req.getParameter("password").toString();
        
        try{
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:8000/peoplemgmt", "postgres", "root");
            String insertquery = "insert into users values(?,?)";

            boolean foundUser = new FindUser().findUser(con, uname, pass);
            
            if (!foundUser) {
                PreparedStatement psmt = con.prepareStatement(insertquery);
                psmt.setString(1, uname);
                psmt.setString(2, pass);

                int affected = psmt.executeUpdate();

                if (affected == 1) {
                    req.setAttribute("log", "User Updated Kindly Login");
                }
                else{
                    req.setAttribute("log", "Internal DB error.");
                }
            }
            else{
                req.setAttribute("log", "User Already Exists.");
            }
        }
        catch(SQLException se){
            req.setAttribute("log", se.getMessage());
        }

        req.getRequestDispatcher("T3Q2signup.jsp").forward(req, res);
        
    }
}

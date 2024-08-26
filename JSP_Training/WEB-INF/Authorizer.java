import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/AuthUserCookie")
public class Authorizer extends HttpServlet{
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        boolean hasCookie = false;
        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName() == "username") {
                hasCookie = true;
                break;
            }
        }
        
        // Without Cookie fresh login.
        if (!hasCookie) {
            String uname = req.getParameter("username").toString();
            String pass = req.getParameter("password").toString();

            boolean founduser = new FindUser().AuthUser(uname, pass);

            if (founduser) {
                res.addCookie(new Cookie("username", uname));
                res.sendRedirect("T3Q2welcome.jsp");
            }
            else{
                req.setAttribute("log", "User Not Found Kindly Signup");
                // Should be send in req dispatcher because redirect sends new req so attributes are gone.
                req.getRequestDispatcher("T3Q2.jsp").forward(req, res);
            }
        }
        else{
            req.getRequestDispatcher("T3Q2welcome.jsp").forward(req, res);
        }
    }
    
}
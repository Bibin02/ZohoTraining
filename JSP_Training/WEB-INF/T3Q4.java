import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/validatePasswordServlet")
public class T3Q4 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String password = request.getParameter("password");
        request.setAttribute("password", password);
        request.getRequestDispatcher("/T3Q4.jsp").forward(request, response);
    }
}

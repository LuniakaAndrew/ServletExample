package servlets;

/**
 * Created by USER on 02.05.2017.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //resp.setContentType("text/html");
        //PrintWriter out = resp.getWriter();
        //out.print("<h1>Hello Servlet</h1>");
        req.setAttribute("name", "Andrew");
        req.getRequestDispatcher("indexxx.jsp").forward(req, resp);
        // Set error code and reason.
        //resp.sendError(407, "Need authentication!!!" );
    }
    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

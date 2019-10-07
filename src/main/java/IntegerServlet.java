
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/integer")
public class IntegerServlet extends HttpServlet {

    //w polu adresu podac sciezke ?integer=liczba
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer value = Integer.valueOf(req.getParameter("integer"));
        resp.getWriter().println(value);
    }
}

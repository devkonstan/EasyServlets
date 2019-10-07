import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/post")
public class PostExample extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");

        PrintWriter out = resp.getWriter();
        out.println("Name: " + name);
        out.println("Surname: " + lastName);
    }
}

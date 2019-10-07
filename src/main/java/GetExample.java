import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/get")
public class GetExample extends HttpServlet {

    //w polu adresu podac sciezke ?name=imie
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("name");
        printWriter.println("Test -> " + name);

    }
}
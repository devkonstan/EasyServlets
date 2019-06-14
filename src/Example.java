import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/parameters")
public class Example extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws
            ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Wczytanie 3 parametrow z zadania :");
        out.println(request.getParameter("parametr1"));
        out.println(request.getParameter("parametr2"));
        out.println(request.getParameter("parametr3"));
    }
}


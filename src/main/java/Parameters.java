import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parameters")
public class Parameters extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String parameter1 = request.getParameter("parametr1");
        String parameter2 = request.getParameter("parametr2");
        String parameter3 = request.getParameter("parametr3");

        PrintWriter out = response.getWriter();
        //Wczytanie 3 parametrow z zadania
        out.println("par1: " + parameter1);
        out.println("par2: " + parameter2);
        out.println("par3: " + parameter3);
    }
}


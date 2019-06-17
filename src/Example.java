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
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String parametr1 = request.getParameter("parametr1");
        String parametr2 = request.getParameter("parametr2");
        String parametr3 = request.getParameter("parametr3");

        PrintWriter out = response.getWriter();
        //out.println("Wczytanie 3 parametrow z zadania :");
        out.println("par1: " + parametr1);
        out.println("par2: " + parametr2);
        out.println("par3: " + parametr3);
    }
}


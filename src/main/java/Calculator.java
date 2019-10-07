import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate")
public class Calculator extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        float num1 = Float.parseFloat(req.getParameter("num1"));
        float num2 = Float.parseFloat(req.getParameter("num2"));
        String action = req.getParameter("action");
        float result = 0;
        if (action.equals("add")) {
            result = num1 + num2;
        } else if (action.equals("subtract")) {
            result = num1 - num2;
        } else if (action.equals("multiply")) {
            result = num1 * num2;
        } else if (action.equals("divide")) {
            result = num1 / num2;
        }
        resp.getWriter().println(result);
    }

}

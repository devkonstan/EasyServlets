package CalcWithLambdas;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operation = req.getParameter("operation");
        float v1 = Float.parseFloat(req.getParameter("v1"));
        float v2 = Float.parseFloat(req.getParameter("v2"));
        float result = MathOperation.getMathOperation(operation).doFunction(v1, v2);
        resp.getWriter().println("Wynik: " + result);
    }
}
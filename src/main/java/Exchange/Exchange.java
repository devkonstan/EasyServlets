package Exchange;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/exchange")
public class Exchange extends HttpServlet {

//    private static final float PLNUSD = 0.26091F;
//    private static final float PLNEUR = 0.23356F;
//    private static final float USDPLN = 3.83271F;
//    private static final float USDEUR = 0.89516F;
//    private static final float EURPLN = 4.28159F;
//    private static final float EURUSD = 1.11712F;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        Float value = Float.parseFloat(req.getParameter("value"));
        String in = req.getParameter("actionIN");
        String out = req.getParameter("actionOUT");

        float result = CurrencyConv.convertCurrency(in, out, value);
//        float result=0;
//
//        if (in.equals("PLN") && out.equals("EUR")) {
//            result = value * PLNEUR;
//        } else if (in.equals("PLN") && out.equals("USD")) {
//            result = value * PLNUSD;
//        } else if (in.equals("PLN") && out.equals("PLN")) {
//            result = value;
//        } else if (in.equals("USD") && out.equals("PLN")) {
//            result = value * USDPLN;
//        } else if (in.equals("USD") && out.equals("EUR")) {
//            result = value * USDEUR;
//        } else if (in.equals("USD") && out.equals("USD")) {
//            result = value;
//        } else if (in.equals("EUR") && out.equals("PLN")) {
//            result = value * EURPLN;
//        } else if (in.equals("EUR") && out.equals("USD")) {
//            result = value * EURUSD;
//        } else if (in.equals("EUR") && out.equals("EUR")) {
//            result = value;
//        }
        resp.getWriter().println(result);
    }
}

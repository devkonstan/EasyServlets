package Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/users")
public class Users extends HttpServlet {
    List<User> users = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        String imie = req.getParameter("imie");
        String nazwisko = req.getParameter("nazwisko");
        int wiek = Integer.parseInt(req.getParameter("wiek"));

        users.add(new User(imie, nazwisko, wiek));

        PrintWriter out = resp.getWriter();
        out.println(users);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        String filter = req.getParameter("imie");
        PrintWriter out = resp.getWriter();
        users.stream() //wyrazenie lambda
                .filter((User user) ->  user.equals(filter)) //rzutowanie
                .forEach(out::println);

//        for (User user : users) {
//            if (user.imie.equals(filter)) {
//                PrintWriter out2 = resp.getWriter();
//                out2.println(user);
//            }
//        }

    }
}


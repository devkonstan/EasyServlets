import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet("/lotek")
public class Lotto extends HttpServlet {


//    private Set<Integer> wylosowaneLiczby = new HashSet<>();

//    public Lotto() {
//        System.out.println("Start Serwera");
//        Random random = new Random();
//        while (wylosowaneLiczby.size() < 6) {
//            wylosowaneLiczby.add(random.nextInt(49) + 1);
//        }
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        // liczby nie moga sie powtarzac -> Set
        Set<Integer> wylosowaneLiczby = new HashSet<>();
        System.out.println("Start Serwera");
        Random random = new Random();
        while (wylosowaneLiczby.size() < 6) {
            wylosowaneLiczby.add(random.nextInt(49) + 1);
        }

        //jak nie zwaliduje sie tam wyzej, to mozna tutaj
//        for (int i = 0; i < wylosowaneLiczby.size(); i++) {
//            wylosowaneLiczby[i] = random.nextInt(49) + 1;
//        }

        String line = req.getParameter("liczby");
        String[] liczby = line.split(",");
        Set<Integer> wybraneLiczby = Stream.of(liczby)
                .map((String liczba) -> Integer.parseInt(liczba))
                .collect(Collectors.toSet());


//        Set<Integer> wynikPorownania = new HashSet<>();
//        for (int result : wylosowaneLiczby) {
//            for (int wylosowane : wybraneLiczby) {
//                if (result == wylosowane) {
//                    wynikPorownania.add(result);
//                }
//            }
//        }
        Set<Integer> wynikPorownania = wybraneLiczby.stream()
                .filter((Integer numer) -> wylosowaneLiczby.contains(numer))
                .collect(Collectors.toSet());

        resp.getWriter().println("wylosowane: " + wylosowaneLiczby);
        resp.getWriter().println("wybrane: " + wybraneLiczby);
        resp.getWriter().println("wspólne: " + wynikPorownania);

    }


}

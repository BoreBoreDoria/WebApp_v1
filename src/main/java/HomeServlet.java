import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String user = "Павел";
        PrintWriter printWriter = resp.getWriter();
        StringBuilder result = new StringBuilder();
        result.append("<h1>Hello!</h1>");
        result.append("<p>Привет пользователь: ")
                .append(user)
                        .append("</p>");
        printWriter.write(result.toString());
        printWriter.close();
    }
}

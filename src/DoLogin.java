import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by NESOY on 2017-01-09.
 */
@WebServlet(name = "DoLogin", urlPatterns="/DoLogin")
public class DoLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // read form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // perform business logic
        PrintWriter out = response.getWriter();

        //Build HTML code
        String htmlResponse = "<html>";

        htmlResponse += "<h2> Your name is : " + username + "<br/>";
        htmlResponse += "Your password is : " + password + "<h2>";
        htmlResponse += "</html>";

        out.println(htmlResponse);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

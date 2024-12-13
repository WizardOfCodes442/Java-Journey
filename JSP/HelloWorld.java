// import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http;

public class HelloWorld extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        // do the required initialization
        message = "Hello world";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            
            //set reaponse content type
            response.setContentType("text/html");

            // Actual logic goes here
            PrintWriter out = response.getWritter();
            out.println("<h1>" + message + "</h1>");
        }
    public void destroy() {
        // do nothing
    }
}

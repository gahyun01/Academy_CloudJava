import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Login extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("pwd");
	}
}

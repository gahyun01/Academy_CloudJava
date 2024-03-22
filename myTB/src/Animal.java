import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;

public class Animal extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
		String[] data = request.getParameterValues("animal");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>A picture of your favorite animal</title></head>");
		out.println("<style>\r\n"
				+ "    body .animal{\r\n"
				+ "        display: flex;\r\n"
				+ "    }\r\n"
				+ "    body .animal img{\r\n"
				+ "        margin: 20px;\r\n"
				+ "    }\r\n"
				+ "</style>");
		out.println("<body><h2>좋아하는 동물 사진</h2>");
		out.println("<div class=\"animal\">");
		for(int i=0; i<data.length; i++) {
			out.println("<img src=\"img/"+data[i]+"\" width=\"200\" height=\"200\">");
		}
		out.println("</div>");
	}
}
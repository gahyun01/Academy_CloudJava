import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ResultServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		String food = (String) session.getAttribute("FOOD");
		String animal = request.getParameter("ANIMAL");
		session.invalidate();
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>성격테스트</title></head>");
		out.println("<body>");
		out.println("<h3>성격테스트</h3>");
		out.printf("당신은 %s 와 %s 를 좋아하는 성격입니다.", food, animal);
		out.println("</body></html>");
	}
}

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
		out.println("<html><head><title>�����׽�Ʈ</title></head>");
		out.println("<body>");
		out.println("<h3>�����׽�Ʈ</h3>");
		out.printf("����� %s �� %s �� �����ϴ� �����Դϴ�.", food, animal);
		out.println("</body></html>");
	}
}

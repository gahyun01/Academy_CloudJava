import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AnimalServlet extends HttpServlet{
	// response, request�� �׳� ��� �� �� ����
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String food = request.getParameter("FOOD");
		HttpSession session = request.getSession(); // ���� session�� ���� ����ؾ��Ѵ�.
		session.setAttribute("FOOD", food);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>���� �׽�Ʈ</title></head>");
		out.println("<boby>");
		out.println("<h3>�����ϴ� ������</h3>");
		out.println("<form action='ResultServlet' method='get'>");
		out.println("<input type='text' name='ANIMAL'>");
		out.println("<input type='submit' value='Ȯ��'>");
		out.println("</form></body></html>");
	}
}

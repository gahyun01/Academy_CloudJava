import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class AnimalServlet extends HttpServlet{
	// response, request는 그냥 사용 할 수 있음
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String food = request.getParameter("FOOD");
		HttpSession session = request.getSession(); // 내가 session을 만들어서 사용해야한다.
		session.setAttribute("FOOD", food);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>성격 테스트</title></head>");
		out.println("<boby>");
		out.println("<h3>좋아하는 동물은</h3>");
		out.println("<form action='ResultServlet' method='get'>");
		out.println("<input type='text' name='ANIMAL'>");
		out.println("<input type='submit' value='확인'>");
		out.println("</form></body></html>");
	}
}

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class SignUp extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("pwd");
		String kl = request.getParameter("k_lastnm");
		String kf = request.getParameter("k_firstnm");
		String el = request.getParameter("e_lastnm");
		String ef = request.getParameter("e_firstnm");
		String gender = request.getParameter("gender");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		String email1 = request.getParameter("email1");
		String phone0 = request.getParameter("phone0");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String post = request.getParameter("post");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		String addr3 = request.getParameter("addr3");
		PrintWriter out = response.getWriter();
		
		
		if(gender.equalsIgnoreCase("man")) {
			gender = "man";
		}
		else {
			gender = "woman";
		}
		out.println("<html><head><title>Your SignUp</title></head>");
		out.println("<body><h2>Your SignUp</h2>");
		out.println("아이디 : " + id + "</br>");
		out.println("비밀번호 : " + pwd + "</br>");
		out.println("국문명 : " + kl + kf + "</br>");
		out.println("영문명 : " + ef + el + "</br>");
		out.println("성별 : " + gender + "</br>");
		out.println("생년월일 : " + birth + "</br>");
		out.println("이메일 : " + email + " @ " + email1 + "</br>");
		out.println("연락처 : " + phone0 + " - " + phone1 + " - " + phone2 + "</br>");
		out.println("우편번호 : " + post + "</br>");
		out.println("주소 : " + addr1 + addr2 + addr3 + "</br>");
		out.println("</body></html>");
	}
}

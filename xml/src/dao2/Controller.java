package dao2;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

//	Servlet 화일
//	호출할 page를 관장함
public class Controller extends HttpServlet {
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
//
//	}

	//	form이 없이 url에서 바로 파라미터를 쓸 경우 get인지 post인지 알 수 없으므로 service()라는 메소드 호출함
	//	service는 doGet/doPost 호출 전에 호출되는 함수로 service 안에서  get인지 post인지를 나뉘게 됨
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//	.myt?p=1 -> parameter p 값으로 1을 넘김
		String param = request.getParameter("gbn");
		
		if(param.equals("1")) {
			//	특정 페이지로 이동하기 전에 DB 작업을 해야 함
			//SelectDB select = new SelectDB();
			//SelectDB select = SelectDB.getSelectDB();
			ClassB bb = ClassB.getClassB();
			
			//	이동하는 위치를 받아옴
			String page = bb.functionA(request, response);
			
			//	dispatcher를 이용해서 페이지 이동함
			//	response는 그냥 페이지만 이동 -> a href와 같은 동작임
			//	dispatcher로 넘겨야 request, response를 통해서 값을 넘길 수 있음
			request.getRequestDispatcher(page).forward(request, response);
		}
	}
	
}
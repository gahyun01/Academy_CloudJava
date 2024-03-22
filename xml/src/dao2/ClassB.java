package dao2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.DTOClass;

//	DB 연결한는 ClassC와 Controller를 연결하는 Class

public class ClassB implements InterfaceA{
	//	select 객체와 getSelectDB 함수 모두 static이므로
	//	해당 함수를 호출할 때마다 객체가 생성되는 것이 아니라
	//	1번 생성된 객체를 계속 재사용하게 됨
	//	해당 프로그램을 실행하는 동안 딱 1번의 객체 생성만 일어남
	static ClassB bb = new ClassB();
	
	public static ClassB getClassB() {
		return bb;
	}

	//	implements한 interfaceA 함수 override해서 ClassC에서 select한 데이타를 받아옴
	public String functionA(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		ClassC cc = ClassC.getClassC();
		List<DTOClass> list = cc.functionC();
		
		//	받아온 list를 setAttribute 통해서 다음 페이지로 전달함
		//	key/value값으로 저장
		//	request에 셋팅하면 다음에 getAttribute로 받을 수 있음
		request.setAttribute("RESULT", list);
		
		return "link_1.jsp";
	}
	

}
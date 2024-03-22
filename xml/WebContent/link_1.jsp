<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  DB에서 데이타를 SELECT한 결과를 보여주는 화면임 -->
<%@ page import="java.util.*" %>
<%@ page import="dto.DTOClass" %>

<%
List<DTOClass> list = (List<DTOClass>)request.getAttribute("RESULT");

for(int i = 0 ; i < list.size(); i++){
	DTOClass cl = list.get(i);
	
	out.println("[" + i + "]" + cl.getUid() + " " + cl.getUname() + " " + cl.getUnum());
}
%>
</body>
</html>
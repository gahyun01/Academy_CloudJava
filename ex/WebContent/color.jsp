<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="color" class="java.util.ArrayList">
	<%
		User.add("red");
			User.add("orange");
			User.add("green");
			User.add("blue");
			User.add("violet");
	%>
	</jsp:useBean>
	
	<ul>
		<font color="${color[0]}"><li> �� ������ ${color[0]���Դϴ�. </li></font>
		<font color="${color[1]}"><li> �� ������ ${color[1]���Դϴ�. </li></font>
		<font color="${color[2]}"><li> �� ������ ${color[2]���Դϴ�. </li></font>
		<font color="${color[3]}"><li> �� ������ ${color[3]���Դϴ�. </li></font>
		<font color="${color[4]}"><li> �� ������ ${color[4]���Դϴ�. </li></font>
	</ul>
</body>
</html>
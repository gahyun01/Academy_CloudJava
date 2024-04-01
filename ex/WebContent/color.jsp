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
		<font color="${color[0]}"><li> 이 색상은 ${color[0]색입니다. </li></font>
		<font color="${color[1]}"><li> 이 색상은 ${color[1]색입니다. </li></font>
		<font color="${color[2]}"><li> 이 색상은 ${color[2]색입니다. </li></font>
		<font color="${color[3]}"><li> 이 색상은 ${color[3]색입니다. </li></font>
		<font color="${color[4]}"><li> 이 색상은 ${color[4]색입니다. </li></font>
	</ul>
</body>
</html>
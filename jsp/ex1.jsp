<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>
</head>

<body>
	<%! double radius = 4.8; %>
	<%!
		public double getAea(double r){
			return r * r * 3.14;
		}
	%>
	반지름이 <%= radius %>인 원의 면적은 <%= getArea(radius) %>이다.
</body>

</html>
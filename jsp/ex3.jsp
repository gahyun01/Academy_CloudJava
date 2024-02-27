<%@ page language="java" contentType="text/html; charset=utf-8" pageEncodeing="utf-8" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Document</title>
</head>

<body>
	<% int total = 0;
		for (int cnt = 1; cnt <= 100; cnt++)
			total += cnt;
	%>
	1부터 100까지 더한 값은? <%= total %>
</body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% Cookie[] cookies = request.getCookies(); %>

<%
    response.addCookie(new Cookie("NAME", "Johon"));
    response.addCookie(new Cookie("GENDER", "Male"));
    response.addCookie(new Cookie("AGE", "15"));
%>
<html>
<head>
    <title>쿠키 저장하기</title>
</head>
<body>
    쿠키 데이처가 저장되었습니다.</br></br>
</body>
</html>
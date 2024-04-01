<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>user</title>
</head>
<body>
	<jsp:useBean id="users" class="member.UserDB" />
	<%
		User user = users.selectDB();
		
    %>
    <div class="sub">
    	<p>User Name : <%= user.getUname() %></p>
	    <p>User Id : <%= user.getUid() %></p>
	    <p>User Num : <%= user.getUnum() %></p>
	    <p>삭제</p>
    </div>
    
</body>
</html>
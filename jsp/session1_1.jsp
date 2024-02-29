<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("ID");
    String password = request.getParameter("PASSWORD");
    String name = request.getParameter("NAME");
    session.setAttribute("ID", id);
    session.setAttribute("PASSWORD", password);
    session.setAttribute("NAME", name);
%>
<html>
<head>
    <title>회원 가입</title>
</head>

<body>
    <h3>약관</h3>
    -------------------------------------------------------------------------------------</br>
    <pre>1. 회원 정보는 웹 사이트의 원영을 위해서만 사용됩니다.</pre></br>
    <pre>2. 웹 사이트의 정상 운영을 방해하는 회원은 탈퇴 처리합니다.</pre> </br>
    -------------------------------------------------------------------------------------</br>
    <form action="session1_2.jsp" method="post">
        위 약관에 동의하십니까?
        <input type="radio" name="agree" value="yes">동의함
        <input type="radio" name="agree" value="no">동의하지 않음</br></br>
        <input type="submit" value="확인">
    </form>
</body>
</html>
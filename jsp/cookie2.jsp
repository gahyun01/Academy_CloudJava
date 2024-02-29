<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% Cookie[] cookies = request.getCookies(); %>

<!-- 유지되는 최대 시간을 0으로 설정하면 쿠키가 삭제된다. ( 아래 문장 만나면 쿠키 삭제됨 )
    <%
        Cookie cookie = new Cookie("GENDER", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    %>
    <% response.addCookie(new Cookie("AGE", "16")); %> <- 정보를 변경하고 싶을때 ! 이렇게 하면 AGE가 16으로 바뀜 ( 덮어씌워짐 )
-->

<html>
<head>
    <meta charset="utf-8">
    <title>쿠키 데이터 읽기</title>
</head>

<body>
    이름 : <%= getCookieValue(cookies, "NAME") %><br>
    성별 : <%= getCookieValue(cookies, "GENDER") %><br>
    나이 : <%= getCookieValue(cookies, "AGE") %><br>
</body>
</html>
<%!
    private String getCookieValue(Cookie[] cookies, String name){
        String value = null;
        if(cookies == null)
            return null;
        for (Cookie cookie : cookies){
            if(cookie.getName().equals(name))
                return cookie.getValue();
        }
        return null;
    }
%>
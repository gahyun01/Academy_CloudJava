<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Document</title>
</head>

<body>
    <%
        String search = request.getParameter("search");
        out.println("검색어 : " + search);
    %>
</body>

</html>
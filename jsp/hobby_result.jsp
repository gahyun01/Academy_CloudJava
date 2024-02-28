<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Hobby</title>
</head>

<body>
    <%@ page import="java.util.Enumeration" %>
    <h2> 취미와 가보고 싶은 국가 결과</h2>
    <%
        // Enumeration e = request.getParameterNames();
        Enumeration<String> e = request.getParameterNames();
        while(e.hasMoreElements()){
            String name = e.nextElement();
            String[] data = request.getParameterValues(name);
            if(data != null)
                for (String eachdata : data){
                    out.println(eachdata + " ");
            }
            out.println("<p>");
        }
    %>
</body>
</html>
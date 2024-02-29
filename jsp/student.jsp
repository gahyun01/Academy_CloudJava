<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Document</title>
</head>

<body>
    <h2>학생 정보 입력</h2>
    <form action="student_result.jsp" method="get">
        성명 : <input type="text" name="name"></p>
        학번 : <input type="text" name="studentNum"></p>
        성별 : 남자 <input type="radio" name="sex" value="man" checked>
            여자 <input type="radio" name="sex" value="woman"></p>
        국적 : <select name="country">
            <option value="일본">일본</option>
            <option value="중국">중국</option>
            <option value="터키">터키</option>
            <option value="태국">태국</option>
            </select></p>
        <input type="submit" value="보내기">    
    </form>
</body>
</html>
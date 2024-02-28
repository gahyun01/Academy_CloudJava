<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Hobby</title>
</head>

<body>
    <form action="hobby_result.jsp" method="get">
        <h2>취미와 가보고 싶은 국가</h2>
        1. 좋아하는 취미를 선택하세요</p>
        영화 <input type="checkbox" name="hobby" value="영화"></p>
        독서 <input type="checkbox" name="hobby" value="독서"></p>
        스키 <input type="checkbox" name="hobby" value="스키"></p>
        자전거 <input type="checkbox" name="hobby" value="자전거"></p>

        2. 여행하고 싶은 국가를 하나 선택하세요</p>
        영국 <input type="radio" name="country" value="영국" checked></br>
        미국 <input type="radio" name="country" value="미국"></br>
        브라질 <input type="radio" name="country" value="브라질"></br>
        터키 <input type="radio" name="country" value="터키"></br>

        <input type="submit" value="보내기">
    </form>
</body>
</html>
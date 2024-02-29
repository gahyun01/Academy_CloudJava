<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Document</title>
</head>

<body>
    <h2>당신이 좋아하는 동물을 선택하세요</h2>
    <form action="Animal" method="get">
        <input type="checkbox" name="animal" value="dog.jpg">강아지
        <input type="checkbox" name="animal" value="cat.png">고양이
        <input type="checkbox" name="animal" value="rabbit.jpg">토끼
        <input type="checkbox" name="animal" value="turtle.jpg">거북이
        <input type="submit" value="확인">
    </form>
</body>
</html>
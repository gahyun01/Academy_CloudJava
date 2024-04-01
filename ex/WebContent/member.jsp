<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="member.User">
		<jsp:setProperty name="user" property="uname" value="강길수" />
		<jsp:setProperty name="user" property="uid" value="road" />
		<jsp:setProperty name="user" property="unum" value="1234" />
	</jsp:useBean>
	\${ user.uname } = ${ user.umane }<br>
	\${ user.uid } = ${ user.uid }<br>
	\${ user.unum } = ${ user.unum }<br>
	<p>
	\${ user["name"] } = ${ user["name"] }<br>
	\${ user["uid"] } = ${ user["uid"] }<br>
	\${ user["unum"] } = ${ user["unum"] }<br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%
    String agree = request.getParameter("agree");
    String result = null;
    if(agree.equals("yes")){
        String id = (String) session.getAttribute("ID");
        String password = (String) session.getAttribute("PASSWORD");
        String name = (String) session.getAttribute("NAME");
        PrintWriter writer = null;
        try{
            String filePath = application.getRealPath("/WEB-INF/" + id + ".txt");
            writer = new PrintWriter(filePath);
            writer.println("아이디 : " + id);
            writer.println("패스워드 : " + password);
            writer.println("이름 : " + name);
            result = "SUCCESS";
        }
        catch(IOException ioe){
            result = "FAIL";
        }
        finally{
            try{
                writer.close();
            }
            catch(Exception e){
            }
        }
    }
    else{
        result = "FAIL";
    }
    session.invalidate(); // 만나는 순간 세션 객체를 삭제한다. session.RemoveAttribute(key값 넣음); == 만나는 순간 특정 세션 객체만 삭제한다.
    response.sendRedirect("session1_3.jsp?RESULT=" + result);
%>
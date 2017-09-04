<%@page import="java.util.Date" %>
<%@page import="java.time.Instant" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Info</title>
 </head>
 <body>
 
    <jsp:include page="header.jsp"></jsp:include>
    <jsp:include page="menu.jsp"></jsp:include>
    <% Date date = new Date(); %>
    <div align="right">Current date is <%=date%></div>
    
 
    <h3><font color="blue">Hello: ${user.userName}</font></h3>
 
    User Name: <b>${user.userName}</b>
    <br />
    Gender: ${user.gender } <br />
     
     
    <form method="Post" action="http://localhost:8080/WebApp/login">
    <input type="submit" value="Logout"/>
</form>
     
 </body>
 </html>
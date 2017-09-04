<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Home Page</title>
  </head>
  <body>
 
     <jsp:include page="header.jsp"></jsp:include>
     <jsp:include page="menu.jsp"></jsp:include>
      <% Date date = new Date(); %> 
      <div align="right">Current date is <%=date%></div>
      <h3><font color="red">Home Page</font></h3>
      
     
      <b>It includes the following functions:</b>
      <ul>
         <li><font color="green">Login Information</font></li>
         
        
      </ul>
 
  
 
  </body>
</html>
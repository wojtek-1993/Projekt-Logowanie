<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    String user = request.getParameter("U_NAZWA_UZYTKOWNIKA");    
    //String pwd = request.getParameter("pass");
    String fname = request.getParameter("U_IMIE");
    String lname = request.getParameter("U_NAZWISKO");
    String email = request.getParameter("U_EMAIL");
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe",
            "test", "test");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into USERS(U_IMIE, U_NAZWISKO, U_EMAIL, U_NAZWA_UZYTKOWNIKA,  regdate) values ('" + fname + "','" + lname + "','" + email + "','" + user + "','" + "', CURDATE())");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("loginView.jsp");
    }
%>
</body>
</html>
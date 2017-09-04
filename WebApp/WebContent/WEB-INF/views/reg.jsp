<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form method="post" action="login">
            <center>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="U_IMIE" value="${user.U_IMIE}" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="U_NAZWISKO" value="${user.U_NAZWISKO}" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="U_EMAIL" value="${user.U_EMAIL}" /></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="U_NAZWA_UZYTKOWNIKA" value="${user.U_NAZWA_UZYTKOWNIKA}" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="P_HASLO" value="${user.P_HASLO}" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="http://localhost:8080/WebApp/login">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
 
</body>
</html>
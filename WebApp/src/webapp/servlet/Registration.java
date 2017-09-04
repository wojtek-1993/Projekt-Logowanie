package webapp.servlet;


//import java.sql.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //String user = request.getParameter("uname");    
        //String pwd = request.getParameter("pass");
        //String fname = request.getParameter("fname");
        //String lname = request.getParameter("lname");
        //String email = request.getParameter("email");
        
        RequestDispatcher dispatcher //
        = this.getServletContext().getRequestDispatcher("/WEB-INF/views/reg.jsp");

        dispatcher.forward(request, response);
    }
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@" + "localhost" + ":1521:" + sid);
        //Statement st = con.createStatement();
        //ResultSet rs;
        //int i = st.executeUpdate("insert into members(first_name, last_name, email, uname, pass, regdate) values ('" + fname + "','" + lname + "','" + email + "','" + user + "','" + pwd + "', CURDATE())");
        //if (i > 0) {
            //session.setAttribute("userid", user);
            //response.sendRedirect("welcome.jsp");
           // out.print("Registration Successfull!"+"<a href='loginView.jsp'>Go to Login</a>");
        //} else {
           // response.sendRedirect("loginView.jsp");
        //}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    }



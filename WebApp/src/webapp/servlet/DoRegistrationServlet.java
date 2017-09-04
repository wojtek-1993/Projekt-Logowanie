package webapp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Statement;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.UserAccount;


@WebServlet("/DoRegistrationServlet")
public class DoRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public DoRegistrationServlet() {
        super();
        
    }
 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String U_Nazwa_Uzytkownika = request.getParameter("U_Nazwa_Uzytkownika");    
	    String P_Haslo = request.getParameter("P_Haslo");
	    String U_Imie = request.getParameter("U_Imie");
	    String U_Nazwisko = request.getParameter("U_Nazwisko");
	    String U_Email = request.getParameter("U_Email");
	    
	    UserAccount user = null;
        boolean Error = false;
        String errorPrint = null;
 
        if (U_Nazwa_Uzytkownika  == null && P_Haslo == null && U_Imie == null && U_Nazwisko == null && U_Email == null 
        	||	U_Nazwa_Uzytkownika.length() == 0 || P_Haslo.length() == 0){
        	
        	Error = true;
            errorPrint = "Required username and password!";
        }else {
        	try{
        	 Class.forName("oracle.jdbc.driver.OracleDriver");
        	 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@" + "localhost" + ":1521:" + "xe" + "test" + "test");
        	    Statement st = conn.createStatement();
        	    
        	    int i = st.executeUpdate("insert into USERS(U_IMIE, U_NAZWISKO, U_EMAIL, U_NAZWA_UZYTKOWNIKA) values (?,?,?,?)");
        	    int a = st.executeUpdate("insert into PASSWORD(P_HASLO) values (?)");
        	    if (i > 0 && a > 0) {
        	       // session.setAttribute("userid", user);
        	        response.sendRedirect("http://localhost:8080/WebApp/login");
        	       //out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
        	    } else {
        	        response.sendRedirect("http://localhost:8080/WebApp/Registration");
        	    }
        	}catch (Exception e){
        		e.printStackTrace();
                Error = true;
                errorPrint = e.getMessage();
        	}
        }
        
        if (Error) {
        	user = new UserAccount();
            user.setU_Nazwa_Uzytkownika(U_Nazwa_Uzytkownika);
            user.setP_Haslo(P_Haslo);
            
            request.setAttribute("errorPrint", errorPrint);
            request.setAttribute("user", user);
        }
        
       /* RequestDispatcher dispatcher //
        = this.getServletContext().getRequestDispatcher("http://localhost:8080/WebApp/login");

        dispatcher.forward(request, response);
    }*/
      }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

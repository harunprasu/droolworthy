package LoginPackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DatasourcePackage.Datasource;

public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

       public Loginservlet() {
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try{
			
			UserBean user=new UserBean();
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("password"));
			
			user=Datasource.login(user);
			
			if(user.isValid()){
				HttpSession session=request.getSession(true);
				session.setAttribute("currentsessionuser", user);
				response.sendRedirect("userlogged.jsp");
								
			}
			else{
				response.sendRedirect("loggedout.jsp");
			}
					
			
		}
		catch(Exception E){
			System.out.println(E);
		}
		
		
	}

	

}

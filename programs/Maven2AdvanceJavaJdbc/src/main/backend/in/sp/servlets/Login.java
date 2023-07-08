package in.sp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sp.services.LoginService;

public class Login extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email1");
		String pass = request.getParameter("pass1");
		
		LoginService ls = new LoginService();
		boolean status = ls.loginService(email, pass);
		
		if(status)
		{
			response.sendRedirect("profile.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}
}

package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// using of doPost helps with security 
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();//printing thing
		
		String usr = request.getParameter("user");//getting user name from the html file like the client side 
		String pas = request.getParameter("pwd");//same as user name for the password as well
		//this is the constraints like what the username and password should be 
		if(usr.equals("admin") && pas.equals("java"))
		{
		   //RequestDispatcher rd = request.getRequestDispatcher("home.html");
		   //rd.forward(request, response); // this is only for the pages (requestDispatcher)
			//response.sendRedirect("home.html");// this is for pages and links to redirect(response)
			response.sendRedirect("https://gmst.in");
		}
		
		else {
			out.println("<font color = 'red'> Invalid credentails");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			   rd.forward(request, response);
		}
				
	}

}

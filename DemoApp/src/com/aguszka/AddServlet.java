package com.aguszka;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.io.IOException;

public class AddServlet extends HttpServlet {
	// doPost makes it only work with POST reqs
	
	/* HttpServletRequest - obj that hold my values 
	 * HttpServletResponse - obj img/data/video/html/text...
	 * tomcat gives both of these objs
	 */
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int c = a + b;
		PrintWriter out = res.getWriter();
		
		// 1st way
		// session management to send to diff servlet
		//req.setAttribute("c", c);
		
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
		
		// here user uses 1 request and server 2
		
		//2nd way
		//res.sendRedirect("sq?c="+c); // url rewriting
		// here user 2 serv 1 bc it says to the user to go to another address
		
		
		//3rd way by maintaining a session
		//HttpSession session = req.getSession();
		//session.setAttribute("c", c);
		//res.sendRedirect("sq");
		
		//4th cookies
		Cookie cookie = new Cookie("c", c + ""); //+"" to make it string
		res.addCookie(cookie);	
		
		res.sendRedirect("sq");
	}
}

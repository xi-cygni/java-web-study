package com.aguszka;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.io.IOException;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// 1st
		//int c = (int)req.getAttribute("c"); 
		
		// 2nd
		//int c = Integer.parseInt(req.getParameter("c"));
		
		// 3rd
		//HttpSession session = req.getSession();
		//int c = (int)session.getAttribute("c");
		
		//4th - cookies
		int c = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie cookie: cookies) {
			if(cookie.getName().equals("c"))
				c = Integer.parseInt(cookie.getValue());
		}
		
		c = c * c;
		
		PrintWriter out = res.getWriter();
		out.println("Square is " + c);
		
		// 3rd
		//session.removeAttribute("k"); // to finish the session
		/* session is used for maintaining login to verify if
		 * the user is already logged in
		 */
	}
}

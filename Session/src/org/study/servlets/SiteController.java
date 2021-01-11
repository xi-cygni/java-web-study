package org.study.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch(action) {
		case "login":
			request.getRequestDispatcher("login.jsp").forward(request,  response);
			break;
		default:
			break;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		switch(action) {
		case "loginSubmit":
			authenticate(request, response);
			break;
		}
	}
	
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("aga") && password.equals("hehe")) {
			request.getSession().invalidate(); // invalidate session if any
			
			HttpSession newSession = request.getSession(true); // flag is true
			
			newSession.setMaxInactiveInterval(300);
			newSession.setAttribute("username", username);
			
			// attaches secret session id if required, not in cookie like usual
			String encode = response.encodeURL(request.getContextPath());
			
			response.sendRedirect(encode+"/memberAreaController?action=memberArea");
		}
		else response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
		
	}
}

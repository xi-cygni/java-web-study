package org.study.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/memberAreaController")
public class memberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public memberAreaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "destroy":
			request.getSession().invalidate(); // enough for user loggin out
			String encode = response.encodeURL(request.getContextPath());
			response.sendRedirect(encode+"/SiteController?action=login");
			break;
		case "memberArea":
			request.getRequestDispatcher("memberArea.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package org.studyeasy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param.contentEquals("login")) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else if(param.contentEquals("signup")) {
			getServletContext().getRequestDispatcher("/SighUp.jsp").forward(request, response);
		}
		else if(param.contentEquals("about")) {
			getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
		}
		else {
			getServletContext().getRequestDispatcher("/NotFound.jsp").forward(request, response);
		}
	}

}

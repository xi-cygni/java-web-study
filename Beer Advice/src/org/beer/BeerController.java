package org.beer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BeerController")
public class BeerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BeerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String beerColor = request.getParameter("color");
		PrintWriter out = response.getWriter();
		out.println("<h1>Beer recommendations JSP</h1><br/>");
		
		if(beerColor.equals("light")) { out.println("You should try Zywiec IPA."); }
		else if (beerColor.equals("dark")) { out.println("You should try Komes."); }
		else out.println("Go drink Perla");
	}

}

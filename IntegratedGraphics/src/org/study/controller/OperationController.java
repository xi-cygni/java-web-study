package org.study.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.study.entity.User;
import org.study.model.UsersModel;

@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/project")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page =  page.toLowerCase();
		
		switch(page) {
		case "listusers":
			listUsers(request, response);
			break;
		case "adduser":
			addUserFormLoader(request, response);
			break;
		case "updateuser":
			UpdateUserFromLoader(request, response);
			break;
		case "deleteuser":
			deleteUser(request, response);
			break;
		default:
			errorPage(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("form");
		operation = operation.toLowerCase();
		
		switch(operation) {
		case "adduseroperation":
			User user = new User(request.getParameter("username"),
								 request.getParameter("email"));
			addUserOperation(user);
			listUsers(request, response);
			break;
		case "updateuseroperation":
			User updated = new User(Integer.parseInt(request.getParameter("id")),
									request.getParameter("username"),
					 				request.getParameter("email"));
			
			updateUserOperation(dataSource, updated);
			listUsers(request, response);
			break;
		default:
			errorPage(request, response);
		}
	}
	
	public void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> listUsers = new ArrayList<>();
		listUsers = new UsersModel().listUsers(dataSource);
		request.setAttribute("listUsers", listUsers);
		request.setAttribute("title", "List of users");
		request.getRequestDispatcher("listUser.jsp").forward(request, response);
	}
	
	public void addUserFormLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Add user");
		request.getRequestDispatcher("addUser.jsp").forward(request, response);
	}
	
	public void errorPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Error");
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}
	
	private void addUserOperation(User user) {
		new UsersModel().addUser(dataSource, user);
		return;
	}
	
	private void UpdateUserFromLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Update User");
		request.getRequestDispatcher("updateUser.jsp").forward(request, response);
	}
	
	private void updateUserOperation(DataSource dataSource, User user) {
		new UsersModel().updateUser(dataSource, user);
		return;
	}
	
	public void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("userId"));
		new UsersModel().deleteUser(dataSource, id);
		listUsers(request, response);
	}
}

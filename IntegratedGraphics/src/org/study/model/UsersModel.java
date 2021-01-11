package org.study.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

public class UsersModel {
	public List<User> listUsers(DataSource dataSource) {
		
		List<User> listUsers = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		    	
		try {
		    connect = dataSource.getConnection();
		    		
		    // create sql statemets string
		    String query = "SELECT * FROM users";
		    stmt = connect.createStatement();
		    		
		    // execute sql query
		    rs = stmt.executeQuery(query);
		    		
		    //process query
		    while(rs.next()) 
		    	listUsers.add(new User(rs.getInt("id_users"), 
		    						   rs.getString("username"), 
		    						   rs.getNString("email")));
		   	
		 } catch (SQLException e) { e.printStackTrace(); }  
		
		return listUsers;
	}

	public void addUser(DataSource dataSource, User user) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try { 
			connect = dataSource.getConnection(); 
			String username = user.getUsername();
			String email = user.getEmail();
			String query = "INSERT INTO users (username, email) VALUES (?, ?)";
			stmt = connect.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, email);
			
		} catch (SQLException e) { 
			e.printStackTrace(); 
			
		} finally {
			try { connect.close(); stmt.close(); }
			catch (SQLException e) {e.printStackTrace(); }
		}
	}

	public void updateUser(DataSource dataSource, User user) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try { 
			connect = dataSource.getConnection(); 
			
			int id = user.getId_users();
			String username = user.getUsername();
			String email = user.getEmail();
			
			String query = "update users set username = ?, email = ? where id_users = ? ";
			
			stmt = connect.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.setInt(3, id);
			stmt.executeUpdate();
			
		} catch (SQLException e) { 
			e.printStackTrace(); 
			
		} finally {
			try { connect.close(); stmt.close(); }
			catch (SQLException e) {e.printStackTrace(); }
		}
	}

	public void deleteUser(DataSource dataSource, int id) {
		Connection connect = null;
		PreparedStatement stmt = null;
		
		try { 
			connect = dataSource.getConnection(); 
		
			String query = "DELETE FROM users WHERE id_users = ? ";
			
			stmt = connect.prepareStatement(query);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
		} catch (SQLException e) { 
			e.printStackTrace(); 
			
		} finally {
			try { connect.close(); stmt.close(); }
			catch (SQLException e) {e.printStackTrace(); }
		}
		
	}
}

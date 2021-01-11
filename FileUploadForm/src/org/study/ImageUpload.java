package org.study;

import java.util.List;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.study.hibernate.DAO.FilesDAO;
import org.study.hubernate.entity.Files;

@WebServlet("/ImageUpload")
public class ImageUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String path = "C:/images/";
	//public String path = "C:/Users/lenovo/Downloads/apache-tomcat-8.5.57-src/webapps/images/";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch(action) {
		case "listingImages":
			listingImages(request, response);
			break;
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch(action) {
		case "filesUpload":
			filesUpload(request, response);
			break;
		case "listingImages":
			listingImages(request, response);
			break;
		default:
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	public void filesUpload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> images = upload.parseRequest(request);
			for(FileItem image : images) {
				System.out.println(image.getName());
				try {
					File file = new File(path + image.getName());
					if (!file.exists()) {
						new FilesDAO().addFileDetails(new Files(image.getName()));
						image.write(file);
					}
					
				} catch (Exception e) {}
			}
			
		} catch (FileUploadException e) { e.printStackTrace(); }
		
		listingImages(request, response);
	}
	
	public void listingImages(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Files> files = new FilesDAO().listFiles();
		request.setAttribute("files", files);
		request.setAttribute("path", path);
		request.getRequestDispatcher("listFiles.jsp").forward(request, response);
	}
}

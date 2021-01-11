package org.study.hibernate.DAO;

import java.io.File;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.study.hubernate.entity.Files;

public class FilesDAO {
	SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Files.class)
			.buildSessionFactory();
	
	public void addFileDetails(Files file) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(file);
		session.getTransaction().commit();
		
		System.out.println(file.getFileName() + " is added.");
	}
	
	public List<Files> listFiles() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Files> files = session.createQuery("FROM files").getResultList();
		//session.getTransaction().commit(); will cause exception if we 
		//return the file before commiting
		
		return files;
	}
}

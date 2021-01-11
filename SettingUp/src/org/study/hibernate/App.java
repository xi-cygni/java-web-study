package org.study.hibernate;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.study.hibernate.entity.Users;

public class App {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			
			/* ADDING
			// Create object of entity class type
			Users user =  new Users("papiez37", "kremowki21", "Karol", "Wojtyla");
			// Start transaction
			session.beginTransaction();
			// Perform operation like adding to database
			session.save(user);
			// Commit the transaction
			session.getTransaction().commit();
			System.out.print("Added!");
			*/
			
			/* RETRIEVE
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 3); // 3 is the id we want
			session.getTransaction().commit();
			
			System.out.print(user);
			*/
			
			/* UPDATE
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 4);
			user.setUsername("kremowkarzWadowicki");
			session.getTransaction().commit();
			
			System.out.print(user);
			*/
			/* DELETE
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 4);
			session.delete(user);
			session.getTransaction().commit();
			*/
			/* LIST QUERIES
			session.beginTransaction();
			List <Users> users = session.createQuery("from users where first_name= 'Aga'"
					+ "OR last_name='Kotek'").getResultList();
			for( Users u : users ) {
				System.out.println(u);
			}
			
			session.getTransaction().commit();
			*/
			
			/*UPDATE PASSWORD
			session.beginTransaction();
			session.createQuery("update users set password = '12345' "
					+ "where first_name='Aga'").executeUpdate();
			session.getTransaction().commit();
			*/
			/* DELETE 
			session.beginTransaction();
			session.createQuery("delete from users where id_users=3").executeUpdate();
			session.getTransaction().commit();
			*/
			
			
		} finally {
			session.close();
			factory.close();
		}
	}
}

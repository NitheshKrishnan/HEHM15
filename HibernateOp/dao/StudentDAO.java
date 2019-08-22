package edu.jspiders.hibernateop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernateop.dto.StudentDTO;

public class StudentDAO 
{
	public void create(StudentDTO student)
	{
		Configuration config = new Configuration();
		
		config.configure().addAnnotatedClass(StudentDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		int count = (int) session.save(student);
		
		System.out.println("Count --> "+count);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
		factory.close();
	}
}

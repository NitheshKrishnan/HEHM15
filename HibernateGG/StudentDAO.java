package edu.jspiders.hibernategg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernategg.dto.StudentDTO;

public class StudentDAO 
{
	public void create(StudentDTO student)
	{
		Configuration config = new Configuration();
		config.configure().addAnnotatedClass(StudentDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.save(student);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
	
	public StudentDTO readById(int studentId)
	{
		
		// hibernate logic to fetch student Object with the given Id
		
		return null;
	}
	
	public void updateById(int studentId)
	{
		// hibernate logic to fetch student Object with the given Id
		
		// update any given attribute
	}
	
	public void deleteById(int studentId)
	{
		// hibernate logic to fetch student Object with the given Id
		
		// delete the student Object
	}
}

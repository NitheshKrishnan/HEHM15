package edu.jspiders.hibernatehql.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernatehql.dto.StudentDTO;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class StudentDAO 
{
	public void create(StudentDTO student)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		session.save(student);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
	}
	
	public StudentDTO readAll()
	{
		
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO";
		
		Query query = session.createQuery(hql);
		
		List<StudentDTO> list = query.list();
		
		for(StudentDTO student : list)
		{
			System.out.println(student);
			System.out.println("-----------------------------");
		}
		
		return null;
	}
	
	public StudentDTO readAllOrderByMarks()
	{
		
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO ORDER BY marks DESC";
		
		Query query = session.createQuery(hql);
		
		List<StudentDTO> list = query.list();
		
		for(StudentDTO student : list)
		{
			System.out.println(student);
			System.out.println("-----------------------------");
		}
		
		return null;
	}
	
	public void updateMarksByName()
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "UPDATE StudentDTO set marks = 80.2 where first_name = 'Mukesh'";
		
		Query query = session.createQuery(hql);
		
		int count = query.executeUpdate();
		
		session.beginTransaction().commit();
		
		System.out.println(count+" no. of Rows Affected");
	}
	
	public void deleteByMarks(double marks)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		String hql = "DELETE FROM StudentDTO where marks > :val";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("val", marks);
		
		int count = query.executeUpdate();
		
		session.beginTransaction().commit();
		
		System.out.println(count+" no. of Rows Affected");
	}
}

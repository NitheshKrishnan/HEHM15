package edu.jspiders.employeeapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import edu.jspiders.employeeapp.dto.EmployeeDTO;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class EmployeeDAO {

	public void create(EmployeeDTO employee)
	{
		// hibernate logic for create
	}

	public EmployeeDTO read(int empId) 
	{
		// hibernate logic for read
		
		return null;
	}

	public void update(EmployeeDTO emp, Object value, int ch) 
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		if(value instanceof String)
		{
			String data = (String)(value);
			
			if(ch == 1)
				emp.setFirstName(data);
			else if(ch == 2)
				emp.setLastName(data);
			else if(ch == 3)
				emp.setDesignation(data);
		}
		else if(value instanceof Double)
		{
			emp.setSalary((Double)(value));
		}
		
		session.update(emp);
		
		tx.commit();
		
		System.out.println("Employee Update Successfully");
	}

	public void delete(EmployeeDTO emp)
	{
		// hibernate logic for delete
	}
}

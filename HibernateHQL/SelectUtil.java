package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.StudentDAO;

public class SelectUtil 
{
	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		
		//dao.readAll();
		
		dao.readAllOrderByMarks();
	}
}

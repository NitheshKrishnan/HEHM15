package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.StudentDAO;

public class UpdateUtil 
{
	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		
		dao.updateMarksByName();
	}
}

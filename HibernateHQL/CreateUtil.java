package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.StudentDAO;
import edu.jspiders.hibernatehql.dto.StudentDTO;

public class CreateUtil
{
	public static void main(String[] args) 
	{
		StudentDTO student = new StudentDTO("Mukesh", "N/A", "Yadav", 54.2);
		
		StudentDAO dao = new StudentDAO();
		
		dao.create(student);
	}
}

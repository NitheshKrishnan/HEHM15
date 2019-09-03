package edu.jspiders.hibernategg.util;

import edu.jspiders.hibernategg.dao.StudentDAO;
import edu.jspiders.hibernategg.dto.StudentDTO;

public class CreateUtil
{
	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		
		StudentDTO student = new StudentDTO();
		
		student.setFirstName("Rajesh");
		student.setMiddleName("N/A");
		student.setLastName("Kumar");
		student.setMarks(65.3);
		
		dao.create(student);
	}
}

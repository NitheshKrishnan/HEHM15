package edu.jspiders.hibernateop.util;

import edu.jspiders.hibernateop.dao.StudentDAO;
import edu.jspiders.hibernateop.dto.StudentDTO;

public class CreateUtil 
{
	public static void main(String[] args)
	{
		StudentDTO student = new StudentDTO(1, "Nithesh", "N/A", "Krishnan", 59.97);
		
		StudentDAO dao = new StudentDAO();
		
		dao.create(student);
	}
}

package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.StudentDAO;
import edu.jspiders.hibernatehql.dto.StudentDTO;

public class DeleteUtil
{
	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		
		dao.deleteByMarks(75);
	}
}

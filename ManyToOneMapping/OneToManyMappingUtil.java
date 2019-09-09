package edu.jspiders.manytoonemapping.util;

import edu.jspiders.manytoonemapping.dao.OneToManyMappingDAO;

public class OneToManyMappingUtil 
{
	public static void main(String[] args) 
	{
		OneToManyMappingDAO dao = new OneToManyMappingDAO();
		
		dao.createBatches(1);
	}
}

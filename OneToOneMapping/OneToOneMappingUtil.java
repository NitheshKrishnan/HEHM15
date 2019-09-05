package edu.jspiders.onetoonemapping.util;

import edu.jspiders.onetoonemapping.dao.OneToOneMappingDAO;
import edu.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import edu.jspiders.onetoonemapping.dto.TrainerProfessionalDTO;

public class OneToOneMappingUtil
{
	public static void main(String[] args) 
	{
//		TrainerProfessionalDTO trainer = new TrainerProfessionalDTO("Imtiyaz", "Ahmed", "Senior Software Engg. ", 250000);
//	
//		TrainerPersonalDTO personal = new TrainerPersonalDTO("Kannada", "Mysore", "Married");
//		
//		OneToOneMappingDAO dao = new OneToOneMappingDAO();
//		
//		dao.create(trainer, personal);
		
		OneToOneMappingDAO dao = new OneToOneMappingDAO();
		
		dao.readById(1);
	}
}

package edu.jspiders.employeeapp.mainapp;

import java.util.Scanner;

import edu.jspiders.employeeapp.dao.EmployeeDAO;
import edu.jspiders.employeeapp.dto.EmployeeDTO;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		
		System.out.println("Welcome To Employee Hibernate Operation");
		System.out.println("---------------------------------------");
		
		while(true)
		{
			System.out.println("Operations Available are ");
			System.out.println("-------------------------");
			System.out.println("1. Create 2. Read 3. Update 4. Delete 5. Exit");
			System.out.println("---------------------------------------------");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: EmployeeDTO employee = new EmployeeDTO();
					System.out.println("Enter the Employee Id");
					employee.setEmpId(sc.next());
					System.out.println("Enter the Employee First Name");
					employee.setFirstName(sc.next());
					System.out.println("Enter the Employee Last Name");
					employee.setLastName(sc.next());
					System.out.println("Enter the Employee Gender");
					employee.setGender(sc.next());
					System.out.println("Enter the Employee Designation");
					employee.setDesignation(sc.next());
					System.out.println("Enter the Employee Salary(in Lakhs)");
					employee.setSalary(sc.nextDouble());
					dao.create(employee);
					break;
					
			case 2: System.out.println("Enter the Employee Id to be searched ");
					int empId = sc.nextInt();
					EmployeeDTO emp = dao.read(empId);
					if(emp != null)
						System.out.println(emp);
					else
						System.out.println("Employee with the given id is not present");
					
					break;
					
			case 3: System.out.println("Enter the Employee Id to be updated");
					empId = sc.nextInt();
					emp = dao.read(empId);
					
					if(emp!= null)
					{
						System.out.println("Enter the Attribute to be updated ");
						System.out.println("----------------------------------");
						System.out.println("Choices are");
						System.out.println("-----------");
						System.out.println("1. First Name 2. Last Name 3. Designation 4. Salary ");
						System.out.println("----------------------------------------------------");
						System.out.println("Enter your choice");
						int ch = sc.nextInt();
						if(ch == 1)
						{
							System.out.println("Enter the New First Name");
							String name = sc.next();
							dao.update(emp,name,ch);
						}
						else if(ch == 2)
						{
							System.out.println("Enter the New Last Name");
							String name = sc.next();
							dao.update(emp,name,ch);
						}
						else if(ch == 3)
						{
							System.out.println("Enter the New Designation Name");
							String name = sc.next();
							dao.update(emp,name,ch);
						}
						else if(ch == 4)
						{
							System.out.println("Enter the New Salary");
							Double salary = sc.nextDouble();
							dao.update(emp,salary,ch);
						}
					}
					else
						System.out.println("Employee with the given id is not present");
					
					break;
					
			case 4: System.out.println("Enter the Employee Id to be deleted");
					empId = sc.nextInt();
					emp = dao.read(empId);
					if(emp!= null)
						dao.delete(emp);
					else
						System.out.println("Employee with the given id is not present");
					
					break;
			
			case 5: System.out.println("Thank You !!!! Come Back again ");
					System.exit(0);
					
			default: System.out.println("Wrong Choice.... Try Again");
			}// end of switch
		}// end of while
	}// end of main
}// end of class

package org.emp;

import org.company.*;
import org.client.*;
import org.project.*;

public class Employee 
{

	public void empName()
	{
		System.out.println("Employee Name :- MOHAN K");
	}

	public static void main(String[] args) 
	{
	    Employee emp=new Employee();
	    Company comp=new Company();
	    Client cli=new Client();
	    Project pro=new Project();
	    
	    emp.empName();
	    comp.companyName();
	    cli.clientName();
	    pro.projectName();
	 }
	
}

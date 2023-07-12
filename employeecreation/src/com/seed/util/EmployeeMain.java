package com.seed.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.seed.employee.Employee;
import com.seed.employee.contract.ContractBasedEmployee;
import com.seed.employee.contract.ContractTechnicalAssociate;
import com.seed.employee.permanent.PermanentEmployee;
import com.seed.employee.permanent.ProjectManager;
import com.seed.employee.permanent.TechnicalAssociate;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> p1 = new ArrayList<Employee>();
		
		p1.add(new ProjectManager("Jack", "Smith",LocalDate.of(2023, 10, 20),3,Arrays.asList("PMI")));
		
		p1.add(new TechnicalAssociate("David", "Williams", LocalDate.of(2023, 10, 30),3,3,Arrays.asList("SCJP","SCBCD")));
		p1.add(new ContractTechnicalAssociate("Jeff", "Brown", LocalDate.of(2024, 1, 20), "Susan",50, 500,Arrays.asList("SCWCD","SCJP")));

		for(Employee pe : p1) {
			System.out.println(pe);			
		}	
		
		System.out.println("------Permanent Technical Associate Details------");
		TechnicalAssociate e1 = new TechnicalAssociate("David", "Williams", LocalDate.of(2024, 1, 20),3,3,Arrays.asList("SCJP","SCBCD"));
		System.out.println("tostring method : " + e1.toString());
		System.out.println("Permanent Technical Associate Salary : " + e1.calculateSalary());
		List<String> c1 = e1.certiList();
		System.out.println("Certification List of Permanent Technical Associate : ");
		for(String s : c1) {
			System.out.println(s);
		}
		
		System.out.println("------Permanent Project Manager Details------");
		ProjectManager e2 = new ProjectManager("Jack", "Smith", LocalDate.of(2023, 10, 30),3,Arrays.asList("PMI"));
		System.out.println("tostring method : " + e2.toString());
		System.out.println("Permanent Project Manager Salary : " + e2.calculateSalary());
		List<String> c2 = e2.certiList();
		System.out.println("Certification List of Permanent Project Manager : ");
		for(String s : c2) {
			System.out.println(s);
		}
		
		System.out.println("------Contract Technical Associate Details------");
		ContractTechnicalAssociate e3 = new ContractTechnicalAssociate("Jeff", "Brown",LocalDate.of(2023, 10, 20), "Susan",50, 500,Arrays.asList("SCWCD","SCJP"));
		System.out.println("tostring method : " + e3.toString());
		System.out.println("Contract Technical Associate Salary : " + e3.calculateSalary());
		List<String> c3 = e3.certiList();
		System.out.println("Certification List of Contract Technical Associate : ");
		for(String s : c3) {
			System.out.println(s);
		}
			
		System.out.println("Total no of Permanent Employees : " + PermanentEmployee.getPempId());
		System.out.println("Total no of Contract Based Employees : " + ContractBasedEmployee.getCempId());
		
	}
}

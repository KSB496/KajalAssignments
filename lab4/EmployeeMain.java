package lab4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> p1 = new ArrayList<Employee>();
		ArrayList<ContractBasedEmployee> c1 = new ArrayList<ContractBasedEmployee>();
		
		p1.add(new PermanentEmployee("Kajal", "Bhagat",2000,"A", LocalDate.of(2023,5,12)));
		p1.add(new PermanentEmployee("Kishu", "Patel",1500,"B",LocalDate.of(2023, 8, 18)));
		p1.add(new ContractBasedEmployee("Dax", "Shah",1700,"A",LocalDate.of(2023, 12, 19),"Thomas",30,300));
		p1.add(new ContractBasedEmployee("Zeal", "Patel",1000,"C",LocalDate.of(2023, 10, 25),"Robert",40,400));	
		p1.add(new ProjectManager("Jack", "Smith", 1800, "D", LocalDate.of(2023, 10, 20)));
		p1.add(new TechnicalAssociate("David", "Williams", 1900, "C", LocalDate.of(2023, 10, 30)));
		p1.add(new ContractTechnicalAssociate("Jeff", "Brown", 2500, "B", LocalDate.of(2024, 1, 20), "Susan",50, 500));
		
		for(Employee pe : p1) {
			System.out.println(pe);			
		}	
		
		System.out.println("Total no of Permanent Employees : " + PermanentEmployee.getPempId());
		System.out.println("Total no of Contract Based Employee Employees : " + ContractBasedEmployee.getCempId());
		
	}
}

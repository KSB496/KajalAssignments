package lab6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> p1 = new ArrayList<Employee>();
		
		p1.add(new PermanentEmployee("Kajal", "Bhagat","A", LocalDate.of(2023,5,12)));
		p1.add(new PermanentEmployee("Kishu", "Patel","B",LocalDate.of(2023, 8, 18)));
		p1.add(new ContractBasedEmployee("Dax", "Shah","A",LocalDate.of(2023, 12, 19),"Thomas",30,300));
		p1.add(new ContractBasedEmployee("Zeal", "Patel","C",LocalDate.of(2023, 10, 25),"Robert",40,400));
		
		p1.add(new ProjectManager("Jack", "Smith", "D", LocalDate.of(2023, 10, 20),3,Arrays.asList("PMI")));
		
		p1.add(new TechnicalAssociate("David", "Williams", "C", LocalDate.of(2023, 10, 30),3,3,Arrays.asList("SCJP","SCBCD")));
		p1.add(new ContractTechnicalAssociate("Jeff", "Brown", "B", LocalDate.of(2024, 1, 20), "Susan",50, 500,Arrays.asList("SCWCD","SCJP")));
		
		
		for(Employee pe : p1) {
			System.out.println(pe);			
		}	
		
		Employee e1 = new TechnicalAssociate("David", "Williams", "C", LocalDate.of(2023, 10, 30),3,3,Arrays.asList("SCJP","SCBCD"));
		System.out.println(e1.toString());
		
		System.out.println("Permanent Technical Associate Salary : " + e1.calculateSalary());
		
		System.out.println("Total no of Permanent Employees : " + PermanentEmployee.getPempId());
		System.out.println("Total no of Contract Based Employee Employees : " + ContractBasedEmployee.getCempId());
		
	}
}

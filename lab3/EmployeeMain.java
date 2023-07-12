package lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> p1 = new ArrayList<Employee>();
		ArrayList<ContractBasedEmployee> c1 = new ArrayList<ContractBasedEmployee>();
		
		p1.add(new PermanentEmployee("kajal", "Bhagat",2000,"A", LocalDate.of(2023,5,12)));
		p1.add(new PermanentEmployee("kishu", "Patel",1500,"B",LocalDate.of(2023, 8, 18)));
		p1.add(new ContractBasedEmployee("dax", "Shah",1700,"A",LocalDate.of(2023, 12, 19),"Thomas",30,300));
		p1.add(new ContractBasedEmployee("Zeal", "Patel",1000,"C",LocalDate.of(2023, 10, 25),"Robert",40,400));	
		
		for(Employee pe : p1) {
			System.out.println(pe);			
		}	
		
		System.out.println("Total no of Permanent Employees : " + PermanentEmployee.getPempId());
		System.out.println("Total no of Contract Based Employee Employees : " + ContractBasedEmployee.getCempId());
		
	}
}

package lab1;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		a1.add(new Employee("kajal", "Bhagat",2000,"A","12:2023"));
		a1.add(new Employee("kishu", "Patel",1500,"B","09:2023"));
		a1.add(new Employee("dax", "Shah",1700,"A","08:2023"));
		a1.add(new Employee("Zeal", "Patel",1000,"C","11:2023"));	
		
		for(Employee e : a1) {
			System.out.println(e);			
		}
		
		System.out.println("Employees Created : " +Employee.getEmpId());
		
	}
}

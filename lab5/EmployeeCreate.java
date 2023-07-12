package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCreate {
	
	private ArrayList<Employee> lst;
	Scanner s1;
	Scanner s;
	
	public EmployeeCreate() {
		lst = new ArrayList<Employee>();
		/*s1 = new Scanner(System.in);
		s = new Scanner(System.in);*/
	}

	public void addEmployee(Employee emp) {
		/*System.out.println("Enter Employee First Name");
		String eFirstName = s1.nextLine();
		System.out.println("Enter Employee Last Name");
		String eLastName = s1.nextLine();
		System.out.println("Enter Employee Salary");
		double eSalary = s.nextDouble();
		System.out.println("Enter Employee Grade");
		String eGrade = s1.nextLine();
		System.out.println("Enter Employee Joining Date");
		String eDate = s1.nextLine();
		lst.add(new Employee(eFirstName,eLastName,eSalary,eGrade,eDate));*/
		lst.add(emp);
	}
	
	public void displayEmployee() {
		for(Employee e : lst) {
			System.out.println(e);
		}
	}
	
	public int getNoEmployee() {
		return lst.size();
	}

}

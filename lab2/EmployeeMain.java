package lab2;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		a1.add(new Employee("kajal", "Bhagat",2000,"A", LocalDate.of(2023,5,12)));
		a1.add(new Employee("kishu", "Patel",1500,"B",LocalDate.of(2023, 8, 18)));
		a1.add(new Employee("dax", "Shah",1700,"A",LocalDate.of(2023, 12, 19)));
		a1.add(new Employee("Zeal", "Patel",1000,"C",LocalDate.of(2023, 10, 25)));	
		
		for(Employee e : a1) {
			System.out.println(e);			
		}
		
		System.out.println(Employee.getEmpId());
		
	}
}

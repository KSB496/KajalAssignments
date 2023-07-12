package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class EmployeeTest {

	private EmployeeCreate empCreate;

	@BeforeEach
	public void callBefore() {
		empCreate = new EmployeeCreate();
		Employee e1 = new Employee("kajal", "Bhagat",2000,"A","12:2023");
		Employee e2 = new Employee("kishu", "Patel",1500,"B","09:2023");
		empCreate.addEmployee(e1);	
		empCreate.addEmployee(e2);
	}
	
	@Test
	public void testNoOfEmp() {
		Employee e3 = new Employee("dax", "Shah",1700,"A","08:2023");
		empCreate.addEmployee(e3);
		assertEquals(3, empCreate.getNoEmployee());
	}
	
	@Test
	public void displayEmployeeDetails() {
		empCreate.displayEmployee();
		assertEquals(2, empCreate.getNoEmployee());
	}
	
	
	
}

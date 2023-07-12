package lab2;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	private EmployeeCreate empCreate;

	@BeforeEach
	public void callBefore() {
		empCreate = new EmployeeCreate();
		Employee e1 = new Employee("kajal", "Bhagat",2000,"A",LocalDate.of(2023,5,12));
		Employee e2 = new Employee("dax", "Shah",1700,"A",LocalDate.of(2023, 12, 19));
		empCreate.addEmployee(e1);	
		empCreate.addEmployee(e2);
	}
	
	@Test
	public void testEmpNoOf() {
		Employee e3 = new Employee("kishu", "Patel",1500,"B",LocalDate.of(2023, 8, 18));
		empCreate.addEmployee(e3);
		assertEquals(3, empCreate.getNoEmployee());
	}
	
	@Test
	public void testDisplay() {
		empCreate.displayEmployee();
		assertEquals(2, empCreate.getNoEmployee());
	}
}

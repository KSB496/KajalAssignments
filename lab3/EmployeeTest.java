package lab3;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	private EmployeeCreate empCreate;
	

	@BeforeEach
	public void callBefore() {
		empCreate = new EmployeeCreate();
		PermanentEmployee pe1 = new PermanentEmployee("kajal", "Bhagat",2000,"A", LocalDate.of(2023,5,12));
		ContractBasedEmployee ce1 = new ContractBasedEmployee("dax", "Shah",1700,"A",LocalDate.of(2023, 12, 19),"Thomas",30,300);
		empCreate.addEmployee(pe1);			
		empCreate.addEmployee(ce1);
	}
	
	@Test
	public void testNoOfEmp() {
		PermanentEmployee pe2 = new PermanentEmployee("kishu", "Patel",1500,"B",LocalDate.of(2023, 8, 18));
		ContractBasedEmployee ce2 = new ContractBasedEmployee("Zeal", "Patel",1000,"C",LocalDate.of(2023, 10, 25),"Robert",40,400);
		empCreate.addEmployee(pe2);
		empCreate.addEmployee(ce2);
		assertEquals(4, empCreate.getNoEmployee());
	}
	
	@Test
	public void testDisplay() {
		empCreate.displayEmployee();
		assertEquals(2, empCreate.getNoEmployee());
	}
}

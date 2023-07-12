package lab4;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

	private EmployeeCreate empCreate;
	

	@BeforeEach
	public void callBefore() {
		empCreate = new EmployeeCreate();
		Employee pe1 = new PermanentEmployee("kajal", "Bhagat",2000,"A", LocalDate.of(2023,5,12));
		Employee ce1 = new ContractBasedEmployee("dax", "Shah",1700,"A",LocalDate.of(2023, 12, 19),"Thomas",30,300);
		Employee pe2 = new ProjectManager("Jack", "Smith", 1800, "D", LocalDate.of(2023, 10, 20));
		Employee pe3 = new TechnicalAssociate("David", "Williams", 1900, "C", LocalDate.of(2023, 10, 30));
		Employee ce2 = new ContractTechnicalAssociate("Jeff", "Brown", 2500, "B", LocalDate.of(2024, 1, 20), "Susan",50, 500);
		empCreate.addEmployee(pe1);			
		empCreate.addEmployee(ce1);
		empCreate.addEmployee(pe2);	
		empCreate.addEmployee(pe3);	
		empCreate.addEmployee(ce2);
	}
	
	@Test
	public void testNoOfEmp() {
		PermanentEmployee pe4 = new PermanentEmployee("kishu", "Patel",1500,"B",LocalDate.of(2023, 8, 18));
		ContractBasedEmployee ce3 = new ContractBasedEmployee("Zeal", "Patel",1000,"C",LocalDate.of(2023, 10, 25),"Robert",40,400);
		empCreate.addEmployee(pe4);
		empCreate.addEmployee(ce3);
		assertEquals(7, empCreate.getNoEmployee());
	}
	
	@Test
	public void testDisplay() {
		empCreate.displayEmployee();
		assertEquals(5, empCreate.getNoEmployee());
	}
}

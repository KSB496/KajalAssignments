package lab1;

public class Employee {

	private static int empId;
	private String empName;
	private double empSalary;
	private String empGrade;
	private String empDate;
	private int eId;
	
	public Employee() {
		super();
		
	}

	public Employee(String empFirstName, String empLastName, double empSalary, String empGrade, String empDate) {
		super();
		empId++;
		eId = empId;
		this.empName = empFirstName + empLastName;
		this.empSalary = empSalary;
		this.empGrade = empGrade;
		this.empDate = empDate;
	}
	
	public static int getEmpId() {
		return empId;
	}

	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}

	@Override
	public String toString() {

		return "Employee [ empId=" + eId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGrade=" + empGrade + ", empDate="
				+ empDate + "]";
	}
	
}

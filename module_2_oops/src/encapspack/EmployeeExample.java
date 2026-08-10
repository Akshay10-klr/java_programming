package encapspack;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

}

public class EmployeeExample {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpId(10);
		employee.setEmpName("Akshay Raj");
		employee.setEmpSalary(1000000);
		System.out.println("Employee id  : " + employee.getEmpId());
		System.out.println("Employee name  : " + employee.getEmpName());
		System.out.println("Employee salary : " + employee.getEmpSalary());
	}

}

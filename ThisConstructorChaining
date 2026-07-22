package thispack;
class Teacher{
	int empId;
	String empName;
	Teacher(){
		this(17);//it should be the first statement
		// constructor chaining checks for the constructor having int as parameter defined in the same order 
	}
	Teacher(int empId) {
		this(empId,"Akshay");
	}
	Teacher(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}
	Teacher(String empName,int empId){//this is never called 
		this.empId = empId;
		this.empName = empName;
	}
	public void display() {
		System.out.println("empid : "+empId);
		System.out.println("empname : "+empName);

	}
}
public class ThisConstructorChaining {

	public static void main(String[] args) {

		Teacher obj1=new Teacher();
		obj1.display();
	}

}

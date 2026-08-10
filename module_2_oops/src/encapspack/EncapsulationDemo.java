package encapspack;

class Student {
	private int rollNo;
	private String name;

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student student=new Student();
		student.setName("akshay");
		System.out.println(student.getName());
	}

}

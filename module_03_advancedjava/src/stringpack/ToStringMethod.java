package stringpack;
class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
public class ToStringMethod {

	public static void main(String[] args) {
		Student obj=new Student(10, "akshayRAj");

				System.out.println(obj);
	}

}

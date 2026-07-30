package inheritancepack;
class School{
	String schoolName="TKM";//private members cant be inherited
	public void displayDetails() {
		System.out.println("inside school class");
	}
}
class Teacher extends School{
	String teacherName="Anu";
	public void display() {
		System.out.println("inside teacher class");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {

		Teacher obj=new Teacher();
		obj.display();
		obj.displayDetails();
		System.out.println(obj.schoolName+"  "+obj.teacherName);
		
	}

}

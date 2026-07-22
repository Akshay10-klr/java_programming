package thispack;

import java.util.Scanner;

class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public void print() {
		System.out.println("RollNo : "+rollNo);
		System.out.println("name : "+name);
	}
	
	
}
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int rollNo;
		String name;
		System.out.println("Enter the name ");
		name=sc.nextLine();
		System.out.println("Enter the Rollno ");
		rollNo=sc.nextInt();
		Student obj=new Student(rollNo, name);
		obj.print();
		sc.close();
	}

}

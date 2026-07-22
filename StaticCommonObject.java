package staticpack;
class McaStudent{
	String name;
	int rollNo;
	static String courseName="MCA";
	
	McaStudent(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	void display() {
		System.out.println("Name of the student : "+name);
		System.out.println("Roll number of student : "+rollNo);
		System.out.println("Course name : "+courseName);
	}

}
public class StaticCommonObject {

	public static void main(String[] args) {
		McaStudent studentOne=new McaStudent("Akshay", 17);
		studentOne.display();
		McaStudent studentTwo=new McaStudent("Anu", 25);
		studentTwo.display();
		System.out.println("coursename : "+McaStudent.courseName);

	}

}

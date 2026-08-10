package interfacepack;

interface Student { // interface student
	void studentDetails(); // method inside student which is public and abstract
}

interface Teacher { // interface Teacher
	void staffDetails();
}

class Management {
	void managementDetails() {
		System.out.println("managemt details");
	}
}

class StateBoard extends Management implements Teacher { // class stateboard extends management and implemets Teacher
	public void staffDetails() {
		System.out.println("Staffs under the board");
	}

}

class School implements Student, Teacher { // class School implements two interfaces student and teacher
	public void studentDetails() {
		System.out.println("student details");
	}

	public void staffDetails() {
		System.out.println("staff deatails");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		School school = new School();
		school.staffDetails();
		school.studentDetails();
		StateBoard state = new StateBoard();
		state.staffDetails();

	}

}

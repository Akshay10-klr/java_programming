package collage.cse.staff;

public class Teacher {

	int id;
	String name;
	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void teacherCse() {
		System.out.println("teaching cse subject");
		System.out.println("teacher name : "+name);
		System.out.println("teacher id : "+id);
	}
}

package collage.civil.staff;

public class Teacher {

	int id;
	String name;
	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void teacherCivil() {
		System.out.println("tecahing civil subject");
		System.out.println("teacher name : "+name);
		System.out.println("teacher id : "+id);
	}
	
}

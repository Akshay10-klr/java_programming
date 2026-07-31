package collage.staff;

import collage.cse.staff.Teacher;



public class Test {

	public static void main(String[] args) {
		Teacher obj=new Teacher(10, "Akshay");
		//since both package have same class with same varibles we cnat import the second class
		//we need to create object directly specifying the path
		collage.civil.staff.Teacher civil=new collage.civil.staff.Teacher(11,"ANu");

		obj.teacherCse();
		civil.teacherCivil();
	}

}

package secondpack;

import firstpack.Teacher;

public class Exam extends Teacher{
	public void print() {  //all the members in class get all methods or values irrespective of their access modifier
		System.out.println(batch);
		System.out.println(id);
		System.out.println(name);

		System.out.println(marks);
		System.out.println(batch);

}

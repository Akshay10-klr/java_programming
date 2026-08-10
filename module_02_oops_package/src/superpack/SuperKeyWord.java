package superpack;
class Person{
	int id;
	String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
class Employee extends Person{
	double salary;

	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		
	}

}

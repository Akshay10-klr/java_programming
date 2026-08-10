package operators;

class Employee{}

public class InstanceOfDemo {

	public static void main(String[] args) {

		String str="luminar";
		Employee emp=new Employee();
		System.out.println("Is str an object(instance) of string "+(str instanceof String));
		System.out.println("is emp an object(instance of Employee "+(emp instanceof Employee));
		
	}

}

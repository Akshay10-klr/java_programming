import java.util.Scanner;
//employee class
class Employee{
	int id;
	String name;
	String email;
	
	Employee(int i,String n,String m){
		id=i;
		name=n;
		email=m;
	}
	void display() {
		System.out.println("Employee id :"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee mail:"+email);

	}
}
//main class
public class ScannerDemo {
//entry point of java program
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int id;
		String name;
		String email;
		System.out.println("Enter the name of the employee");
		name=sc.nextLine();
		System.out.println("Enter the id of the employee");
		id=sc.nextInt();
		System.out.println("Enter the email of the employee");
		email=sc.next();
		
		Employee emp=new Employee(id,name,email);
		emp.display();
		sc.close();

	}

}

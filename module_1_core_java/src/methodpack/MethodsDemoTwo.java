package methodpack;
class Employee{
	void show() {
		System.out.println();
	}
	int sum() {
		return 20+30;
	}
	void display(String name,int age) {
		System.out.println("My name is "+name+"and i am "+age+"years old");
	}
	double div(int a,int b) {
		System.out.println("I am performing division on a and b");
		return a/b;
	}
}
public class MethodsDemoTwo {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.show();
		emp.display("Akshay", 22);
//		System.out.println(emp.sum());
//		
//		System.out.println(emp.div(500, 10));

		int sum=emp.sum();
		System.out.println("sum = "+sum);
		double div=emp.div(500,10);
		System.out.println("division result = "+div);
	}

}

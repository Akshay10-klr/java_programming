package methodpack;

class Example {
	void show() {
		System.out.println();
	}

	int sum() {
		show();
		return 20 + 30;
	}

	void display(String name, int age) {
		System.out.println("My name is " + name + "and i am " + age + "years old");
		System.out.println("sum = " + sum());
	}

	double div(int a, int b) {
		display("Anu", 22);
		System.out.println("I am performing division on a and b");
		return a / b;

	}
}

public class MethodChaining {

	public static void main(String[] args) {
		Example emp = new Example();
//		emp.show();
//		emp.display("Akshay", 22);
////		System.out.println(emp.sum());
////		
////		System.out.println(emp.div(500, 10));
//
//		int sum=emp.sum();
//		System.out.println("sum = "+sum);
//		double div=emp.div(500,10);
//		System.out.println("division result = "+div);
		System.out.println("divison result is " + emp.div(500, 10));
	}

}

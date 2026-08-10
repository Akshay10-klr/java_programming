package methodpack;

public class FunctionExample {

	public static void printDemo() {
		System.out.println("hello");
	}

	public void display() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {

		FunctionExample obj=new FunctionExample();
		obj.display();
		//here display is non static so we have to create object of the class to call that function
		printDemo();// since method is inside the same class no need to call using class.
//	here main is static and methods is also static
	}

}

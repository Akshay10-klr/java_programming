package thispack;

class Demo {
	public static void printDemo() {
		System.out.println("hello");
	}
}

public class FunctionDemo {
	public static void main(String[] args) {
		Demo.printDemo();
	}
}
//static method can be called without creation object of the class
//but non static needs object to be called
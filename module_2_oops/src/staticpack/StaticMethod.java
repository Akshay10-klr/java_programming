package staticpack;
class TestDemo{
	int numOne;
	int numTwo;
	static int numThree;
	public static void display() {
		System.out.println("Inside display method");
//	non static variable cant be accessed inside a static method
//		System.out.println(numOne+numTwo+numThree);
	}
	void show() {
		System.out.println("Inside show method");
		
		System.out.println(numOne+numTwo+numThree);
	
	}
}
public class StaticMethod {

	public static void main(String[] args) {

		TestDemo obj=new TestDemo();
		obj.show();
		TestDemo.display();
		
	}

}

package interfacepack;
interface CEO{
	static int num=10; //static varibale
	String name="Akshay";  //instance variable
	void print();
	     
	static void display() {
		System.out.println("inside static method");
	}
//	static{
//		System.out.println("inside Ststic block");   //ststic block is not allowed
//	}
//	{
//		System.out.println();        //non ststic block is not allowed
//	}
}
interface Manager{
	void print();// public abstract void print();//declaration/signature
}

interface Accountant extends CEO,Manager{
	void print();
}
interface HR {
	void print();

}

class Test implements CEO,HR{
	 public void print(){             //method should be public otherwise error occurs
		System.out.println("hello");
	}

}
class Company implements HR{        // another class company implents HR
	public void print() {
		System.out.println("inside company ");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Test test=new Test();
		test.print();
//		Test.display();          static method cant be called like this
		CEO.display();          //static method is not available in the child class
		Company company =new Company();
		company.print();
		System.out.println(Test.name);//static and instance variable can be accessed by child class
		System.out.println(Test.num);
	}

}

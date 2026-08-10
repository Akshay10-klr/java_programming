package abstractpack;
abstract class Demo{
	int num=10;                      //instance variable
	static String name="Akshay";       //static variable
	abstract void display();          //abstract method can't define abstract class
	static void printDetails() {       //static method
		System.out.println("works");
	}
	Demo(){
		System.out.println("demo constructor");
		num=20;
	}
	static{
		System.out.println("hello");//static block
	}
	{//non static block
		System.out.println("non static block");
	}
}

abstract class Trail extends Demo{   //another abstract class and abstract method
	abstract void print();
}
class Test extends Demo{              //Test inherits abstract class Demo
	void display() {                  //abstract method is defined
		System.out.println(num);      //instance variable can be accessed
		System.out.println(name);     //static variable can be accessed
		
	}
}
class TestDemo extends Trail{         // another class TestDemo Trail abstract class which inherits an abstract class Demo
	void print() {    
		num=20;       //redefined both abstract method from both abstract class else error occurs
		System.out.println(num);
	}                                //both instance and static variable can be accessed inside this class
	void display() {
		name="Anu";
		System.out.println(name);
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		Test test=new Test();           //created object for Test class
		test.display();                 //display method can be invoked
		Test.printDetails();            //since printDetails is static method it can be called using class name
		//prints everything 
		TestDemo obj=new TestDemo();
		obj.display();
		obj.print();
		TestDemo.printDetails();
		//Demo demo=new Demo(); we can't create object for abstract class
	}

}

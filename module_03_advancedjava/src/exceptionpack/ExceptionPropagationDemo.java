package exceptionpack;

public class ExceptionPropagationDemo {
	void display() {
		int data;
		data=50/0;
		System.out.println(data);
	}
	void print() {
		display();
	}
	void test() {
		try {
			print();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExceptionPropagationDemo ex=new ExceptionPropagationDemo();
		ex.test();
		System.out.println("rest of the code");
		
	}

}

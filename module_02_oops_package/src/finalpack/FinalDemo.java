package finalpack;
final class parent{
	final void display() {
		System.out.println("inside parent class");
	}
}
class child extends parent{//cannot extend a final class
	
	void display() { //cannot override since display method is set as final in parent class
		System.out.println("inside child class");
	}
}
class FinalVariable{
	final int num=20;
	void print(int no) {
		num=no;//num is set as final so it cant be changed
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
	}

}

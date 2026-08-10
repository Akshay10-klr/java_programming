package thispack;
class CurrentDemo{
	CurrentDemo getDisplay() {
	   return this;
	}
	void print() {
		System.out.println("Inside print");
	}
	
}
public class CurrentInstyanceOfClass {

	public static void main(String[] args) {

		CurrentDemo obj=new CurrentDemo();
		obj.getDisplay().print();
	}

}

package thispack;

class ThisParameter{
	int age;
	void print() {
		display(this);
	}
	void display(ThisParameter value) {
		System.out.println("inside display");
	}
}
public class MethodParamterCall {

	public static void main(String[] args) {
 
		
		ThisParameter obj=new ThisParameter();
		obj.print();
		
	}

}

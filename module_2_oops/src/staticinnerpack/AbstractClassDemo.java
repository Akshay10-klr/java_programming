package staticinnerpack;
abstract class AbstractInner{
	abstract public void display();
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		AbstractInner obj =new AbstractInner() {
			public void display() {
				System.out.println("abstract annonymous");
				}
			};
			obj.display();
			

	}

}

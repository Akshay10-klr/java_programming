package staticinnerpack;
interface MyInter{
	public abstract void display();
}

/*
 * class TestInterface implements MyInter{
 * 
 * 
 * public void display() { System.out.println("display method implemented");
 * 
 * }
 * 
 * }
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		/*
		 * TestInterface obj =new TestInterface(); obj.display();
		 */
//Annonymous inner class
		MyInter mi=new MyInter() {
			public void display() {
				System.out.println("inside MiInter");
			}
		};
		mi.display();
	}

}

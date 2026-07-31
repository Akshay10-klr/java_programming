package firstpack;

class PrivateAcess{//same package same class
	private int id=50;
	String name="Akshay";
	protected float marks=500;
	public String batch="java";
	
	public void print() {  //all the members in class get all methods or values irrespective of their access modifier
		System.out.println(batch);
		System.out.println(id);
		System.out.println(name);

		System.out.println(marks);
		System.out.println(batch);
	}
}


public class PrivateAcessModifierDemo {

	public static void main(String[] args) {
		PrivateAcess pvrt=new PrivateAcess();
		System.out.println(pvrt.batch);
		System.out.println(pvrt.id);  //private is is not accessible in another class
		System.out.println(pvrt.name);

		System.out.println(pvrt.marks);
		System.out.println(pvrt.batch);
	}

}

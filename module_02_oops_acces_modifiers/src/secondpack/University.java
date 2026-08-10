package secondpack;
import firstpack.PrivateAcess;

public class University {

	public static void main(String[] args) {
		
		PrivateAcess pvrt=new PrivateAcess();
		System.out.println(pvrt.batch);
		System.out.println(pvrt.id);  //private is is not accessible in another class
		System.out.println(pvrt.name);

		System.out.println(pvrt.marks);
		System.out.println(pvrt.batch);
	}

}

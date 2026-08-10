package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		String s1="java";//value is stored in constant string pool and the address is assigned to s1
		String s2="java";//since it is also java as in s1 the same address is stored in s2
		String s3=new String("java");//here we assign value using objects so separate memory is allocated in heap
		String s4=new String("java");//same for this one
		/*
		 * System.out.println("s1==s2  "+(s1==s2));
		 * System.out.println("s1==s3  "+(s1==s3));
		 * System.out.println("s2==s3  "+(s2==s3));
		 * System.out.println("s3==s4  "+(s4==s3));
		 */
	//======================================================================	
		System.out.println(s1);
		System.out.println(s2);
		s2=s2.concat("programmer");//we concatenate another string to s2 so another memory location is allocated
		System.out.println(s1);
		System.out.println(s2);
		//======================================================================
		System.out.println("s2==s3  "+(s3==s4));
		System.out.println("s2==s3  "+(s3.equals(s4)));
		//======================================================================
		
		String userName="Akshay";
		String passWord="Akshay";
		if(userName==passWord) {
			System.out.println("login sucess");
		}else {
			System.out.println("login failed");
		}
		

	}

}

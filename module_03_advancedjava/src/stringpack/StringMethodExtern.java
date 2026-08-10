package stringpack;

public class StringMethodExtern {

	public static void main(String[] args) {

		/*
		 * String s1=new String("luminar"); String s2="luminar";
		 * System.out.println("s1==s2"+(s1==s2)); String s3=s1.intern();
		 * System.out.println("s3==s2"+(s3==s2));
		 */
		int num=110;
		String value= String.valueOf(num);
		System.out.println("num+value"+(num+value));
	}

}

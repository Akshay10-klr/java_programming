package operators;

public class AssignmentDemo {

	public static void main(String[] args) {
		int no=4,num;
		num=no;
		System.out.println("num+=no :"+(num+=no));
		System.out.println("num-=2 :"+(num-=2));
		System.out.println("num*=4 :"+(num*=4));
		System.out.println("num/=2 :"+(num/=2));
		System.out.println("num%=3 :"+(num%=3));

	}

}

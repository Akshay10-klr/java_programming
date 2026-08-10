package operators;

import java.util.Scanner;

public class LargaestOfTwo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a,b;
		String result;
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		result=(a>b)? a+"is largest":b+" is largest";
		System.out.println(result);
		
		
		
		
	}

}

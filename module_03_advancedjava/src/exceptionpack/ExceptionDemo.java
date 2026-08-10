package exceptionpack;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int first;
		int second;
		int result;
		System.out.println("enter the first number");
		first=sc.nextInt();
		System.out.println("enter the second number");
		second=sc.nextInt();
		try {
			result=first/second;
			System.out.println("result= "+result);
		}catch(ArithmeticException ex){
			System.out.println(ex);
		}
		System.out.println("hi");
		sc.close();


	}

}

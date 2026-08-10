package classwork;

import java.util.Scanner;

public class GreatestOfTwo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int numOne;
		int numTwo;
		System.out.println("Enter the first number");
		numOne=sc.nextInt();
		System.out.println("Enter the second number");
		numTwo=sc.nextInt();
		if(numOne>numTwo) {
			System.out.println("Greatest= "+numOne);
		}else {
			System.out.println("Greatest= "+numTwo);

		}
		sc.close();
	}

}

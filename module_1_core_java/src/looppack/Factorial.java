package looppack;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int num;
		int fact=1;
		System.out.println("Enter the number whose factorial is to be taken");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial = "+fact);
		sc.close();
	}

}

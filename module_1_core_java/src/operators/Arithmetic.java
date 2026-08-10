package operators;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first,second;
		System.out.println("Enter the first number");
		first=sc.nextInt();
		System.out.println("Enter the second number");
		second=sc.nextInt();
		System.out.println("Addition :"+(first+second));
		System.out.println("Substration :"+(first-second));
		System.out.println("multiplication :"+(first*second));
		System.out.println("division :"+(first/second));
		System.out.println("modular:"+(first%second));
		sc.close();

	}

}

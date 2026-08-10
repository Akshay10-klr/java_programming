package decisionpack;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age > 18)
			System.out.println("Eligible for voting");
		System.out.println("Thank You");
		sc.close();
	}

}

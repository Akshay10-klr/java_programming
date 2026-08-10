package classwork;

import java.util.Scanner;

public class NestedIfExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int age;
		char gender;
		System.out.println("Enter the age ");
		age=sc.nextInt();
		if(age>18) {
			System.out.println("Enter the gender male or female");
			gender=sc.next().charAt(0);
			if(gender=='M'||gender=='m') {
				System.out.println("Eligible for covaccine");
			}else if(gender=='F'||gender=='f') {
				System.out.println("Eligible for Sputnik");

			}
		}else {
			System.out.println("no vaccine");
		}
		sc.close();
	}

}

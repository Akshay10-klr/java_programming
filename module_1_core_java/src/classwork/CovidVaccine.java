package classwork;

import java.util.Scanner;

public class CovidVaccine {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age");
		age=sc.nextInt();
		if(age>=60) {                                          //checking if age is above 60
			System.out.println("Eligible for covaccine");
		}else if(age>=35 && age<60) {                         //checking if age is between 35 and 60
			System.out.println("Eligible for covisheild");
		}else if(age>=14 && age<35) {                             //checking if age is between 14 and 35
			System.out.println("Eligible for sputnik");
		}else {                                                  //age below 14
			System.out.println("not eligible for vaccination");
		}
		sc.close();
	}

}

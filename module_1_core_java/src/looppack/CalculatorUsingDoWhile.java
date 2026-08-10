package looppack;

import java.util.Scanner;

public class CalculatorUsingDoWhile {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int numOne;
		int numTwo;
		int option;
		char condition;
		System.out.println("Enter the first number");
		numOne = sc.nextInt();
		System.out.println("Enter the second number");
		numTwo = sc.nextInt();
		do {
			System.out.println("Menu");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter the operation to be performed");
			option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Result = " + (numOne + numTwo));
				break;
			case 2:
				System.out.println("Result = " + (numOne - numTwo));
				break;
			case 3:
				System.out.println("Result = " + (numOne * numTwo));
				break;
			case 4:
				System.out.println("Result = " + (numOne / numTwo));
				break;
			case 5:
				System.out.println("Exiting program");
				System.exit(0);
			default:
				System.out.println("invalid");
				break;
			}
			System.out.println("Do you want to continue Y or N");
			condition=Character.toLowerCase(sc.next().charAt(0));
			}while(condition =='y');
		sc.close();
	}

}

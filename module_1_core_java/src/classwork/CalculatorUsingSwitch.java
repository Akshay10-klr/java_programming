package classwork;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numOne;
		int numTwo;
		char operator;
		System.out.println("Enter the first number");
		numOne = sc.nextInt();
		System.out.println("Enter the second number");
		numTwo = sc.nextInt();
		System.out.println("which operation is to be performed : (+,-,*./)");
		operator = sc.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println("Result = " + (numOne + numTwo));
			break;
		case '-':
			System.out.println("Result = " + (numOne - numTwo));
			break;
		case '*':
			System.out.println("Result = " + (numOne * numTwo));
			break;
		case '/':
			System.out.println("Result = " + (numOne / numTwo));
			break;
		case '%':
			System.out.println("Result = " + (numOne % numTwo));
			break;
		default:
			System.out.println("invalid");
			break;

		}

		sc.close();
	}

}

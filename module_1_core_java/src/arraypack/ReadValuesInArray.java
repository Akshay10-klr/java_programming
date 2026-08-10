package arraypack;

import java.util.Scanner;

public class ReadValuesInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		int[] num;
		System.out.println("Enter the size of array");
		size = sc.nextInt();

		num = new int[size];
		System.out.println("Enter the values");

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Even numbers");
		for (int i = 0; i < size; i++) {

//			System.out.println(num[i]);
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		sc.close();
	}

}

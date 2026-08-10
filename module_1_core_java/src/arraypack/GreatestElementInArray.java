package arraypack;

import java.util.Scanner;

public class GreatestElementInArray {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int size;
		int[] num;
		int greatest=0;
		System.out.println("Enter the size of array");
		size = sc.nextInt();

		num = new int[size];
		System.out.println("Enter the values");

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(num[i]>greatest) {
				greatest=num[i];
			}
		}
		System.out.println("greatest element is = "+greatest);
		sc.close();
	}

}

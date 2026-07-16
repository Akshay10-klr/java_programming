package arraypack;

import java.util.Scanner;

public class ReplaceNegativeWithZero {

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
		for(int i=0;i<size;i++) {
			if(num[i]<0) {
				num[i]=0;
			}
		}
		System.out.println("After replacing negative values");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		sc.close();
	}

}

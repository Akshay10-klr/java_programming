package arraypack;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int[] num;
		int flag=0;
		System.out.println("Enter the size of array");
		size = sc.nextInt();

		num = new int[size];
		System.out.println("Enter the values");

		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			flag=0;
			for(int j=2;j<=num[i]/2;j++) {
				if(num[i]%j==0) {
				  flag=1;
				  break;
				}
			}
			if(flag==0) {
				System.out.print(num[i]+" ");
			}
		}
		sc.close();
		
	}

}

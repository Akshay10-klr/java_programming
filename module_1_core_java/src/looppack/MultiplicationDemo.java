package looppack;

import java.util.Scanner;

public class MultiplicationDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int start;
		int end;
		int iterator;
		System.out.println("Enter the starting number");
		start=sc.nextInt();
		System.out.println("Enter the ending number");
		end=sc.nextInt();
		System.out.println("Enter the iterator number");
		iterator=sc.nextInt();
		while(start<=end){
			System.out.println(start+"*"+iterator+"=" +(start*iterator));
			start++;
			
		}
		sc.close();
				
	}

}

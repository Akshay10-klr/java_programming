package looppack;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int num;
		int reverse=0;
		int reminder;
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num>0) {
			
			reminder=num%10;
			num=num/10;
			reverse=reverse*10+reminder;
			
		}
		System.out.println("reverse is = "+reverse);
		sc.close();
	}

}

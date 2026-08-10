package looppack;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int num;
		int reverse=0;
		int reminder;
		int temp;
		System.out.println("Enter the number");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			
			reminder=num%10;
			num=num/10;
			reverse=reverse*10+reminder;
			
	}
		if(temp==reverse) {
			System.out.println(temp+" = "+reverse+" It is palindrome");
			
		}else {
			System.out.println(temp+" != "+reverse+" It is not palindrome");

		}
		sc.close();

}
}

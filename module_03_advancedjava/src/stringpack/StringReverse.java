package stringpack;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String name;
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		name=sc.nextLine();
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.print(test.charAt(i));
			reverse=reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);

		System.out.println(name);
		sc.close();
	}

}

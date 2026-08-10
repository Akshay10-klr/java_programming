package classwork;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		char size;
		System.out.println("Enter the size of shirt");
		size=Character.toLowerCase(sc.next().charAt(0));
		switch(size) {
		case 's':
			System.out.println("your size is small");
			break;
		case 'm':
			System.out.println("your size is medium");
			break;
		case 'l':
				System.out.println("your size is large");
				break;
		default:
			System.out.println("invalid");
		}
		sc.close();
	}

}

package classwork;

import java.util.Scanner;

public class VowelsOrConsonent {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		char word;
		System.out.println("Enter the character to be checked");
		word=Character.toLowerCase(sc.next().charAt(0));
		switch(word) {
		case 'a':
			System.out.println("It is a vowel");
			break;
		case 'e':
			System.out.println("It is a vowel");
			break;
		case 'i':
			System.out.println("It is a vowel");
			break;
		case 'o':
			System.out.println("It is a vowel");
			break;
		case 'u':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("consonent");
		}
		sc.close();
	}

}

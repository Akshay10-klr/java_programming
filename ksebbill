package classwork;

import java.util.Scanner;

public class KsebBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int unit;
		System.out.println("Enter the units consumed");
		unit = sc.nextInt();
		if (unit >= 0 && unit <= 100) {
			System.out.println("you have to pay 100 rupees");
		} else if (unit >= 100 && unit <= 200) {
			System.out.println("you have to pay rupees:" + (100 + ((unit - 101) * 2)));

		} else if (unit >= 200 && unit <= 500) {
			System.out.println("you have to pay rupees:" + (100 + ((unit - 201) * 4)));

		} else if (unit >= 500 && unit <= 800) {
			System.out.println("you have to pay rupees:" + (100 + ((unit - 501) * 5)));

		} else if (unit >= 800 && unit <= 1000) {
			System.out.println("you have to pay rupees:" + (100 + ((unit - 801) * 10)));
		} else if (unit > 1000) {
			System.out.println("commerical purpose");
		}else {
			System.out.println("invalid");
		}
		sc.close();
	}
}

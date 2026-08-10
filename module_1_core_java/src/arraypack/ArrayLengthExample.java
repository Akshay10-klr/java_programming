package arraypack;

public class ArrayLengthExample {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Length of the array = " + numbers.length);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}

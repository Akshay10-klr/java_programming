package operators;

public class ShiftOperator {

	public static void main(String[] args) {

		int result,num=5;
		System.out.println("Binary of num :"+Integer.toBinaryString(num));
		result=num>>2;
		System.out.println("Binary of result :"+Integer.toBinaryString(result));
		result=num<<2;
		System.out.println("Binary of result :"+Integer.toBinaryString(result));


	}

}

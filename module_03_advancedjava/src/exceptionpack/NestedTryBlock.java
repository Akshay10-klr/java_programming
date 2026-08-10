package exceptionpack;

public class NestedTryBlock {

	public static void main(String[] args) {
		int data;
		int[] arr=new int[5];
		try {
			try {
				data=30/0;
			}catch(ArithmeticException ae) {
				System.out.println("going to divide by zero");
			}
			try {
			  arr[6]=4;
			}catch(ArrayIndexOutOfBoundsException ai) {
				ai.printStackTrace();
			}			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}

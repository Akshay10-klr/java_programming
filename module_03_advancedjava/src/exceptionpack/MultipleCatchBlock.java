package exceptionpack;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int[] arr=new int[5];
		try {
			arr[5]=30/0;
		}/*catch(Exception ex) {
			System.out.println("arithmetic exception");    the base exception must be last
			ex.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("arrayindex exception");    base class exception must be used during multiple exception statements
		}catch(ArithmeticException ae) {
			System.out.println("arithmetic exception");
		}*/
			catch(ArithmeticException ae) {
				System.out.println("arithmetic exception");
			}
			catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println("arrayindex exception");
			}
			catch(Exception ex) {
				System.out.println("arithmetic exception");
				ex.printStackTrace();
			}
		System.out.println("rest of the code");
	}

}

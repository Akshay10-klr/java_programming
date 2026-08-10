package arraypack;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {

		int[] num= {10,20,30,40};
		for(int element:num) {
			element=5;
			System.out.println(element);
		}
		for(int i=0;i<num.length;i++) {
			num[i]=5;
			System.out.println(num[i]);
		}

}
}

package arraypack;

public class MultiDimensionalArraySum {

	public static void main(String[] args) {

		int[][] numOne= {{1,2},{3,4}};
		int[][] numTwo= {{5,6},{7,8}};
		int  sum=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum+=numOne[i][j]+numTwo[i][j];
			}
		
		}
		System.out.println(sum);
	}

}

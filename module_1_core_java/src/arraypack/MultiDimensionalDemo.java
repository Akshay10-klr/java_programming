package arraypack;

public class MultiDimensionalDemo {

	public static void main(String[] args) {

		String[][] names= {{"Mr","Mrs","Ms"},{"Akshay","Anu"}};
		System.out.println(names[0][0] + names[1][0]);
	
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(names[i][j]);
			}
		}
		
		
	}

}

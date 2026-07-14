package arraypack;

import java.util.Scanner;

public class MultiDimensinalRead {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int [][] num;
		int row;
		int column;
		System.out.println("Enter the number oif rows");
		column=sc.nextInt();
		System.out.println("Enter the number of rows");
		row=sc.nextInt();
		num=new int[row][column];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				num[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elemts");
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<column;j++) {
//	           System.out.print(num[i][j]+" ");
//		}
//		System.out.println();
//		
//	}
		for(int rows[]:num) { //acess each row as an array
			for(int element:rows) {//from each array element is print
				System.out.print(element+" ");
			}
			System.out.println();
		}

}
}

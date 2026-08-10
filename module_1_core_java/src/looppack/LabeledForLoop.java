package looppack;

public class LabeledForLoop {

	public static void main(String[] args) {

		outerLoop:
		for(int i=1;i<=4;i++) {
			if(i==3) {
				break outerLoop;
			}
			innerLoop:
			for(int j=1;j<=4;j++) {
				if(j==3) {
					break innerLoop;
				}
				System.out.println(i+"\t"+j);
			}
			System.out.println();
		}
	}

}

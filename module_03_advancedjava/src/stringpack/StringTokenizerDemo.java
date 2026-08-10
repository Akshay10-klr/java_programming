package stringpack;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		//StringTokenizer st=new StringTokenizer("luminar:technolab:infopark:kochi");

		String luminar="luminar:technolab:infopark:kochi";
		StringTokenizer st=new StringTokenizer(luminar,":");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}

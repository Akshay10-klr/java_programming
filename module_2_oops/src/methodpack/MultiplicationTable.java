package methodpack;

import java.util.Scanner;
class Multiplication{
	public static void multiple(int start,int end,int iterator) {
		for(;start<=end;start++){                                      //loop iterates from start to end
			System.out.println(start+"*"+iterator+"=" +(start*iterator));
			
		}
	}
}
public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int start;
		int end;
		int iterator;
		System.out.println("Enter the starting number");
		start=sc.nextInt();
		System.out.println("Enter the ending number");
		end=sc.nextInt();
		System.out.println("Enter the iterator number");
		iterator=sc.nextInt();
		//here start ,end and iterator values are read ,so we get multiplication table of specified range 
		//like for the multiplcation table of 5 upto 10 and i dont want the table starting from 1
		//instead want from 5,i can give the start as 5 and end as 10 as iterator as 5 
		Multiplication.multiple(start, end, iterator);
		sc.close();
	}

}

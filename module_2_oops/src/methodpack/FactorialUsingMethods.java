package methodpack;

import java.util.Scanner;

class FactorialCompute{
	public long factorial(int num) {
		long result=1;             //since it is storing the result value range can be higher so long is used instead of int
		for(int i=1;i<=num;i++) {
			result=result*i;
		}
		return result;
	}
}
public class FactorialUsingMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);          //object for scanner is created
		int num;
		
		System.out.println("Enter the number whose factorial is to be taken");
		num=sc.nextInt();             //input is read to varible num
		FactorialCompute fact=new FactorialCompute();  //since method is non static created object of the class to call the method
		System.out.println("factorial=  "+fact.factorial(num));//method is called using object of class and num is passed as parameter
		sc.close();
	}

}

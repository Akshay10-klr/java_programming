package staticpack;

import java.util.Scanner;

class Bmi{
	static double calculateBmi(double height,double weight){
		return weight/(height*height);
		
		
	}
	static void displayCategory(double bmi) {
		if(bmi<18.5) {
			System.out.println("underweight");
		}else if(bmi>18.5 && bmi<25) {
			System.out.println("normal");
		}
		else {
			System.out.println("overweight");
		}
		
	}
}
public class BmiCalculator {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		double height;
		double weight;
		double bmi;
		System.out.println("Enter your height in meter");
		height=sc.nextDouble();
		System.out.println("Enter your weight in kg");
		weight=sc.nextDouble();
		bmi=Bmi.calculateBmi(height,weight);
		Bmi.displayCategory(bmi);
		sc.close();
	}

}

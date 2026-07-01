import java.util.Scanner;
//mobiledeatils class
class MobileDetails{
	String brand;
	String model_name;
	int price;
	
	MobileDetails(String b,String n,int p){
		brand=b;
		model_name=n;
		price=p;
	}
//	for displaying the output
	void display() {
		System.out.println("********Mobile Details********");
		System.out.println("Brand :"+brand);
		System.out.println("Model name:"+model_name);
		System.out.println("Price :"+price);

	}
	
}
//main class
public class Mobile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String brand;
		String model_name;
		int price;
		System.out.println("Enter the brand of the smartphone");
		brand=sc.next();
		System.out.println("Enter the model of the smartphone");
		model_name=sc.next();
		System.out.println("Enter the price of the smartphone");
		price=sc.nextInt();
		
		MobileDetails md=new MobileDetails(brand,model_name,price);
		md.display();
		sc.close();
		

	}

}

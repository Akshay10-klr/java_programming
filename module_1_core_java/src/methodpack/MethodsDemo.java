package methodpack;

class ShoppingCart {
	String name;
	double itemPrice;
	int number;
//parametrized method without return type
	public void addItem(String item, double price, int num) {
		name = item;
		itemPrice = price;
		number = num;

	}
//non parametized without returntype
	void displayItem() {
		System.out.println("Product name : "+name);
		System.out.println("product price : "+itemPrice);
		System.out.println("Total number of product bought : "+number);

	}
//	default method with returntype
	double returnPrice() {
		
		return itemPrice*number;
		
	}
	double applyDiscount(double discoutAmount){
		double total=returnPrice();
		return total-(total*(discoutAmount/100));
		
	}
	void display() {
		System.out.println("total amout = "+returnPrice());
		System.out.println("final amount after 30% discount = "+applyDiscount(30));
	}

}

public class MethodsDemo {

	public static void main(String[] args) {

	
		ShoppingCart itemOne=new ShoppingCart();
		itemOne.addItem("rice", 100, 10);
		itemOne.displayItem();
		itemOne.display();
		System.out.println("***************************************");
		ShoppingCart itemTwo=new ShoppingCart();
		itemTwo.addItem("wheat", 100, 20);
		itemTwo.displayItem();
		itemTwo.display();
	}

}

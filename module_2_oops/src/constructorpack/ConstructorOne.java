package constructorpack;

class Product{

	String name;
	int quantity;
	double price;
	public Product() {
		System.out.println("Products");
	}
	public Product(String name) {
		
		this.name = name;
	}
	public Product(String name, int quantity) {
		
		this.name = name;
		this.quantity = quantity;
	}
	public Product(String name, int quantity, double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Quantity : "+quantity);
		System.out.println("Price : "+price);

	}
}
public class ConstructorOne {

	public static void main(String[] args) {

		Product pOne=new Product();
		pOne.display();
		Product pTwo=new Product("Shoe");
		pTwo.display();
		Product pThree=new Product("Shoe");
		pTwo.display();
		
	}

}

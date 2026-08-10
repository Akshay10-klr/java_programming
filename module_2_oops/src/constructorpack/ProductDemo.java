package constructorpack;
class ProductDetails{
	int id;
	double price;
	String name;
	double rating;
	ProductDetails(int id,double price,String name,double rating){
		this.id=id;
		this.price=price;
		this.name=name;
		this.rating=rating;
	}
	public ProductDetails(int id, double price) {
		this.id = id;
		this.price = price;
		name="samsung";
		rating=4.5;
	}
	public ProductDetails() {
		id=12;
		price=50000;
		name="iphone";
		rating=4.75;
	}
	void display() {
		System.out.println("Product Deatils");
		System.out.println("product id : "+id);
		System.out.println("product price : "+price);
		System.out.println("product name : "+name);
		System.out.println("product rating : "+rating);
	}
}
public class ProductDemo {

	public static void main(String[] args) {
		ProductDetails productOne=new ProductDetails(10, 20000, "Shoe", 4.5);
		productOne.display();
		ProductDetails productTwo=new ProductDetails(11, 30000);
		productTwo.display();
		ProductDetails productThree=new ProductDetails();
		productThree.display();

	}

}

package thispack;
class CurrentClass{
public void displayRollNo() {
	System.out.println(17);
	this.displayName();
	
}
public void displayName() {
	System.out.println("Akshay Raj");
	this.displayStream();
}
private void displayStream() {
	System.out.println("Btech CSE");
}
}

public class ThisMethodChaining {

	public static void main(String[] args) {

		CurrentClass cc= new CurrentClass();
		cc.displayRollNo();
	}

}

package inheritancepack;

class company {
	String companyName = "Samsung";

	void display() {
		System.out.println("company name ");
	}
}

class Ceo extends company {
	String ceoName = "Chong lee";

	void show() {
		System.out.println("ceo name : " + ceoName);
	}
}

class Accountant extends Ceo {
	String accountantName = "Don lee";

	void displayDatails() {
		System.out.println("Accountant name : " + accountantName);
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {

		Accountant employee = new Accountant();
		employee.displayDatails();
		employee.display();
	}

}

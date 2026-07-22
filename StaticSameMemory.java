package staticpack;
class Test{
	static int num=0;

	Test(){
		num=num+10;
	}
	void printValue() {
		System.out.println("Number : "+num);
	}
}
public class StaticSameMemory {

	public static void main(String[] args) {

		Test testOne=new Test();
		
		Test testTwo=new Test();
		
		Test testThree=new Test();
		
		Test testFour=new Test();

		testOne.printValue();
		testTwo.printValue();
		testThree.printValue();
		testFour.printValue();
		
	}

}

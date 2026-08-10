package methodpack;

public class CallByValue {

	void change(int num) {
		System.out.println("sum = "+(num+10));
	}
	public static void main(String[] args) {

		int num=25;
		CallByValue obj=new CallByValue();
		obj.change(num);
		System.out.println(num);
	}

}

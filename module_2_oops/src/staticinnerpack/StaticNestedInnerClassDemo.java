package staticinnerpack;



class OuterClass{
	static int count=10;
	boolean flag=true;
	static class StaticNested{
		static String name="luminar";
		String place="kochi";
		public void display() {
			System.out.println("STATIC NESTED CLASS => NON STATIC METHOD");
			System.out.println("count in outer class : "+count);
			//System.out.println("flag in outer class : "+flag);//static class access only static
			System.out.println("static and non static variable in the static nested class "+name+"\t"+place);
		}
		public static void show() {
			System.out.println("STATIC NESTED CLASS => STATIC METHOD");
			System.out.println("static variable in static nested class : "+name);
			//System.out.println("non static variable in static nested class : "+place);//cant be called beacuse it is non static
		      // System.out.println("non static variable in outer class : "+flag);//cant
		}
	}
	//======================member inner class ===========

	class MemberInner{
		static String companyName="luminar";
		String companyPlace="kochi";
		public void displayDetails() {
			System.out.println("count in outer class : "+count);
			System.out.println("flag in outer class : "+flag);
			System.out.println("static variable own class "+companyName);
			System.out.println("non static variable in own class "+companyPlace);
		}
		public static void showDetails() {
			System.out.println("count in outer class : "+count);
			//System.out.println("flag in outer class : "+flag); non static
			System.out.println("static variable own class "+companyName);
			//System.out.println("non static variable in own class "+companyPlace);//non static
//			System.out.println("static variable in static nested class "+name);
//			System.out.println("non static varible in static nested class +" +place);
		}
		
	}
}


public class StaticNestedInnerClassDemo {

	public static void main(String[] args) {
	
		OuterClass.StaticNested obj=new OuterClass.StaticNested ();
		obj.display();
		OuterClass.StaticNested.show();
		
		OuterClass oc =new OuterClass();
		OuterClass.MemberInner mi =oc.new  MemberInner();
		mi.displayDetails();

	}

}

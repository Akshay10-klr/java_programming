package staticinnerpack;

class OuterDemo {
	int count = 10;
	static int no = 30;

	public void display(int num) {
		class LocalInner {
			int countInner = 25;
			static int noInner = 89;

			public void show() {
				String company = "luminar";
				// static String place="kochi";only access modifier for local varible is final
				final String place = "kochi";
				System.out.println("static varible outerDemom " + no);
				System.out.println(" non static varible outerDemom " + count);

				System.out.println("static varible localInner " + noInner);
				System.out.println(" non static varible localInner " + countInner);

				System.out.println("static varible localInner=>show() " + company);
				System.out.println(" non static varible localInner=>show() " + place);

				System.out.println("method parameter " + num);
			}

			public static void print() {

				class LocalOuter {
					int countInner = 25;
					static int noInner = 89;

					public void show() {
						String company = "luminar";
						// static String place="kochi";only access modifier for local varible is final
						final String place = "kochi";
						System.out.println("static varible outerDemom " + no);
						// System.out.println(" non static varible outerDemom "+count); non static cant
						// be called

						System.out.println("static varible localInner " + noInner);
						System.out.println(" non static varible localInner " + countInner);

						System.out.println("static varible localInner=>show() " + company);
						System.out.println(" non static varible localInner=>show() " + place);

						System.out.println("method parameter " + num);
					}
				}
			}

		}
		LocalInner li = new LocalInner();
		li.show();
		LocalInner.print();
	}

public class LocalInnerClassDemo {

	public static void main(String[] args) {
		OuterDemo obj =new OuterDemo();
		obj.display(10);
		

	}

}

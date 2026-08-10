package stringpack;

public class StringBufferBuilderCapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("luminar ");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("teachnolab");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}

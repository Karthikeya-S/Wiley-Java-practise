package wiley_core_java;

public class StringBufferClass {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		StringBuffer sb2 = new StringBuffer("Wiley");
		System.out.println(sb.equals(sb1));
		System.out.println(sb2);
		
		String ss = "Wiley";
		System.out.println(ss.equals(sb.toString()));
		
		String sk = "Wiley";
		System.out.println(ss.equals(sk));
		
		System.out.println(sb.insert(5," Edge"));
		
		System.out.println(sb.delete(5,9));
		System.out.println(sb.reverse());
	}
}

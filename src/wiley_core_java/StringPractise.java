package wiley_core_java;
public class StringPractise {
	public static void main(String[] args) {
		String s1 = "Wiley";
		String s2 = "Wiley";
		
		String s3 = new String("Wiley");
		String s4 = new String("Wiley");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		String str = "Karthikeya S";
		String str1 = "Karthik Selva";
		
		String str2 =str.concat(" "+str1);
		
		String str3 = str2.replace('K','L');
		
		String[] st = str.split("");
		
		String fname = "Karthi";
		String mname = "Keya";
		String lname = "Sundar";
		String s5 = "";
		
		String userInput = "Mobile";
		
		System.out.println(str.charAt(0));
		System.out.println(str.length()+" "+str1.length());
		System.out.println(str2);
		System.out.println(str3);
		for(String string: st) {
			System.out.print(string+" ");
		}
		System.out.println();
		System.out.println(s5.concat(fname).concat(mname).concat(" ").concat(lname));
		System.out.println(userInput.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(0, 5));
	}
}
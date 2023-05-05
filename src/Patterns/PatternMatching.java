package Patterns;
import java.util.regex.*;
public class PatternMatching {
	public static void main(String[] args) {
		String input = "Karthikeya is a good boy.";
		Pattern pattern = Pattern.compile("good");
		Matcher matcher = pattern.matcher(input);
//		System.out.println(matcher);
		boolean ans = matcher.find();
		if(ans) {
			int start = matcher.start();
			int end = matcher.end();			
			System.out.println("From Index: "+start+" to: "+(end-1));
		}
		System.out.println(matcher.find());
		
		//case sensitive
		
		String str1 = "Let's LEARN java together.";
		Pattern pat1 = Pattern.compile("learn", Pattern.CASE_INSENSITIVE);
		Matcher mat1 = pattern.matcher(str1);
		System.out.println(mat1.find());
	}
}
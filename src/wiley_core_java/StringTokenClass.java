package wiley_core_java;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
public class StringTokenClass {
	public static void main(String[] args) throws Exception{
		StringTokenizer st = new StringTokenizer("My name is Karthikeya S");
		String input = " My, Name, is, Karthikeya, S";
		StringTokenizer st1 = new StringTokenizer(input,",");
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextToken().trim());
		}
		try {
			System.out.println(st.nextToken());
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		System.out.println("Program close");
	}
}

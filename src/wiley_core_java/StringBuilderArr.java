package wiley_core_java;
import java.util.ArrayList;
public class StringBuilderArr {
	public static void main(String[] args) {
		ArrayList<StringBuilder> al = new ArrayList<>();
		StringBuilder sb = new StringBuilder("Karthikeya");
		al.add(sb);
		for(int i=0;i<al.size();i++) {
			System.out.println(al);
		}
	}
}

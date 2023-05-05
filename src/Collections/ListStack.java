package Collections;

import java.util.Stack;

public class ListStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(null);
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(1);
		st.push(null);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
	}
}
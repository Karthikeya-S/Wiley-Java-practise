package Collections;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> objs = new Stack<>();
		System.out.println(objs.isEmpty());
		int size = 1000000;
		long st = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			objs.add(i);
		}
		long en = System.currentTimeMillis();
		System.out.println(en-st);
	}
}

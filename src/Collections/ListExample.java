package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		List<Integer> li1 = new LinkedList<>();
		List<Integer> li2 = new Vector<>();
		List<Integer> li3 = new Stack<>();
		
		System.out.println(li);
		System.out.println(li1);
		System.out.println(li2);
		System.out.println(li3);
	}
}

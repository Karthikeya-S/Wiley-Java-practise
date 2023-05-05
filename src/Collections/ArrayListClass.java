package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add("a");
//		al.add("b");
//		al.add("c");
//		al.add("d");
//		al.add(1.25);
//		al.add("e");
//		System.out.println(al);
		
		ArrayList<String> als = new ArrayList<>();
		als.add("A");
//		System.out.println(als.remove(0));;
		
		List<Integer> firstfivepn = new ArrayList<>();
		firstfivepn.add(2);
		firstfivepn.add(3);
		firstfivepn.add(5);
		firstfivepn.add(7);
		firstfivepn.add(11);
		
		List<Integer> firstten = new ArrayList<>(firstfivepn);
		
		List<Integer> nextfive = new ArrayList<>();
		
		nextfive.add(13);
		nextfive.add(17);
		nextfive.add(19);
		nextfive.add(23);
		nextfive.add(29);
		
		firstten.addAll(nextfive);
		System.out.println(firstten);
		
		List<Integer> al1 = new ArrayList<>();
		al1.add(1);
		al1.add(1);
		al1.add(1);
		al1.add(1);
		al1.add(1);
		
		List<Integer> parent = new ArrayList<>();
		parent.addAll(0, al1);
		parent.addAll(1, nextfive);
		System.out.println(parent);
		
	}

}

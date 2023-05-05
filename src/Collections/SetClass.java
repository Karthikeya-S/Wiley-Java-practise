package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("Basic Java");
		hs.add("Core Java");
		hs.add("Advance Java");
		//System.out.println(hs);
		
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		Set<String> hs1 = new TreeSet<>();
		hs1.addAll(al);
		////System.out.println(hs1);
		
		//LinkedHashSet
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		lhs.add("F");
		
		//System.out.println(lhs);
		
		//Treeset
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("h");
		ts.add("a");
		ts.add("b");
		ts.add("w");
		
		System.out.println(ts);
		System.out.println(ts.headSet("h"));
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.pollFirst());
		System.out.println(ts.last());
		System.out.println(ts.tailSet("a"));
		
		System.out.println(ts.last().compareTo(ts.first()));
	}
}

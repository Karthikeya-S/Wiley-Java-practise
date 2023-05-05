package Collections;

import java.util.NavigableSet;
import java.util.TreeSet;
 
public class navigable {
    public static void main(String[] args) {
    	NavigableSet<String> ns = new TreeSet<String>();
    	ns.add("A");
    	ns.add("B");
    	ns.add("C");
    	ns.add("D");
    	System.out.println(ns);
    }
}
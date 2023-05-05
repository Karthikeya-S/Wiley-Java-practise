package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class Myclass implements Comparator<Integer>{
	@Override
	public int compare(Integer ob1, Integer ob2) {
		
		return ob1.compareTo(ob2);
//		if(ob1>ob2) {
//			return -1;
//		}
//		else if(ob1<ob2) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
	}
}
public class ComparableClass {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(new Myclass());
		ts.add(4);
		ts.add(2);
		ts.add(1);
		System.out.println(ts);
	}
}

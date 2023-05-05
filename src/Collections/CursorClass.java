package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class CursorClass {
	public static void main(String[] args) {
		Vector<String> vt = new Vector<>();
		vt.addElement("a");
		vt.addElement("a");
		vt.addElement("a");
		vt.addElement("a");
		vt.addElement("a");
		
		Enumeration<String> enums = vt.elements();
		System.out.println(enums);
	}
}

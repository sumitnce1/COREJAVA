package Collections;

import java.util.*;
public class DemoCol1 {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("ban");
		l.add("ban1");
		l.add(null);
		l.add(456);
		l.add(45.98);
		l.add("ban");
		l.add(null);
		System.out.println(l);
		l.remove("ban");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		l.add(2, "PC");
		System.out.println(l);
	}

}

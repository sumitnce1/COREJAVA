package Collections;
import java.util.*;
import java.util.HashSet;

public class DemoSet1 {

	public static void main(String[] args) {
		HashSet h= new HashSet();
		System.out.println(h.add("A"));
//		h.add("A");
		h.add("B");
		h.add(null);
		h.add(455);
		System.out.println(h);
		h.add("B");
		System.out.println(h);

	}

}
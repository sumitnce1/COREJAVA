package Collections;
import java.util.*;
public class DemoColl2 {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add(12);
		l.add("array");
		l.add(null);
		l.add("array");
		System.out.println(l);
		l.set(0, "software");
		//System.out.println(l);
		//l.add(1,"System");
//		l.removeLast();
//		l.removeFirst();
		l.addFirst(2345);
		l.addLast(34343);
		System.out.println(l);

	}

}

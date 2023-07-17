package Collections;
import java.util.*;
public class DemoSet2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(234);
		t.add(94);
		t.add(34);
		t.add(4);
		t.add(543);
		t.add(87);
		t.add(12);
//		System.out.println(t.first());
//		System.out.println(t.last());
//		System.out.println(t.headSet(94));
		System.out.println(t.subSet(12,234));
		System.out.println(t);
	}
}
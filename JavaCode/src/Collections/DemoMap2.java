package Collections;
import java.util.*;
public class DemoMap2 {

	public static void main(String[] args) {
			TreeMap m=new TreeMap();
			m.put(101,  "A");
			m.put(106,  "B");
			m.put(104,  4567);
//			System.out.println(m);
			m.put(76,null);
			System.out.println(m);
			System.out.println(m.subMap(76, 104));

	}

}

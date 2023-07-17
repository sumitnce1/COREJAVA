package Collections;
import java.util.*;
public class DemoMap1 {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Vena", 12);
		h.put("ram", 23);
		h.put("ritu", 34);
		h.put("rihan", 45);
//		System.out.println(h);
//		h.put("ritu",567);
//		h.put("ritu",98);
//		Set s= h.keySet();
		Set s=h.entrySet();
		System.out.println(s);
		System.out.println(h);
	}

}